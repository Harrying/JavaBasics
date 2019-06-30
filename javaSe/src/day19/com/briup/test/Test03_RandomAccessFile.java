package day19.com.briup.test;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/*
 * ���������  ����|���
 */
public class Test03_RandomAccessFile {
	public static void main(String[] args) throws Exception {
		//1.ʵ��������  ���Զ�Ҳ����д
		RandomAccessFile raf = 
				new RandomAccessFile("src/a.txt", "rw");
		
		//����ƫ��������0��ʼ
		raf.seek(1);
		int data = raf.read();
		System.out.println("data: " + data);
		
		//�����ļ�ƫ����
		int size = (int) raf.length();
		raf.seek(size-1);
		data = raf.read();
		System.out.println("data: " + data);
		
		//�������ļ�ͷ��д������
		raf.seek(raf.length() + 10);
		raf.write('t');
		
		raf.close();
	}
}







