package day15.com.briup.test;

import day15.com.briup.bean.AgeException;
import day15.com.briup.bean.Person;
import day15.com.briup.bean.Student;

public class Test07_重写 {
	public static void main(String[] args) throws AgeException {
		
		Person p1 = new Student();
		//		父类引用指向  子类对象 ，调用重写后的方法
		Person p2 = p1.getPerson("zs", 15);
		
		System.out.println(p2.toString());
		
		System.out.println("********************");
		Person p = new Student();
		
		p.setAge(10);
		
		System.out.println(p);
	}
}
