package day15.com.briup.test;

import day15.com.briup.bean.AgeException;
import day15.com.briup.bean.Person;
import day15.com.briup.bean.Student;

public class Test07_��д {
	public static void main(String[] args) throws AgeException {
		
		Person p1 = new Student();
		//		��������ָ��  ������� ��������д��ķ���
		Person p2 = p1.getPerson("zs", 15);
		
		System.out.println(p2.toString());
		
		System.out.println("********************");
		Person p = new Student();
		
		p.setAge(10);
		
		System.out.println(p);
	}
}
