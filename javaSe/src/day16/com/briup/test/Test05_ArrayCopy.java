package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ʹ��С���鿽��  �ļ�
 * 	׼��һ��mp3�ļ���ͨ��С����byte[1024] ����
 * 					ͨ������ֽڿ������۲�  Ч��
 * 					��ʱ��System.currentTimeMillis()
 */
public class Test05_ArrayCopy {
	public static void main(String[] args) throws Exception {
		//1.
		InputStream is = new FileInputStream("E://a//a.txt");
		OutputStream os = new FileOutputStream("E://a//c.txt");
		
		//2.
		byte[] array = new byte[12];
		int len;
		while((len = is.read(array)) != -1) {
			//ע��: ��ȡ���ٸ��ֽڣ���д������ֽ�
			os.write(array, 0, len);
			System.out.println("һ��д�� ...");
		}
		
		//3.
		os.close();
		is.close();
		
	}
}






