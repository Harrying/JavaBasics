package day14.com.briup.test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * LinkedHashSet
 * 	存取顺序一致的  HashSet
 * 
 * LinkedHashMap
 */
public class Test06_LinkedHashSet {
	//测试LinkedHashMap
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		
		map.put(3, "zs");
		map.put(5, "ls");
		map.put(1, "tom");
		map.put(2, "kevin");
		map.put(3, "zs");
		map.put(2, "larry");
		
		System.out.println(map);
	}
	
	public static void main1(String[] args) {
		//整理包  ctrl+shift+o
		Set<String> set = new LinkedHashSet<>();
		//Set<String> set = new HashSet<>();
		
		set.add("world");
		set.add("hello");
		set.add("hello");
		set.add("abc");
		set.add("bcd");
		set.add("cvd");
		set.add("vcd");
		set.add("vcd");
		
		System.out.println(set);
		
	}
}






