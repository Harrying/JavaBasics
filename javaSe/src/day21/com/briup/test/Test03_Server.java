package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 接收客户端的连接
	
循环读取，反转，发送
	read客户端发送过来的字符串
	然后将字符串反转，发挥给客户端。
	
	判断收到的释放为"quit"，如果是，则跳出循环，关闭资源。
 */
public class Test03_Server {
	public static void main(String[] args) throws Exception {
		//1.搭建服务器，自己指定端口
		ServerSocket server = new ServerSocket(9999);
		
		//2.获取客户端的连接
		Socket socket = server.accept();
		
		//3.获取io流，并进行包装，增强功能
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(is);
		//能够逐行读取
		BufferedReader br = new BufferedReader(isr);
		//能够逐行写入字符，也可以操作字节
		PrintStream ps = new PrintStream(os);
		
		//4.接收数据、反转，然后返回给客户端
		String line;
		while(true) {
			//读取数据
			line = br.readLine();
			System.out.println("从客户端读取到的值: " + line);
			if("quit".equals(line))
				break;
			
			//反转字符串
			StringBuffer sb = new StringBuffer(line);
			line = sb.reverse().toString();
			System.out.println("反转后的值: " + line);
			
			//返回给客户端
			ps.println(line);
		}
		
		//5.关闭资源
		socket.close();
		server.close();
	}
}





