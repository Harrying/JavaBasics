package day17.com.briup.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * ֻҪ�� ��ȡ��д��  �����������⣬
 * ԭ��϶��ǲ������ļ� �� ����ı��벻һ�¡�
 * �ļ�����:  ͨ���ļ������Բ鿴
 * �������:  ͨ��java�ļ����Բ鿴
 * 
 * ת����:
 * 	InputStreamReader
 * 	OutputStreamWriter
 */
public class Test06_��� {
	public static void main(String[] args) throws Exception {
		
		//ʵ�����������ʱ��ָ�������
		//Reader r = new FileReader("src/a.txt");
		
		//��ǿ��: ת���ֽ������ú����� �����û�ָ���������� ���롿
		InputStream is = new FileInputStream("src/a.txt");
		Reader r = new InputStreamReader(is, "utf-8");
		
		int ch;
		while((ch = r.read()) != -1) {
			System.out.println("ch: " + ch + " " + (char)ch);
		}
		
		r.close();
	}
}
