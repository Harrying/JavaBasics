package day21.com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 搭建一个TCP服务器，接收TCP客户端的连接
 * 	此处用浏览器 模拟 TCP客户端
 * 	浏览器使用HTTP协议传输数据，属于TCP/IP协议族
 */
public class Test01_TcpServer {
	public static void main(String[] args) throws IOException {
		//1.实例化 服务器套接字对象
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器启动成功，端口号为9999 ...");
		
		//2.接收客户端的连接,
		//	accept方法，如果有客户端连接，返回新socket; 如果没有，等待
		Socket socket = server.accept();
		System.out.println("成功接收到客户端的连接...");
		
		//3.获取通信的io流对象
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		//4.先接收客户端发送 的信息
		byte[] buf = new byte[1024];
		//读取数据时候，如果有数据发送过来，则直接读取返回; 如果没有，等待
		int len = is.read(buf);
		String str = new String(buf,0,len);
		System.out.println("收到客户端发送数据: ");
		System.out.println(str);
		
		System.out.println("*****************");
		
		//返回给客户端信息
		os.write("hello client".getBytes());
		
		//5.关闭资源
		socket.close();
		server.close();
		
		//浏览器访问该程序 http://127.0.0.1:9999
	}
}








