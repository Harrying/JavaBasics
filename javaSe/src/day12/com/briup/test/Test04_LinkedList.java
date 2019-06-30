package day12.com.briup.test;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedListºØ∫œ≤‚ ‘
 */
public class Test04_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("hello");	//hello
		list.add(0, "abc");	//abc	hello
		list.addFirst("nihao");	//	nihao abc hello
		list.addLast("ttt");	//					ttt
		
		
		
		System.out.println("first: " + list.getFirst());
		System.out.println("last: " + list.getLast());
		
		list.removeLast();
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}






