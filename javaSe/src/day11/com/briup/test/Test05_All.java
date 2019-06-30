package day11.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ������  xxxAll��ع���ʵ��
 */
public class Test05_All {
	public static void main(String[] args) {
		//ȡ����
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
		
		
		//�޸� �����ĵ����� coll������ĳ�Ա ������������
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
		
		//��coll����  ������ӵ� coll2��
		coll2.addAll(coll);
		
		System.out.println("*********************");
		Collection<Integer> coll3 = new ArrayList<>();
		coll3.add(1);
		coll3.add(10);

		//1 3 5 10
		//	1 10
		boolean b = coll2.containsAll(coll3);
		System.out.println("containsAll: " + b);
		
		//��coll2�� ɾ�� ��coll3��ͬ�� ���г�Ա
		coll2.removeAll(coll3);
		
		//��coll2���б���
		Iterator<Integer> it = coll2.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
		coll2.add(1);
		// 1 3 5
		// 1 10
		//�жϼ������Ƿ�  ȫ��������һ�����ϳ�Ա
		b = coll2.containsAll(coll3);
		System.out.println("containsAll: " + b);
	}
}





