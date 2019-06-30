package day11.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection�ӿ���  ��������ʹ��
 * 	
 */
public class Test04_Collection {
	public static void main(String[] args) {
		//�������� ���г�Ա
		Collection<String> coll = new ArrayList<>();
		System.out.println("isEmpty�� " + coll.isEmpty());
		
		coll.add("hello");
		coll.add("world");
		coll.add("hello");
		coll.add("world");
		coll.add("abc");
		
		//1.�Ƚ�����ת����  ���飬Ȼ���������
		Object[] array = coll.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]: " + array[i]);
		}
		
		System.out.println("*********************");
		//2.�����Լ��ı�����ʽ
		//	 �������ϵĵ����� ʵ�ֱ���
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
	
	public static void main1(String[] args) {
		//����Collection����
		//ʵ�ʿ����У����϶�����  ���  ͬһ��������
		//ʵ�������ϸ�ʽ:
		//	Collectin<������������> ������ = new ����<>(����ʵ��);
		//	<>������������� ���͹涨��  �ü���ֻ�ܴ�Ÿ����� ����
		Collection<String> coll = new ArrayList<>();
		System.out.println("isEmpty�� " + coll.isEmpty());
		
		coll.add("hello");
		coll.add("world");
		//coll.add(1);
		//coll.add(false);
		
		System.out.println("isEmpty�� " + coll.isEmpty());
		
		//ɾ������
		boolean b = coll.remove("hello");
		System.out.println("remove: " + b);
		
		boolean b1 = coll.contains("hello");
		boolean b2 = coll.contains("abc");
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		System.out.println("size: " + coll.size());
		//��ռ���
		coll.clear();
		
		System.out.println("size: " + coll.size());
		//System.out.println(coll);
	}
}





