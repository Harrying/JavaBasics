package day13.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;

import day13.com.briup.bean.Person;
import day13.com.briup.bean.Student;
import day13.com.briup.bean.Teacher;

public class Test01_contains {
	public static void main(String[] args) {
		Collection<Person> coll = new ArrayList<>();
		
		coll.add(new Person("zs",21));
		Person p1 = new Person("ls",20);
		coll.add(p1);
		coll.add(new Person("ww",19));
		coll.add(new Person("ww",19));
		
		//����ת��
		coll.add(new Student("zl",18,78.5));
		coll.add(new Student("zl",18,70.5));
		
		Collection<Person> c2 = new ArrayList<>();
		c2.add(new Teacher("tom",28,3456.7));
		c2.add(new Teacher("tom",28,3456.7));
		c2.add(new Teacher("tom",28,456.7));
		
		coll.addAll(c2);
		
		//��ȡ�¼���
		coll = getNewCollection(coll);
		
		//���  ��ǿforѭ��
		for (Person p : coll) {
			System.out.println(p);
		}
		
		// == �Ƚ��������󣬵ײ�Ƚ� ��ֵַ
//		Person p = new Student("ls",20,68.9);
//		boolean b = coll.contains(p);//����Person.equals
//		System.out.println("b: " + b);
		
	}
	
	//����һ������(�����ظ���Ա)����ȡһ�� �¼��ϣ��������ظ�ֵ
	public static Collection<Person> getNewCollection(Collection<Person> c) {
		Collection<Person> newColl = new ArrayList<>();
		
		//1.�����ϵļ���
		for (Person person : c) {
			//2.�����ȡ��Ա�����¼���
			//	2.1����ǰ�����ж� �������Ƿ���ڸö���
			if(newColl.contains(person) == false) {
				newColl.add(person);
			}
		}
		//3.������ɣ�Ҳ�ͻ���� �¼���,����
		
		return newColl;
	}
}





