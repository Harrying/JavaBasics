package day13.com.briup.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Set���ϻ���ʹ��
 * 	���Integer
 */
public class Test03_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
			
		set.add("hello");
		set.add("hello");
		set.add("abc");
		set.add("world");
		set.add("abc");
		set.add("bdc");
		
		for (String s : set) {
			System.out.println(s);
		}
	}
	
	public static void main1(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		//set���� ������ ����ظ���Ԫ��
		//	set���� �������  ��ȡ����һ��
		boolean b3 = set.add(3);
		boolean b1 = set.add(1);
		boolean b2 = set.add(2);
		boolean b4 = set.add(3);
		boolean b5 = set.add(2);
	
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);	//true
		System.out.println(b4);
		System.out.println(b5);	//false
		
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}









