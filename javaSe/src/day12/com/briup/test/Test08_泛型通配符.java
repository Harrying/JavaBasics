package day12.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day12.com.briup.bean.Person;
import day12.com.briup.bean.Teacher;

public class Test08_����ͨ��� {
	public static void main(String[] args) {
		Collection<Person> c = new ArrayList<>();
		c.add(new Person("zs",23));
		c.add(new Person("ls",21));
		c.add(new Person("ww",20));
		
		Collection<Teacher> c2 = new ArrayList<>();
		c2.add(new Teacher("tom",21,6543.2));
		c2.add(new Teacher("jack",25,43.2));
		
		//
		c.addAll(c2);
		
		/*Iterator<Person> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//����  ����
		//	��ǿforѭ�� ������������ʵ�ֹ���  ֻ�ܱ�����
		//		�̶���ʽ:  for (��Ա����  ���� : ������) { ... }
		//		fore alt+/
		for (Person p : c) {
//			if(p.getAge() == 23)
//				c.remove(p);

			System.out.println(p);
		}
	}
}





