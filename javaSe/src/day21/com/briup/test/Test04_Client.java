package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * 	连接到服务器
	
循环录入 发送 接收
	从键盘录入字符串，遇到quit退出
	将字符串发送到服务器	"发送quit"
	从服务器接收 返回的字符串
 */
public class Test04_Client {
	public static void main(String[] args) throws Exception {
		//1.启动客户端连接到服务器
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("客户端连接 到服务器成功...");
		
		//2.获取流对象 并进行包装增强
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		InputStreamReader isr = new InputStreamReader(is);
		//能够逐行读取
		BufferedReader br = new BufferedReader(isr);
		//能够逐行写入字符，也可以操作字节
		PrintStream ps = new PrintStream(os);
		
		//3.从键盘循环录入
		Scanner sc = new Scanner(System.in);
		String line;
		while(true) {
			System.out.println("请录入一行数据: ");
			line = sc.nextLine();
			
			//先将录入的数据发送到服务器
			ps.println(line);
			System.out.println("发送 " + line + " 到服务器");
			
			//判断是否结束录入
			if("quit".equals(line)) {
				break;
			}
			
			//从服务器接收数据
			line = br.readLine();
			System.out.println("从服务器接收数据: " + line);
		}
		
		//4.关闭资源
		socket.close();
		
	}
}






