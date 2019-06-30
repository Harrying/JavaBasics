package day23.com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

import day22.com.briup.bean.Student;

public class Test3_Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("�������Ѿ��������˿� 9999 ....");
		
		
		while(true) {
			
		Socket socket = server.accept();
		outIpAndPort(socket);
		
		Thread th = new MyThread(socket);
		th.start();
		
		}
		
		
	}
	private static void outIpAndPort(Socket socket) {
		String hostAddr = socket.getInetAddress().getHostAddress();
		int port = socket.getPort();
		
		System.out.println("Զ��ip��ַ��" +  hostAddr);
		System.out.println("Զ�̶˿ںţ�" + port);
		
		System.out.println("����ip��ַ��" +  socket.getLocalAddress().getHostAddress());
		System.out.println("���ض˿ںţ�" + socket.getLocalPort());
		
		
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
		try {
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String line ;
			line = br.readLine();
			System.out.println("�������ȫ����"+line);
			
					
			Class c = Class.forName(line);			
			Constructor<?> con =  c.getConstructor();
			
			Student s = (Student) con.newInstance();
			
			String line1 = null;
			line1 = br.readLine();
			System.out.println("¼������setName.Jack���ַ�����"+line1);
			String[] spl = line1.split("\\.");
			
			Method method = c.getMethod(spl[0], String.class);
			
			method.invoke(s, spl[1]);
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
