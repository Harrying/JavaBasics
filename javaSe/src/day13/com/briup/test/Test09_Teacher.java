package day13.com.briup.test;

import java.util.Set;
import java.util.TreeSet;

import day13.com.briup.bean.Teacher;

/*
 * ��TreeSet��� Teacher����,��֤�Ƿ���ȥ���ظ�
 * 		˼��: �������Teacher�����С
 * 			1.ͨ����Teacher��ʵ����Ȼ����  �� ʵ�� Comparable����дcompareTo����
 * 			2.����TreeSetʱ���� �Ƚ���
 */
public class Test09_Teacher {
	public static void main(String[] args) {
		//1.ʵ���� ����
		Set<Teacher> set = new TreeSet<>();
		
		set.add(new Teacher("Jack",27,4567.8));
		set.add(new Teacher("Jack",27,4567.8));
		
		set.add(new Teacher("Tom",28,467.8));
		set.add(new Teacher("Lucy",28,467.8));
		set.add(new Teacher("Kevin",30,6567.8));
		
		System.out.println(set.size());
		
		for (Teacher t : set) {
			System.out.println(t);
		}
	}
}




