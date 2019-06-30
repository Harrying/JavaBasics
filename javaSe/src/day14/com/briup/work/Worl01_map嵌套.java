package day14.com.briup.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day14.com.briup.bean.Student2;

public class Worl01_mapÇ¶Ì× {
	public static void main(String[] args) {
		Map<String, Student2>  javaClass1 = new HashMap<String, Student2>();
		Map<String, Student2>  javaClass2 = new HashMap<String, Student2>();
		Map<String, Map<String, Student2>>  RJKAMap = new HashMap<String, Map<String, Student2>>();
		
		javaClass1.put("zs", new Student2("zs", 88, 99, 55));
		javaClass1.put("li", new Student2("li", 88, 99, 55));
		javaClass1.put("qq", new Student2("qq", 88, 99, 55));
		javaClass1.put("ww", new Student2("ww", 88, 99, 55));
		javaClass1.put("ee", new Student2("ee", 88, 99, 55));
		javaClass2.put("rr", new Student2("rr", 88, 99, 55));
		javaClass2.put("tt", new Student2("tt", 88, 99, 55));
		javaClass2.put("yy", new Student2("yy", 88, 99, 55));
		javaClass2.put("uu", new Student2("uu", 88, 99, 55));
		javaClass2.put("oo", new Student2("oo", 88, 99, 55));
		
		RJKAMap.put("java1", javaClass1);
		RJKAMap.put("java2", javaClass2);
		
		
		for (String s : RJKAMap.keySet()) {
			System.out.println(s + " : " + RJKAMap.get(s));
		}
		
		
		/*Set<Entry<String, Map<String, Student2>>> ss = RJKAMap.entrySet();
		for (Entry<String, Map<String, Student2>> entry : ss) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
			System.out.println();
		}*/
		
		
	}
}
