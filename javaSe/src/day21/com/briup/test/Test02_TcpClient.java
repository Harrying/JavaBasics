package day21.com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 	1.��ͻ��ˣ����ӵ�������
 * 	2.���͸���Ϣ��������
 * 	3.�ӷ���������  ��Ϣ
 * 	4.�ر���Դ
 */
public class Test02_TcpClient {
	public static void main(String[] args) throws Exception {
		//1. ʵ�������󣬾��Զ��������� ���� ����
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("�ͻ������������ӵ�9999 �ɹ�...");
		
		//2.��ȡ���ݴ��ݵ���
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		//3.�������ݵ�������
		os.write("��ã�Server!".getBytes());
		
		//4.���շ��������ص�����
		byte[] buff = new byte[1024];
		int len = is.read(buff);
		System.out.println("�ӷ������յ�����: " + new String(buff,0,len));
		
		//5.�ر���Դ
		socket.close();
	}
}






