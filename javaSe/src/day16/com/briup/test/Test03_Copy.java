package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ��a.txt�����ļ����ݵ�c.txt
 */
public class Test03_Copy {
	public static void main(String[] args) throws Exception {
		//1.������������ļ�
//		InputStream is = new FileInputStream("E://a//a.txt");
		
		//ͨ���ֽ���  ����ֽ� ����  ������ͼƬ
		InputStream is = new FileInputStream("src/day16/com/briup/1.png");
		OutputStream os = new FileOutputStream("E://a//1.png");
		
		//2.����
		int n;
		int count = 0;
		while((n = is.read()) != -1) {
			count++;
			os.write(n);
		}
		System.out.println("size: " + count);
		
		//3.�ر���Դ[�ȴ򿪵� ��رգ����� ����]
		os.close();
		is.close();
	}
}
