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
 * ����һ��������������ͬʱΪ����ͻ��� �ṩ����
 * 	�Ƚ��տͻ��˵���Ϣ
 * 	Ȼ�� ����Ϣ��ת
 * 	��� ���ͷ�ת����Ϣ���ͻ��� 
 */
public class Work2_Server2_2 {
	public static void main(String[] args) throws Exception {
		//1.ʵ����һ��������socket
		ServerSocket server = new ServerSocket(9999);
		System.out.println("�������Ѿ��������˿� 9999 ....");
		
		//2.���տͻ��˵����ӡ�ѭ�����ա�
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
		//��ȡ���������
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




