package com.whr.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		//用ArrayList存储编程语言的名称，并输出
		List list = new ArrayList();
		list.add("java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		//输出列表中元素的个数
		System.out.println("列表中元素的个数为"+list.size());
		
		System.out.println("*******************************");
		//遍历输出所有编程语言
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*******************************");
		//移除列表中的C++
		System.out.println();
		list.remove(2);//或者可以是list.remove("C++")
		System.out.println("移除C++以后的元素为:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
