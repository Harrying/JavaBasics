package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 
 * ���Ҫ������ļ�����a.txt b.txt c.txt ���մ��� д�뵽��һ���ļ���
 * �Ƽ�ʹ��������
 */
public class Test01_Append {
	
	//��д��
	public static void main(String[] args) throws Exception {
		//1.�򿪶�Ӧ����
		FileInputStream fis1 = new FileInputStream("src/a.txt");
		FileInputStream fis2 = new FileInputStream("src/b.txt");
		FileInputStream fis3 = new FileInputStream("src/c.txt");
		FileOutputStream fos = new FileOutputStream("src/d.txt");
		
		Vector<InputStream> vector = new Vector<>();
		vector.addElement(fis1);
		vector.addElement(fis2);
		vector.addElement(fis3);
		
		Enumeration<InputStream> elements = vector.elements();
		
		//ʵ���������������� ���ϵ����г�Ա[����������fis]
		SequenceInputStream sis = 
				new SequenceInputStream(elements);
		
		byte[] buff = new byte[12];
		int len;
		while((len = sis.read(buff)) != -1) {
			fos.write(buff,0,len);
		}
		
		//3.�ر���
		fos.close();
		sis.close();
	}
	
	public static void main2(String[] args) throws Exception {
		//1.��������
		FileInputStream fis1 = new FileInputStream("src/a.txt");
		FileInputStream fis2 = new FileInputStream("src/b.txt");
		FileInputStream fis3 = new FileInputStream("src/c.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		SequenceInputStream sis2 = 
				new SequenceInputStream(sis, fis3);
		
		FileOutputStream fos = new FileOutputStream("src/d.txt");
		
		//2.����ַ����鿽�����ֽ��������ֽ����顿
		byte[] buff = new byte[12];
		int len;
		while((len = sis2.read(buff)) != -1) {
			fos.write(buff,0,len);
		}
		
		//3.�ر���
		fos.close();
		sis2.close();
		
	}
	
	/*
	 * ��a.txt������d.txt
	 * Ȼ��b.txt׷�ӵ�d.txt
	 */
	public static void main1(String[] args) throws Exception {
		//1.�����ļ�����
		FileReader fr1 = new FileReader("src/a.txt"); 
		FileWriter fw = new FileWriter("src/d.txt");
		
		//2.С���鿽��
		char[] buff = new char[12];
		int len;
		
		while((len = fr1.read(buff)) != -1) {
			fw.write(buff,0,len);
		}
		
		//3.�ر���Դ
		//fw.close();
		fr1.close();
		
		//4.�ڿ�����һ���ļ�
		FileReader fr2 = new FileReader("src/b.txt"); 
		//								д�� ʱ�� ׷�ӣ�����Ĭ�� ����
		//FileWriter fw2 = new FileWriter("src/d.txt",true);
		
		//5.
		while((len = fr2.read(buff)) != -1) {
			fw.write(buff,0,len);
		}
		
		//6
		fw.close();
		fr2.close();
	}
}








