package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * �� �����ļ���a.txt���Ѿ������˶�Ӧ���͵Ķ���
 * ��ȡ �������
 * 
 */
public class Test03_ReadObject {
	public static void main(String[] args) throws Exception {
		
		//1.�򿪶��� ������
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("src/a.txt"));
		
		//2.��ȡ�ļ����ݣ�ע�⣬�ŵ���ʲô���Ͷ�ȡʲô
		Object obj1 = ois.readObject();
		Object obj2 = ois.readObject();
		//Object obj3 = ois.readObject();	EOFException
		
		String s1 = (String)obj1;
		//Integer s2 = (Integer)obj2;	��������� �Ͷ�ȡ�� ���� һ������һ��
		
		System.out.println("obj1: " + s1);//Object.toString();
		System.out.println("obj2: " + obj2.toString());
		
		//3.�ر���
		ois.close();
	}
}





