package day17.com.briup.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * �����ַ�������      ֻ�ܿ��� ���ı��ļ�
 * 			���ܴ���������ļ�
 */
public class Test02_���� {
	public static void main(String[] args) throws Exception {
		//1.����������
		Reader r = null;
		Writer w = null;
		try {
			r = new FileReader("src/1.jpg");

			w = new FileWriter("src/2.jpg");

			int data;
			while ((data = r.read()) != -1) {
				w.write(data);
			}

			System.out.println("�����Ѿ����");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		} finally {
			//ÿһ�������close  ����Ҫtry-catch
			try {
				if(w != null)
					w.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(w != null)
					r.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}		
		}
	}
}
