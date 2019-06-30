package day21.com.briup.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/*
 * �ļ��ͻ���
 * 	�ȷ����ļ�����������
 * 	��ȡ���������� �Ƿ������Ϣ
 * 	Ȼ���ٷ����ļ����ݸ�������
 */
public class Test07_FileClient {
	public static void main(String[] args) throws Exception {
		//1.
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("���ӵ�������9999....");
		
		//2.
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		InputStreamReader isr = new InputStreamReader(is);
		//�ܹ����ж�ȡ
		BufferedReader br = new BufferedReader(isr);
		//�ܹ�����д���ַ���Ҳ���Բ����ֽ�
		PrintStream ps = new PrintStream(os);
	
		//3.�����ļ����� ������
		String filePath = "E://a//a.txt";
		File file = new File(filePath);
		if(file.exists() == false || file.isFile() == false) {
			socket.close();
			return;
		}

		String fileName = file.getName();
		ps.println(fileName);
		
		//4.���շ������ķ�����Ϣ
		String msg = br.readLine();
		System.out.println("msg: " + msg);
		if("����".equals(msg)) {
			socket.close();
			return;
		} 
		
		//5.�򿪱����ļ� �� �����ļ����ݵ�������
		FileReader fr = new FileReader(file);
		BufferedReader br2 = new BufferedReader(fr);
		String line;
		while((line = br2.readLine()) != null) {
			ps.println(line);
		}
		
		System.out.println("�ļ������Ѿ�ȫ������!");
		//�رձ����ļ� �����
		br2.close();
		
		//6.�ر� �׽��֣���������
		socket.close();
	}
}






