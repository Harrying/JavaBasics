package day13.com.briup.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import day13.com.briup.bean.Teacher;

/*
 * 测试 TreeSet中传递  比较器对象，指定排序标准
 * 
 * 	比较器优先级 高于 自然排序
 */
public class Test10_Comparator {
	public static void main(String[] args) {
		//实例化比较器对象
		ComparatorImpl comp = new ComparatorImpl();
		
		//1.实例化 对象【传入比较器对象】
		//	Teacher已经存在自然排序  
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

//定义 比较器的实现类
class ComparatorImpl implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {
		//按 年龄比
		int num = 0;
		//按照年龄比较
		num = t1.getAge() - t2.getAge();
		
		return num;
	}
	
	//equals()  继承Object   
}








