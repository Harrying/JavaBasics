package day11.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;

import day10.com.briup.work.Teacher;



/*
 * ���ϵĻ�����ʶ
 * 	���м��� 				˫�м���
 * 	���ӿ� Collection
 * 	List�ӿ�(�ظ���ֵ)			Set�ӿ�(���ظ�)
 * ArrayList LinkedList Vector	HashSet	TreeSet
 */
public class Test03_Collection {
	public static void main(String[] args) {
		//�ø��ӿڵ�����  ָ�� һ�� ʵ������� 
		Collection c = new ArrayList();
		
		//������⼯���Ǹ�  ������������ʲô���ܷŽ�ȥ
		c.add(1);
		c.add('a');
		c.add("hello");
		c.add("hello");
		c.add(false);
		
		Teacher t = new Teacher("zs", 21, 5689.5);
		c.add(t);
		
		//��ȡ ���� ��Ԫ�ظ���
		int len = c.size();
		System.out.println("len: " + len);
		
		//ֱ����� Collection����  c.toString();  
		System.out.println(c);
	}
}





