package day13.com.briup.test;

import java.util.Set;
import java.util.TreeSet;

import day13.com.briup.bean.Teacher;

/*
 * 用TreeSet存放 Teacher对象,验证是否能去除重复
 * 		思考: 如何区分Teacher对象大小
 * 			1.通过让Teacher类实现自然排序  即 实现 Comparable，重写compareTo方法
 * 			2.构造TreeSet时候传入 比较器
 */
public class Test09_Teacher {
	public static void main(String[] args) {
		//1.实例化 对象
		Set<Teacher> set = new TreeSet<>();
		
		set.add(new Teacher("Jack",27,4567.8));
		set.add(new Teacher("Jack",27,4567.8));
		
		set.add(new Teacher("Tom",28,467.8));
		set.add(new Teacher("Lucy",28,467.8));
		set.add(new Teacher("Kevin",30,6567.8));
		
		System.out.println(set.size());
		
		for (Teacher t : set) {
			System.out.println(t);
		}
	}
}




