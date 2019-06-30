package day11.com.briup.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import day10.com.briup.work.Teacher;


/*
 * List基本方法使用
 * 	ArrayList底层 借助  数组实现功能
 */
public class Test06_List {
	public static void main(String[] args) {
//		Collection<Teacher> coll = new ArrayList<>();
		List<Teacher> list = new ArrayList<>();
		
		Teacher t1 = new Teacher("zs",23,1000.5);
		Teacher t2 = new Teacher("ls",20,1500.5);
		Teacher t3 = new Teacher("ww",21,3100.5);
		Teacher t4 = new Teacher("zl",22,1320.5);
		
		list.add(t1);//t1
		list.add(0, t2);//t2 t1  
		//注意，操作 下标时  不要越界
		list.add(2, t3);//t2 t1 t3
		list.add(t4);	//t2 t1 t3 t4
		
		//remove(index)
		//list.remove(2);
		
		//【注意】：重写 放入集合对象  所在类的  equals方法
		//remove(Object)
		list.remove(new Teacher("ww",21,3100.5));
		
		//get  set
		Teacher t = list.get(1);
		System.out.println("t: " + t);
		
		t.setName("Kevin");
		list.set(0, t);
		Iterator<Teacher> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("))))))))");
		t.setAge(11);
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}








