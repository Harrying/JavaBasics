package day16.com.briup.test;
/*
 * ����InputStream��������
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test01_fileInPutStream {
	//ѭ����ȡ �����ļ�
	public static void main(String[] args)throws Exception {
		InputStream is = new FileInputStream("d:\\sss\\444.txt");
		
		//ѭ��
		int n;
		while(true) {
			n = is.read();
			
			if(n == -1)
				break;
			System.out.print((char)n);
		}
		System.out.println();
		
		
		is.close();
	}
	
	
	
	
	//��������
	public static void main1(String[] args) throws Exception {
		//1.ʵ����������
		//  ע�⣺���������ļ���һ��ҪFileXxxStream;
		// IO������ÿһ����������쳣
		InputStream is = new FileInputStream("d:\\sss\\444.txt");
		
		//2.ͨ���������������
		//һ�ζ�ȡһ���ֽ�
		int n = is.read();
		System.out.println("read :" + n);
		n = is.read();
		System.out.println("read :" + n);
		n = is.read();
		System.out.println("read :" + n);
		n = is.read();
		System.out.println("read :" + n);
		//���һ�ζ�ȡ  ��ȡ���ļ�ĩβ ����-1
		
	
		//�ر���
		is.close();
	}
	
}
