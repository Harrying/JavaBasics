package day22.com.briup.test;

import day21.com.briup.work.Student;

/*
 * ���ֻ�ȡ�ֽ������ķ�ʽ
 * 	
 * 	һ������ֽ������ ����ֻ��һ��
 */
public class Test02_�ֽ������ {
	public static void main(String[] args) throws Exception {
		//1. Class.forName("���ȫ����");
		String className = "day22.com.briup.homework.Student";
		Class<?> clazz1 = Class.forName(className);

		System.out.println("clazz1: " + clazz1);
		
		//2. ��ǰ��.class;
		Class<?> clazz2 = Student.class;
		
		//3. ����.getClass();
		Student s = new Student();
		Class<? extends Student> clazz3 = s.getClass();
		
		//�������ֽ������  �Ƿ�����ֻ��һ��
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz3 == clazz2);
	}
}







