package day11.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;

import day10.com.briup.work.Teacher;



/*
 * 集合的基本认识
 * 	单列集合 				双列集合
 * 	根接口 Collection
 * 	List接口(重复的值)			Set接口(不重复)
 * ArrayList LinkedList Vector	HashSet	TreeSet
 */
public class Test03_Collection {
	public static void main(String[] args) {
		//用父接口的引用  指向 一个 实现类对象 
		Collection c = new ArrayList();
		
		//可以理解集合是个  大容器，里面什么都能放进去
		c.add(1);
		c.add('a');
		c.add("hello");
		c.add("hello");
		c.add(false);
		
		Teacher t = new Teacher("zs", 21, 5689.5);
		c.add(t);
		
		//获取 集合 的元素个数
		int len = c.size();
		System.out.println("len: " + len);
		
		//直接输出 Collection引用  c.toString();  
		System.out.println(c);
	}
}





