package day12.com.briup.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import day12.com.briup.bean.Teacher;

public class Test02_HomeWork {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("zs",23,4.5);
		Teacher t2 = new Teacher("ls",23,4.5);
		Teacher t3 = new Teacher("ww",23,4.5);
		Teacher t4 = new Teacher("ww",22,4.5);
		
		List<Teacher> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		//遍历集合，如果包含"ls"成员，添加新老师
		//如果迭代器遍历过程中出现并发访问异常，则 使用ListIterator解决
		/*Iterator<Teacher> it = list.iterator();
		while(it.hasNext()) {
			Teacher t = it.next();
			String name = t.getName();
			if("ls".equals(name)) {
				//it.remove();
				//添加老师  出现并发访问异常
				list.add(new Teacher());
			}
		}*/
		ListIterator<Teacher> it2 = list.listIterator();
		/*while(it2.hasNext()) {
			String name = it2.next().getName();
			if("ls".equals(name)) {
				it2.add(new Teacher());
			}
		}*/
		
		//先通过next跳转到 最后
		while(it2.hasNext()) {
			it2.next();
		}
		
		//从后往前遍历
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
		}
		
		System.out.println("size: " + list.size());
	}
	
	public static void main1(String[] args) {
		Teacher t1 = new Teacher("zs",23,4.5);
		Teacher t2 = new Teacher("ls",23,4.5);
		Teacher t3 = new Teacher("ww",23,4.5);
		Teacher t4 = new Teacher("ww",22,4.5);
		
		List<Teacher> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			Teacher t = list.get(i);
			if("ls".equals(t.getName())) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("未找到ls对象");
			return;
		}
		
		int index2 = index;
		
		//从键盘获取属性值，进行set
		System.out.println("请录入 信息: "); 
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		//zhao6.27.234.5
		index = line.indexOf(".");
		String name = line.substring(0, index);
		System.out.println("name: " + name);
		
		line = line.substring(index + 1);
		index = line.indexOf(".");
		String ageStr = line.substring(0, index);
		int age = Integer.parseInt(ageStr);
		System.out.println("age: " + age);
		
		line = line.substring(index + 1);
		double salary = Double.parseDouble(line);
		System.out.println("salary: " + salary);
		
		Teacher t5 = new Teacher(name,age,salary);
		
		list.add(index2, t5);
		
		System.out.println("list.size: " + list.size());
		
		//迭代器遍历
		Iterator<Teacher> it = list.iterator();
		while(it.hasNext()) {
			Teacher t = it.next();
			if("ww".equals(t.getName())) {
				it.remove();//通过迭代器本身删除，没问题
				//list.remove(t);//迭代器遍历，通过list删除，会出问题
			}
			//System.out.println(it.next());
		}
		
		System.out.println("after remove .size: " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}






