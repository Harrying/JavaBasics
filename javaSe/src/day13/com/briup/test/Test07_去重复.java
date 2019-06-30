package day13.com.briup.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day13.com.briup.bean.Student;

/*
 * ��ArrayList�����е��ظ�Ԫ��ȥ��
 * 	Student����
 */
public class Test07_ȥ�ظ� {
	public static void main(String[] args) {
		//1.׼�����϶������ѧ��
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Jack",20,65.5));
		list.add(new Student("zs",21,78.3));
		list.add(new Student("zs",21,78.3));
		list.add(new Student("tom",22,67.4));
		list.add(new Student("tom",22,67.4));
		list.add(new Student("Lucy",19,82.1));
		
		//System.out.println(list.size());
		
		//2.ȥ���ظ���׼��Set������list��ѧ����ӵ�Set��
		//		��ȥhashCode()  �� equals()
		Set<Student> set = new HashSet<>();
		for (Student s : list) {
			set.add(s);
		}
		System.out.println(set.size());
		
		//3.��list������գ��ٽ�set����������ӵ�list��
		list.clear();
		list.addAll(set);
		
		//����list
		for (Student s : list) {
			System.out.println(s);
		}
		
	}
}





