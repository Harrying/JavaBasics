package day18.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ׼���ַ��� ����д��a.txt
 * 	ͨ��������ʵ�ֹ���
 * 
 * ע��: ������Ϊ �ֽ�����д�뵽�ļ����� ���������ݣ��˿�����
 * �ı��鿴�� ����ʶ�����ƣ���ʾ���룬
 */
public class Test02_Object {
	public static void main(String[] args) throws Exception {
		
		//1.������
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/a.txt"));
		
		//2.׼���ַ�������д�������
		String s1 = "hello";
		String s2 = "���";
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		//3.�ر���
		oos.close();
		
	}
}






