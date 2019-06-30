package day21.com.briup.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/*
 * 创建一个服务器，可以同时为多个客户端 提供服务
 * 	先接收客户端的信息
 * 	然后 将信息反转
 * 	最后 发送反转的信息给客户端 
 */
public class Work2_Server2_2 {
	public static void main(String[] args) throws Exception {
		//1.实例化一个服务器socket
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器已经启动，端口 9999 ....");
		
		//2.接收客户端的连接【循环接收】
		while(true) {
			Socket socket = server.accept();
			Thread th = new MyThread(socket);
			th.start();
		}
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
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			List<Student> list = (List<Student>) ois.readObject();
			for (Student s : list) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
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




