package day22.com.briup.test;

import java.lang.reflect.Constructor;

import day21.com.briup.work.Student;

/*
 * ��ȡ�ֽ����������� ���й���������
 */
public class Test04_Constructor {
	public static void main(String[] args) throws Exception {
		
		//�Ȼ�ȡ���������ù�����ʵ��������
		Class<?> clazz = Class.forName("day22.com.briup.homework.Student");
		
		//���� ���� �޲ι����� ʵ��������
		//Student s = (Student) clazz.newInstance();
		
		//�Ȼ�ȡ���ι�����
		Constructor<?> con = clazz.getConstructor(int.class,String.class,int.class);
		//�ù�����ȥ����,ʵ��������
		Student s = (Student) con.newInstance(1, "zs", 22);
		
		System.out.println(s);
		
		//ͨ��˽�й�����ʵ��������
		Constructor<?> con2 = clazz.getDeclaredConstructor(int.class);
		//������������� ����Ȩ��
		con2.setAccessible(true);
		s = (Student) con2.newInstance(12);
		System.out.println(s);
	}
	
	//��ȡ������Ĺ�����
	public static void main1(String[] args) throws Exception {
		
		//1.��ȡѧ������ֽ������
		Class<?> clazz = Class.forName("day22.com.briup.homework.Student");
		
		//2.��ȡ���ֽ������� ������
		//				��ȡ���й����Ĺ���������
		Constructor<?>[] cons = clazz.getConstructors();
		for (Constructor<?> con : cons) {
			System.out.println(con);
		}
		
		System.out.println("************");
		
		//��ȡָ����  ���й��췽��
		//		��ȡ�޲�   ���� ������
		Constructor<?> con1 = clazz.getConstructor();
		System.out.println("con1: " + con1);
		
		//		��ȡ����  ���� ������
		Constructor<?> con2 = clazz.getConstructor(int.class, String.class, int.class);
		System.out.println("con2: " + con2);
		
		System.out.println("***************************");
		//��ȡ���еĹ����������� ˽�� ���� Ĭ�ϡ�
		Constructor<?>[] dCons = clazz.getDeclaredConstructors();
		for (Constructor<?> con : dCons) {
			System.out.println("con�� " + con);
		}
		
		//��ȡ����ָ�������� ������˽�� ���� Ĭ�ϡ�
		Constructor<?> con3 = clazz.getDeclaredConstructor(int.class);
		System.out.println("con3: " + con3);
		
	}
}






