package day22.com.briup.test;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;

import day21.com.briup.work.Student;
/*
 * �ֽ������ �����˽�
 */
public class Test01_Basic {
	public static void main(String[] args) {
		
		//1.��ȡ��һ������ֽ������
		//	���ַ�ʽ
		Class<?> clazz1 =  FileInputStream.class;
		
		//��ȡ�Զ���Student����ֽ������
		Class<?> clazz2 = Student.class;
		Constructor<?>[] cons = clazz2.getConstructors();
		for (Constructor<?> c : cons) {
			System.out.println(c);
		}
	}
}







