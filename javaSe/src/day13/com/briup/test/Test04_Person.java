package day13.com.briup.test;

import java.util.HashSet;
import java.util.Set;

import day13.com.briup.bean.Person;

/*
 * 实例化HashSet，存放Person对象
 */
public class Test04_Person {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		
		//Set集合add成员，会判断 元素是否重复
		//	1.先获取对象hashCode(),进行比较,
		//		如果不同，则认为对象不同，直接添加
		//	2.如果相同，再通过equals()比较
		Person p1 = new Person("zs",21);
		System.out.println(p1.hashCode());//【默认获取  地址值】
		System.out.println(Integer.toHexString(p1.hashCode()));
		
		boolean b = set.add(p1);
		System.out.println("b: " + b);
		
		set.add(new Person("lily",20));
		set.add(new Person("lucy",19));
		set.add(new Person("jack",20));
		
		b = set.add(new Person("zs",21));
		System.out.println("b: " + b);
		
		for (Person p : set) {
			System.out.println(p);
		}
	}
}





