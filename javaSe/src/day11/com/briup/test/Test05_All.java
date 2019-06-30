package day11.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合中  xxxAll相关功能实现
 */
public class Test05_All {
	public static void main(String[] args) {
		//取交集
		Collection<Integer> coll = new ArrayList<>();
		coll.add(1);
		coll.add(3);
		coll.add(5);
		
		Collection<Integer> coll2 = new ArrayList<>();
		coll2.add(1);
		coll2.add(3);
		coll2.add(5);
		
		System.out.println("coll == coll2 " + (coll == coll2));
		System.out.println("coll.equals(coll2) " + (coll.equals(coll2)));
		
		
		//修改 函数的调用者 coll，里面的成员 保留交集部分
		boolean b = coll.retainAll(coll2);
		System.out.println(b);
		System.out.println(coll);
	}
	
	public static void main1(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
		coll.add(1);
		coll.add(3);
		coll.add(5);
		
		Collection<Integer> coll2 = new ArrayList<>();
		coll2.add(10);
		
		//将coll集合  整体添加到 coll2中
		coll2.addAll(coll);
		
		System.out.println("*********************");
		Collection<Integer> coll3 = new ArrayList<>();
		coll3.add(1);
		coll3.add(10);

		//1 3 5 10
		//	1 10
		boolean b = coll2.containsAll(coll3);
		System.out.println("containsAll: " + b);
		
		//从coll2中 删除 和coll3相同的 所有成员
		coll2.removeAll(coll3);
		
		//对coll2进行遍历
		Iterator<Integer> it = coll2.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
		coll2.add(1);
		// 1 3 5
		// 1 10
		//判断集合中是否  全部包含另一个集合成员
		b = coll2.containsAll(coll3);
		System.out.println("containsAll: " + b);
	}
}





