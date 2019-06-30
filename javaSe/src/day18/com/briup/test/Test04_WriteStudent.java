package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day18.com.briup.bean.Student;


/*
 * ��ע�⡿
 * 	  ���Ҫͨ�������� ���� �Զ���������Զ������� ����ʵ�� ���л��ӿ�
 * 
 *  * ����Student name,age
 * ����1.������ѧ�� д��b.txt   
 * 	�鿴�ļ�����
 * 
 * ����2.��b.txt��ȡѧ�����������
 * 
 * ��ȡ���� ��������֤���ļ��������ľ��Ƕ���
 */
public class Test04_WriteStudent {
	//��b.txt�ļ��ж�ȡ����
	//	��֤���ļ��У��Ѿ������˶���
	public static void main(String[] args) throws Exception {
		//1.����
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("src/b.txt"));
		
		//2.��ȡ�������
		Student s1 = (Student) ois.readObject();
		Student s2 = (Student) ois.readObject();
		//ע�⣬�ļ��д��ڼ������󣬾Ͷ�ȡ�������󣬶��ȡ�����EOFException
		//Student s3 = (Student) ois.readObject();
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		//3.�ر���
		ois.close();
	}
	
	//���ļ���д�����
	public static void main1(String[] args) throws Exception {
		//1.�򿪶�����
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/b.txt"));
		
		//2.׼������ѧ������д���ļ�
		Student s1 = new Student("zs", 20);
		Student s2 = new Student("Tom", 21);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		//3.�ر���
		oos.close();
	}
}




