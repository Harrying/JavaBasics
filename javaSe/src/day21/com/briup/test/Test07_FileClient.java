package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/*
 * 文件客户端
 * 	先发送文件名给服务器
 * 	收取服务器返回 是否存在信息
 * 	然后再发送文件内容给服务器
 */
public class Test07_FileClient {
	public static void main(String[] args) throws Exception {
		//1.
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("连接到服务器9999....");
		
		//2.
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		InputStreamReader isr = new InputStreamReader(is);
		//能够逐行读取
		BufferedReader br = new BufferedReader(isr);
		//能够逐行写入字符，也可以操作字节
		PrintStream ps = new PrintStream(os);
	
		//3.发送文件名到 服务器
		String filePath = "E://a//a.txt";
		File file = new File(filePath);
		if(file.exists() == false || file.isFile() == false) {
			socket.close();
			return;
		}

		String fileName = file.getName();
		ps.println(fileName);
		
		//4.接收服务器的返回信息
		String msg = br.readLine();
		System.out.println("msg: " + msg);
		if("存在".equals(msg)) {
			socket.close();
			return;
		} 
		
		//5.打开本地文件 ， 传输文件内容到服务器
		FileReader fr = new FileReader(file);
		BufferedReader br2 = new BufferedReader(fr);
		String line;
		while((line = br2.readLine()) != null) {
			ps.println(line);
		}
		
		System.out.println("文件内容已经全部发送!");
		//关闭本地文件 相关流
		br2.close();
		
		//6.关闭 套接字，结束传输
		socket.close();
	}
}






