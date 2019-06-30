package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ׼��һ��mp3�ļ���ͨ��С����byte[1024] ����
 * 					ͨ������ֽڿ������۲�  Ч��
 * 					��ʱ��System.currentTimeMillis()
 */
public class Test06_CopyMp3 {
	//С���� ����
	public static void main(String[] args) throws Exception {
		
		//1.������������ļ�
		InputStream is = new FileInputStream("src\\day16\\com\\briup\\1.mp3");
		OutputStream os = new FileOutputStream("src\\day16\\com\\briup\\2.mp3");
		
		//2.���ݿ��� С���鿽��
		long start = System.currentTimeMillis();
		byte[] array = new byte[1024 * 8];
		int len;
		while((len = is.read(array)) != -1) {
			os.write(array,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("ʹ�õĺ���: " + (end - start));
		
		//3.�ر������� �ͷ���Դ
		os.close();
		is.close();
	}
	
	public static void main1(String[] args) throws Exception {
		
		//1.������������ļ�
		InputStream is = new FileInputStream("src\\day16\\com\\briup\\1.mp3");
		OutputStream os = new FileOutputStream("src\\day16\\com\\briup\\2.mp3");
		
		//2.���ݿ��� �����ֽ��������
		long start = System.currentTimeMillis();
		int data;
		while((data = is.read()) != -1) {
			os.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("ʹ�õĺ���: " + (end - start));
		
		//3.�ر������� �ͷ���Դ
		os.close();
		is.close();
	}
}






