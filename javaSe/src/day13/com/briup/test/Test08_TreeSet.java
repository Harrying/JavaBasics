package day13.com.briup.test;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet����ʹ��
 * 	Test09_Teacher
 * 		��TreeSet��� Teacher����,��֤�Ƿ���ȥ���ظ�
 * 		˼��: �������Teacher�����С
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
		
		//����������ӳ�Ա
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
