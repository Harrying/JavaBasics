package day18.com.briup.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

/*
 * �򵥲���
 */
public class Test08_printStream {
	
	public static void main(String[] args) throws Exception {
		BufferedReader bd  = new BufferedReader(new FileReader("src/a.txt"));
		
		PrintStream ps = new PrintStream("src/b.txt");
		
		String line = null;
		
		while((line = bd.readLine()) != null) {
			boolean f = bd.ready();//�ж������Ƿ�������
			if(f) {
				ps.println(line);
			}else {
				ps.print(line);
			}
			
		}
		
		ps.close();
		bd.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//ͨ����ӡ��  ��a.txt��д�����
	public static void main1(String[] args) throws Exception {
		//1.����������
		PrintStream ps = new PrintStream("src/a.txt");
		
		//�����Զ�ˢ�¹���
		//2.д�����ݵ��ļ���
		ps.write(97);
		
		ps.print("��ΪMateBook14");
		ps.println("����618");
		
	}
}
