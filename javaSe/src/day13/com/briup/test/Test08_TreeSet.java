package day13.com.briup.test;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet基本使用
 * 	Test09_Teacher
 * 		用TreeSet存放 Teacher对象,验证是否能去除重复
 * 		思考: 如何区分Teacher对象大小
 */
public class Test08_TreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("hello");
		set.add("abc");
		set.add("hello");
		set.add("world");
		set.add("bcd");
		set.add("hello");
		
		System.out.println(set);
	}
	
	public static void main1(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		//往集合中添加成员
		boolean b = set.add(10);
		System.out.println("b: " + b);
		
		set.add(6);
		set.add(1);
		set.add(4);
		set.add(9);
		
		b = set.add(10);
		System.out.println("b: " + b);
		set.add(9);
		
		System.out.println(set);
	}
}
