package day16.com.briup.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * �ļ������Ļ�������ͨ�� �ļ���
 * 	FileOutputSteam
 * 	FileInputStream
 */
public class Test02_FileOutputStream {
	public static void main(String[] args) throws Exception {
		//���ļ���  ����ֽ�д������
		//1.�������� д��ʱ���ļ����Բ�����
		OutputStream os = new FileOutputStream(new File("E://a//c.txt"));
		
		//2.����ֽ�д��
		String str = "hello world";
		char[] array = str.toCharArray();
		for (char c : array) {
			//�ļ���д�룬���ļ���ʼλ�ÿ�ʼ
			os.write(c);
		}
//		os.write(97);
//		os.write('b');	//write(int);
//		os.write('c');
		
		//3.�ر���
		os.close();
		
	}
}










