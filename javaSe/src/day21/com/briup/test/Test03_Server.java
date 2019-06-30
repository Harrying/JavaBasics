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
 * ���տͻ��˵�����
	
ѭ����ȡ����ת������
	read�ͻ��˷��͹������ַ���
	Ȼ���ַ�����ת�����Ӹ��ͻ��ˡ�
	
	�ж��յ����ͷ�Ϊ"quit"������ǣ�������ѭ�����ر���Դ��
 */
public class Test03_Server {
	public static void main(String[] args) throws Exception {
		//1.����������Լ�ָ���˿�
		ServerSocket server = new ServerSocket(9999);
		
		//2.��ȡ�ͻ��˵�����
		Socket socket = server.accept();
		
		//3.��ȡio���������а�װ����ǿ����
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(is);
		//�ܹ����ж�ȡ
		BufferedReader br = new BufferedReader(isr);
		//�ܹ�����д���ַ���Ҳ���Բ����ֽ�
		PrintStream ps = new PrintStream(os);
		
		//4.�������ݡ���ת��Ȼ�󷵻ظ��ͻ���
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
		
		//5.�ر���Դ
		socket.close();
		server.close();
	}
}





