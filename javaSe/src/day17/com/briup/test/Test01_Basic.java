package day17.com.briup.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/*
 * �Ա��ֽ��� �ַ��� ��ȡ�ļ������
 * 	�Ƿ������������  src/a.txt
 * 
 * �������ı��ļ���ֻҪͨ�� �ַ������ɣ�Ч���Եͣ����Ƿ���
 */
public class Test01_Basic {
	
	//2.С���� �ַ��� ��ȡ�ļ�������������쳣��
	public static void main(String[] args) {
		//Reader������   FileReader�ļ������ַ���
		Reader r = null;
		try {
			//1.
			r = new FileReader("src/a.txt");
			
			//С�����ȡ
			char[] buff = new char[6];
			int len;
			while((len = r.read(buff)) != -1) {
				System.out.println(new String(buff,0,len));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ͷ���Դ
			try {
				if(r != null)
					r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//1.С����  �ֽ�¥ ��ȡ������Լ������쳣����
	public static void main1(String[] args) {
		InputStream is = null;
		try {
			//1.����������� �ļ�
			//try���з�����Գ����쳣�Ĵ���
			//	ioÿһ����������쳣
			is = new FileInputStream("src/a.txt");
			
			//2.С�����ȡ
			byte[] buf = new byte[6];
			int len;
			while((len = is.read(buf)) != -1) {
				//�����ȡ���� �ֽ� --> char --> String ����
				System.out.println(new String(buf,0,len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ر���Դ
			try {
				if(is != null)
					is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}








