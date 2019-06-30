package day13.com.briup.test;

import java.util.HashSet;
import java.util.Set;

import day13.com.briup.bean.Person;

/*
 * ʵ����HashSet�����Person����
 */
public class Test04_Person {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		
		//Set����add��Ա�����ж� Ԫ���Ƿ��ظ�
		//	1.�Ȼ�ȡ����hashCode(),���бȽ�,
		//		�����ͬ������Ϊ����ͬ��ֱ�����
		//	2.�����ͬ����ͨ��equals()�Ƚ�
		Person p1 = new Person("zs",21);
		System.out.println(p1.hashCode());//��Ĭ�ϻ�ȡ  ��ֵַ��
		System.out.println(Integer.toHexString(p1.hashCode()));
		
		boolean b = set.add(p1);
		System.out.println("b: " + b);
		
		set.add(new Person("lily",20));
		set.add(new Person("lucy",19));
		set.add(new Person("jack",20));
		
		b = set.add(new Person("zs",21));
		System.out.println("b: " + b);
		
		for (Person p : set) {
			System.out.println(p);
		}
	}
}





