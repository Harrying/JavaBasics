package day17.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * �����ַ��� 		ֻ�ܲ���  ���ı��ļ�
 * 					���Բ���  �����������ļ�
 */
public class Test02_Copy {
	public static void main(String[] args) {
		Reader r = null;
		Writer w = null;
		
		try {
			//	�������ı��ļ���û������
			//	�ܷ񿽱� �������ļ�  1.png   14381�ֽ�
			//1.���������� �� �ļ�	  2.png	  14362�ֽ�
			r = new FileReader("src/1.png");
			w = new FileWriter("src/2.png");
			
			//2.����
			//	����ַ�����
			//	С���鿽��
			int data;
			while((data = r.read()) != -1) {
				w.write(data);
			}
			System.out.println("�����Ѿ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ر�����ÿһ������.close��Ҫtry-catch��
			try {
				if(w != null)
					w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(r != null)
					r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}






