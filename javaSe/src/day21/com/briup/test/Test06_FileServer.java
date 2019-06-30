package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 搭建服务器，接收客户端发送的文件并保存
 * 	1.搭建服务器 接收客户端连接
 * 	2.接收客户端 发送的 文件名
 * 	3.判断src下是否存在该文件，并返回对应信息
 * 	4.	如果已经存在，程序结束
 * 		如果不存在，从客户端接收 发送过来的数据
 * 	5.关闭资源
 */
public class Test06_FileServer {
	public static void main(String[] args) throws Exception {
		//1.搭建服务器
		ServerSocket server = new ServerSocket(9999);

		//2.接收客户端连接
		Socket socket = server.accept();
		
		//3.获取对应的操作流
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		//4.先去接收客户端发送的文件名，然后判断src目录下是否存在
		String line = br.readLine();
		System.out.println("从客户端收到文件名: " + line);
		
		File file = new File("src",line);
		if(file.exists() && file.isFile()) {
			//返回文件存在
			ps.println("存在");
			
			//关闭资源程序终止
			socket.close();
			server.close();
			return;
		}else {
			ps.println("不存在");
		}
		
		//接收从客户端发送过来的文件内容
		// 然后 将 读取的内容 写入到本地文件
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		//数据全部存入本地文件，关闭资源 退出
		bw.close();
		socket.close();
		server.close();
	}
}








