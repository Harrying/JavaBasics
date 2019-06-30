package day14.com.briup.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test12 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(154, "ssssss");
		map.put(4544, "wwwwww");
		
		
		for (Integer in : map.keySet()) {
			System.out.println(in + " : " + map.get(in));
		}
		
		System.out.println("*************************");
		
		Set<Entry<Integer, String>> en = map.entrySet();
		for (Entry<Integer, String> entry : en) {
			System.out.println(entry.getKey() + ":" + entry.getValue() );
		}
		
	}
}
