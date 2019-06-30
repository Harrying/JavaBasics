package day21.com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * �һ��TCP������������TCP�ͻ��˵�����
 * 	�˴�������� ģ�� TCP�ͻ���
 * 	�����ʹ��HTTPЭ�鴫�����ݣ�����TCP/IPЭ����
 */
public class Test01_TcpServer {
	public static void main(String[] args) throws IOException {
		//1.ʵ���� �������׽��ֶ���
		ServerSocket server = new ServerSocket(9999);
		System.out.println("�����������ɹ����˿ں�Ϊ9999 ...");
		
		//2.���տͻ��˵�����,
		//	accept����������пͻ������ӣ�������socket; ���û�У��ȴ�
		Socket socket = server.accept();
		System.out.println("�ɹ����յ��ͻ��˵�����...");
		
		//3.��ȡͨ�ŵ�io������
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		//4.�Ƚ��տͻ��˷��� ����Ϣ
		byte[] buf = new byte[1024];
		//��ȡ����ʱ����������ݷ��͹�������ֱ�Ӷ�ȡ����; ���û�У��ȴ�
		int len = is.read(buf);
		String str = new String(buf,0,len);
		System.out.println("�յ��ͻ��˷�������: ");
		System.out.println(str);
		
		System.out.println("*****************");
		
		//���ظ��ͻ�����Ϣ
		os.write("hello client".getBytes());
		
		//5.�ر���Դ
		socket.close();
		server.close();
		
		//��������ʸó��� http://127.0.0.1:9999
	}
}








