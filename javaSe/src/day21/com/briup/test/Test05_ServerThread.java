package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ����һ��������������ͬʱΪ����ͻ��� �ṩ����
 * 	�Ƚ��տͻ��˵���Ϣ
 * 	Ȼ�� ����Ϣ��ת
 * 	��� ���ͷ�ת����Ϣ���ͻ��� 
 */
public class Test05_ServerThread {
	public static void main(String[] args) throws Exception {
		//1.ʵ����һ��������socket
		ServerSocket server = new ServerSocket(9999);
		System.out.println("�������Ѿ��������˿� 9999 ....");
		
		//2.���տͻ��˵����ӡ�ѭ�����ա�
		while(true) {
			Socket socket = server.accept();
			
			//��� ˫����ip��port��Ϣ
			outIpAndPort(socket);
			
			//�������̣߳�ר��Ϊ�ÿͻ����ṩ����
			Thread th = new MyThread(socket);
			th.start();
		}
	}

	private static void outIpAndPort(Socket socket) {
		//��ȡԶ�̵�ip��ַ �� port��
		String hostAddr = socket.getInetAddress().getHostAddress();
		int port = socket.getPort();

		System.out.println("hostAddr: " + hostAddr);
		System.out.println("port: " + port);
		
		//��ȡ����ip port
		String localAddr = socket.getLocalAddress().getHostAddress();
		int localPort = socket.getLocalPort();
		System.out.println("����: " + localAddr + " " + localPort);
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
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			PrintStream ps = new PrintStream(socket.getOutputStream());
			
			String line;
			while(true) {
				//��ȡ����
				line = br.readLine();
				System.out.println("�ӿͻ��˶�ȡ����ֵ: " + line);
				if("quit".equals(line))
					break;
				
				//��ת�ַ���
				StringBuffer sb = new StringBuffer(line);
				line = sb.reverse().toString();
				System.out.println("��ת���ֵ: " + line);
				
				//���ظ��ͻ���
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




