package day10.com.briup.test;

import day10.com.briup.bean.Person;

public class Test02_Object {
	
	public static void main(String[] args) {
		//���� equals()   �ж����������Ƿ����
		Person p1 = new Person("zs",21);
		
		//����һ��	ctrl+alt+�¼�  
		//�ƶ�  alt+���¼��������Ļ��ת����ȥ����
		Person p2 = new Person("zs",21);
		
		System.out.println("p1 == p2: " + (p1 == p2));
		//�ж��Ƿ����  equals�Ƚ�  ��������ֵ�������ǵ�ֵַ
		boolean b = p1.equals(p2);
		System.out.println("b: " + b);
		
		//��дPerson���toString()����
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
	}
	
	//hashCode()  getClass()  toString();
	public static void main1(String[] args) {
		//����ctrl�����������
		Person p1 = new Person("zs", 21);
		//hashCode();
		//getClass();
		//�޷�ȷ�� ������ ����  ctrl+1: 
		
		//hashCode() ���Ի�ȡ  ��ǰ����ĵ�ֵַ
		int hashCode = p1.hashCode();
		System.out.println("hashCode: " + hashCode);
		
		//��ȡ��ǰ��� �ֽ������
		Class<? extends Person> clazz = p1.getClass();
		//��ȡ������ơ����ȫ������
		String name = clazz.getName();
		System.out.println("getClass.getName: " + name);
		
		//��ȡ����� �ַ�����ʽ
		String str = p1.toString();
		System.out.println("p1.toString(): " + str);
		
		//���ֱ����������� �Զ� ���:  ����.toString()
		System.out.println("p1: " + p1);
	}
}





