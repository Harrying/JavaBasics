package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ������������տͻ��˷��͵��ļ�������
 * 	1.������� ���տͻ�������
 * 	2.���տͻ��� ���͵� �ļ���
 * 	3.�ж�src���Ƿ���ڸ��ļ��������ض�Ӧ��Ϣ
 * 	4.	����Ѿ����ڣ��������
 * 		��������ڣ��ӿͻ��˽��� ���͹���������
 * 	5.�ر���Դ
 */
public class Test06_FileServer {
	public static void main(String[] args) throws Exception {
		//1.�������
		ServerSocket server = new ServerSocket(9999);

		//2.���տͻ�������
		Socket socket = server.accept();
		
		//3.��ȡ��Ӧ�Ĳ�����
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		//4.��ȥ���տͻ��˷��͵��ļ�����Ȼ���ж�srcĿ¼���Ƿ����
		String line = br.readLine();
		System.out.println("�ӿͻ����յ��ļ���: " + line);
		
		File file = new File("src",line);
		if(file.exists() && file.isFile()) {
			//�����ļ�����
			ps.println("����");
			
			//�ر���Դ������ֹ
			socket.close();
			server.close();
			return;
		}else {
			ps.println("������");
		}
		
		//���մӿͻ��˷��͹������ļ�����
		// Ȼ�� �� ��ȡ������ д�뵽�����ļ�
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		//����ȫ�����뱾���ļ����ر���Դ �˳�
		bw.close();
		socket.close();
		server.close();
	}
}








