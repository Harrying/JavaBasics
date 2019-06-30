package day16.com.briup.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Test08_Flush {
	public static void main(String[] args) throws Exception {

		//1.���� ����������  �� �����ļ�
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream("src\\day16\\com\\briup\\1.png"));
		BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("src\\day16\\com\\briup\\2.png"));
		
		//2.С���鿽��
		byte[] buff = new byte[1024];
		int len;
		while((len = bis.read(buff)) != -1) {
			bos.write(buff, 0, len);
		}
		//ͨ������Ա��������flushˢ�»�����
		bos.flush();
		
		//3.��Ҫ�ر�bos
		bos.close();//�ر� ������������Զ�ˢ�»�����
		bis.close();
	}
}






