package day13.com.briup.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import day13.com.briup.bean.Teacher;

/*
 * ���� TreeSet�д���  �Ƚ�������ָ�������׼
 * 
 * 	�Ƚ������ȼ� ���� ��Ȼ����
 */
public class Test10_Comparator {
	public static void main(String[] args) {
		//ʵ�����Ƚ�������
		ComparatorImpl comp = new ComparatorImpl();
		
		//1.ʵ���� ���󡾴���Ƚ�������
		//	Teacher�Ѿ�������Ȼ����  
		Set<Teacher> set = new TreeSet<>(comp);
		
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

//���� �Ƚ�����ʵ����
class ComparatorImpl implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {
		//�� �����
		int num = 0;
		//��������Ƚ�
		num = t1.getAge() - t2.getAge();
		
		return num;
	}
	
	//equals()  �̳�Object   
}








