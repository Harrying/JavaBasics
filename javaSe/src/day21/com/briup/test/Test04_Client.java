package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * 	���ӵ�������
	
ѭ��¼�� ���� ����
	�Ӽ���¼���ַ���������quit�˳�
	���ַ������͵�������	"����quit"
	�ӷ��������� ���ص��ַ���
 */
public class Test04_Client {
	public static void main(String[] args) throws Exception {
		//1.�����ͻ������ӵ�������
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("�ͻ������� ���������ɹ�...");
		
		//2.��ȡ������ �����а�װ��ǿ
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		InputStreamReader isr = new InputStreamReader(is);
		//�ܹ����ж�ȡ
		BufferedReader br = new BufferedReader(isr);
		//�ܹ�����д���ַ���Ҳ���Բ����ֽ�
		PrintStream ps = new PrintStream(os);
		
		//3.�Ӽ���ѭ��¼��
		Scanner sc = new Scanner(System.in);
		String line;
		while(true) {
			System.out.println("��¼��һ������: ");
			line = sc.nextLine();
			
			//�Ƚ�¼������ݷ��͵�������
			ps.println(line);
			System.out.println("���� " + line + " ��������");
			
			//�ж��Ƿ����¼��
			if("quit".equals(line)) {
				break;
			}
			
			//�ӷ�������������
			line = br.readLine();
			System.out.println("�ӷ�������������: " + line);
		}
		
		//4.�ر���Դ
		socket.close();
		
	}
}






