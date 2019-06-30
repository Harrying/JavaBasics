package day16.com.briup.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/*
 * ������ ����ֽڿ���  mp3�ļ�
 */
public class Test07_Buffered {
	public static void main(String[] args) throws Exception {
		//���Ҫ���������ļ�  ����ͨ�� FileXxxStream
		InputStream is = 
				new FileInputStream("src\\day16\\com\\briup\\1.mp3");
		BufferedInputStream bis = new BufferedInputStream(is);
		
		BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("src\\day16\\com\\briup\\3.mp3"));
		
		//2.����ֽڿ���
		long start = System.currentTimeMillis();
		int data;
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("ʹ�õĺ���: " + (end - start));
		
		//3.ֻ��Ҫ�ر�  ��װ��ǿ�����Զ��ر� ������
		bos.close();
		bis.close();
	}
}







