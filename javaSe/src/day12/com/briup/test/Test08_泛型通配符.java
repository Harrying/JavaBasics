package day12.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day12.com.briup.bean.Person;
import day12.com.briup.bean.Teacher;

public class Test08_泛型通配符 {
	public static void main(String[] args) {
		Collection<Person> c = new ArrayList<>();
		c.add(new Person("zs",23));
		c.add(new Person("ls",21));
		c.add(new Person("ww",20));
		
		Collection<Teacher> c2 = new ArrayList<>();
		c2.add(new Teacher("tom",21,6543.2));
		c2.add(new Teacher("jack",25,43.2));
		
		//
		c.addAll(c2);
		
		/*Iterator<Person> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//方便  遍历
		//	增强for循环 【借助迭代器实现功能  只能遍历】
		//		固定格式:  for (成员类型  变量 : 集合名) { ... }
		//		fore alt+/
		for (Person p : c) {
//			if(p.getAge() == 23)
//				c.remove(p);

			System.out.println(p);
		}
	}
}





