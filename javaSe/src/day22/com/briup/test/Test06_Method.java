package day22.com.briup.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import day21.com.briup.work.Student;

/*
 * ͨ������ķ�ʽ��ȡMethod
 * Ȼ�����Method
 * 
 */
public class Test06_Method {
	public static void main(String[] args) throws Exception {
		
		//1.��ȡ�ֽ������
		Student s = new Student();
		Class<? extends Student> clazz = s.getClass();
		
		//2.��ȡ���й�����������������̳еġ�
		Method[] methods = clazz.getMethods();
		System.out.println("size: " + methods.length);
		/*for (Method m : methods) {
			System.out.println(m);
		}*/
		System.out.println("*********************");
		//��ȡָ���Ĺ�������
		Method method = clazz.getMethod("setName", String.class);
		System.out.println("method: " + method);
		
		//ͨ������ �÷���ִ��
		//s.setName("Tom");
		method.invoke(s, "Tom");
		
		System.out.println("s: " + s);
		
		System.out.println("******************");
		
		//ͨ��Field�޸�����ֵ
		Field f = clazz.getDeclaredField("id");
		f.setAccessible(true);
		f.set(s, 18);
		
		System.out.println("s: " + s);
		
		System.out.println("*****************");
		
		// ͨ������ ��ȡ��ǰ���� ���з������̳еĳ��⡿
		Method[] dArr = clazz.getDeclaredMethods();
		System.out.println(dArr.length);
		for (Method m : dArr) {
			System.out.println(m);
		}
		
		//ͨ������ ��������� ˽�з���
		Method m2 = clazz.getDeclaredMethod("setAge", int.class);
		m2.setAccessible(true);
		m2.invoke(s, 21);
		
		System.out.println("s: " + s);
	}
}









