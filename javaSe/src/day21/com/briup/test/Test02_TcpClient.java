package day21.com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 	1.搭建客户端，连接到服务器
 * 	2.发送个信息给服务器
 * 	3.从服务器接收  信息
 * 	4.关闭资源
 */
public class Test02_TcpClient {
	public static void main(String[] args) throws Exception {
		//1. 实例化对象，就自动往服务器 进行 连接
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("客户端启动，连接到9999 成功...");
		
		//2.获取数据传递的流
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		//3.发送数据到服务器
		os.write("你好，Server!".getBytes());
		
		//4.接收服务器返回的数据
		byte[] buff = new byte[1024];
		int len = is.read(buff);
		System.out.println("从服务器收到数据: " + new String(buff,0,len));
		
		//5.关闭资源
		socket.close();
	}
}






