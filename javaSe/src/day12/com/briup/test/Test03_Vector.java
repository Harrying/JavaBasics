package day12.com.briup.test;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector�����
 */
public class Test03_Vector {
	public static void main(String[] args) {
		
		//				���η���  JDK1.7
		Vector<String> v = new Vector<>();
		
		v.addElement("hello");
		v.addElement("world");
		v.addElement("world");
		v.add("abc");
		v.add(1, "nihao");
		
		//����������
		//Vector���� ��������
		Enumeration<String> elements = v.elements();
		while(elements.hasMoreElements()) {
			String s = elements.nextElement();
			System.out.println(s);
		}
		
	}
}








