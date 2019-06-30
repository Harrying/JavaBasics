package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 创建一个服务器，可以同时为多个客户端 提供服务
 * 	先接收客户端的信息
 * 	然后 将信息反转
 * 	最后 发送反转的信息给客户端 
 */
public class Test05_ServerThread {
	public static void main(String[] args) throws Exception {
		//1.实例化一个服务器socket
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器已经启动，端口 9999 ....");
		
		//2.接收客户端的连接【循环接收】
		while(true) {
			Socket socket = server.accept();
			
			//输出 双方的ip和port信息
			outIpAndPort(socket);
			
			//分离子线程，专门为该客户端提供服务
			Thread th = new MyThread(socket);
			th.start();
		}
	}

	private static void outIpAndPort(Socket socket) {
		//获取远程的ip地址 和 port号
		String hostAddr = socket.getInetAddress().getHostAddress();
		int port = socket.getPort();

		System.out.println("hostAddr: " + hostAddr);
		System.out.println("port: " + port);
		
		//获取本地ip port
		String localAddr = socket.getLocalAddress().getHostAddress();
		int localPort = socket.getLocalPort();
		System.out.println("本地: " + localAddr + " " + localPort);
	}
}

class MyThread extends Thread {
	private Socket socket;
	
	public MyThread() {}
	
	public MyThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		//获取输入输出流
		try {
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			PrintStream ps = new PrintStream(socket.getOutputStream());
			
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
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}




