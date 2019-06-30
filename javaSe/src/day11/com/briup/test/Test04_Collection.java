package day11.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection接口中  基本方法使用
 * 	
 */
public class Test04_Collection {
	public static void main(String[] args) {
		//遍历集合 所有成员
		Collection<String> coll = new ArrayList<>();
		System.out.println("isEmpty： " + coll.isEmpty());
		
		coll.add("hello");
		coll.add("world");
		coll.add("hello");
		coll.add("world");
		coll.add("abc");
		
		//1.先将集合转换成  数组，然后遍历数组
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]: " + array[i]);
		}
		
		System.out.println("*********************");
		//2.集合自己的遍历方式
		//	 借助集合的迭代器 实现遍历
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
	
	public static void main1(String[] args) {
		//测试Collection方法
		//实际开发中，集合对象中  存放  同一类型数据
		//实例化集合格式:
		//	Collectin<引用数据类型> 对象名 = new 类型<>(构造实参);
		//	<>里面的数据类型 ，就规定了  该集合只能存放该类型 数据
		Collection<String> coll = new ArrayList<>();
		System.out.println("isEmpty： " + coll.isEmpty());
		
		coll.add("hello");
		coll.add("world");
		//coll.add(1);
		//coll.add(false);
		
		System.out.println("isEmpty： " + coll.isEmpty());
		
		//删除对象
		boolean b = coll.remove("hello");
		System.out.println("remove: " + b);
		
		boolean b1 = coll.contains("hello");
		boolean b2 = coll.contains("abc");
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		System.out.println("size: " + coll.size());
		//清空集合
		coll.clear();
		
		System.out.println("size: " + coll.size());
		//System.out.println(coll);
	}
}





