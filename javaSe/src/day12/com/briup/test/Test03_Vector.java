package day12.com.briup.test;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector类测试
 */
public class Test03_Vector {
	public static void main(String[] args) {
		
		//				菱形泛型  JDK1.7
		Vector<String> v = new Vector<>();
		
		v.addElement("hello");
		v.addElement("world");
		v.addElement("world");
		v.add("abc");
		v.add(1, "nihao");
		
		//迭代器遍历
		//Vector特有 遍历方法
		Enumeration<String> elements = v.elements();
		while(elements.hasMoreElements()) {
			String s = elements.nextElement();
			System.out.println(s);
		}
		
	}
}








