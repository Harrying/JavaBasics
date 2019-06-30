package day13.com.briup.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day13.com.briup.bean.Student;

/*
 * 将ArrayList集合中的重复元素去掉
 * 	Student对象
 */
public class Test07_去重复 {
	public static void main(String[] args) {
		//1.准备集合对象，添加学生
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Jack",20,65.5));
		list.add(new Student("zs",21,78.3));
		list.add(new Student("zs",21,78.3));
		list.add(new Student("tom",22,67.4));
		list.add(new Student("tom",22,67.4));
		list.add(new Student("Lucy",19,82.1));
		
		//System.out.println(list.size());
		
		//2.去除重复【准备Set，遍历list将学生添加到Set】
		//		先去hashCode()  再 equals()
		Set<Student> set = new HashSet<>();
		for (Student s : list) {
			set.add(s);
		}
		System.out.println(set.size());
		
		//3.将list集合清空，再将set集合整体添加到list中
		list.clear();
		list.addAll(set);
		
		//遍历list
		for (Student s : list) {
			System.out.println(s);
		}
		
	}
}





