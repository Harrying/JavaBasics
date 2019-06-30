package day22.com.briup.test;

import java.lang.reflect.Field;

import day21.com.briup.work.Student;

/*
 * �����ȡField ��ز���
 */
public class Test05_Field {
	public static void main(String[] args) throws Exception {
		
		//1.��ȡ�ֽ������
		Class<?> clazz = Student.class;
		
		//��ȡ���е� ��������
		Field[] fs = clazz.getFields();
		for (Field f : fs) {
			System.out.println(f);
		}
		
		//��ȡָ����������
		Field f1 = clazz.getField("name");
		System.out.println("f1: " + f1);
		
		System.out.println("*********************");
		//��ȡ���� ����[private ����  Ĭ��]
		fs = clazz.getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f);
		}
		//��ȡָ������ ����
		Field f2 = clazz.getDeclaredField("id");
		System.out.println("f2: " + f2);
		
		//ʵ��������
		Student s = new Student();
		s.name = "zs";
		//s.id = 12;
		
		//ͨ������ �޸Ķ��������ֵ
		f2.setAccessible(true);
		f2.set(s, 12);
		
		System.out.println("s: " + s);
	}
}









