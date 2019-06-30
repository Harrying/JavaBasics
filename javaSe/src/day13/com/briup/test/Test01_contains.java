package day13.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;

import day13.com.briup.bean.Person;
import day13.com.briup.bean.Student;
import day13.com.briup.bean.Teacher;

public class Test01_contains {
	public static void main(String[] args) {
		Collection<Person> coll = new ArrayList<>();
		
		coll.add(new Person("zs",21));
		Person p1 = new Person("ls",20);
		coll.add(p1);
		coll.add(new Person("ww",19));
		coll.add(new Person("ww",19));
		
		//向上转型
		coll.add(new Student("zl",18,78.5));
		coll.add(new Student("zl",18,70.5));
		
		Collection<Person> c2 = new ArrayList<>();
		c2.add(new Teacher("tom",28,3456.7));
		c2.add(new Teacher("tom",28,3456.7));
		c2.add(new Teacher("tom",28,456.7));
		
		coll.addAll(c2);
		
		//获取新集合
		coll = getNewCollection(coll);
		
		//输出  加强for循环
		for (Person p : coll) {
			System.out.println(p);
		}
		
		// == 比较两个对象，底层比较 地址值
//		Person p = new Student("ls",20,68.9);
//		boolean b = coll.contains(p);//借助Person.equals
//		System.out.println("b: " + b);
		
	}
	
	//传入一个集合(包含重复成员)，获取一个 新集合，不包含重复值
	public static Collection<Person> getNewCollection(Collection<Person> c) {
		Collection<Person> newColl = new ArrayList<>();
		
		//1.遍历老的集合
		for (Person person : c) {
			//2.逐个获取成员加入新集合
			//	2.1加入前，先判断 集合中是否存在该对象
			if(newColl.contains(person) == false) {
				newColl.add(person);
			}
		}
		//3.遍历完成，也就获得了 新集合,返回
		
		return newColl;
	}
}





