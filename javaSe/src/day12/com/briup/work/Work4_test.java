package day12.com.briup.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day12.com.briup.work.Person;


public class Work4_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Teacher> c1 = new ArrayList();
		Collection<Student> c2 = new ArrayList();
		Collection<Person> c3 = new ArrayList();
		
		Teacher t1 = new Teacher("z3", 26, 3000.2);
		Teacher t2 = new Teacher("l4", 57, 500.2);
		Teacher t3 = new Teacher("w5", 45, 5444.2);
		Teacher t4 = new Teacher("l4", 57, 500.5);
		Teacher t5 = new Teacher("l4", 57, 500.2);
		c1.add(t1);
		c1.add(t2);
		c1.add(t3);
		c1.add(t4);
		c1.add(t5);
		System.out.println("***********c1***********");
		for (Teacher s : c1) {
			System.out.println(s);
		}
		
		Student s1 = new Student("zz", 15, 88);
		Student s2 = new Student("ll", 16, 91);
		Student s3 = new Student("ww", 13, 45);
		Student s4 = new Student("ll", 16, 96);
		Student s5 = new Student("ll", 16, 96);
		
		c2.add(s1);
		c2.add(s2);
		c2.add(s3);
		c2.add(s4);
		c2.add(s5);
		System.out.println("***********c2***********");
		for (Student ss : c2) {
			System.out.println(ss);
		}
		
		c3.addAll(c1);
		c3.addAll(c2);
		System.out.println("***********c3***********");
		for (Person sss : c3) {
			System.out.println(sss);
		}
		
		ArrayList newarr = new ArrayList();
		Iterator it = c3.iterator();
		while (it.hasNext()) {
			Person s = (Person) it.next();
			if (!newarr.contains(s)) {
				newarr.add(s);
			}
		
		}
		System.out.println("********删除后的结果：************");
		for (int i = 0; i < newarr.size(); i++) {
			Person s = (Person) newarr.get(i);
			System.out.println(s);
		}
		
		
	
		
	}
	
}
