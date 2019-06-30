package day14.com.briup.test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import day14.com.briup.bean.Student2;

/*
 * TreeMap案例
 */
public class Test08_TreeMap {
	public static void main(String[] args) {
		//	name   student
		//往map中添加的时候，按照 名字逆序输出
		//	可以 传递比较器对象 实现 新的排序算法
		Map<String, Student2> map = new TreeMap<>(new Comparator<String>() {
			//先按照名字的长度排序【长的放前面】, 再按照自然排序【逆序】
			@Override
			public int compare(String o1, String o2) {
				int num = o2.length() - o1.length();
				
				if(num == 0) {
					num = o2.compareTo(o1);
				}
				
				return num;
			}
		});
		
		map.put("tom", new Student2("tom",23.4,56.2,34.5));
		map.put("jack", new Student2("jack",42.4,69.2,24.5));
		map.put("lucy", new Student2("lucy",73.4,62.2,54.5));
		map.put("zs", new Student2("zs",23.4,51.2,39.5));
		map.put("tom", new Student2("Tom",23.4,65.2,34.5));
		
		System.out.println("size: " + map.size());
		
		for (String key : map.keySet()) {
			Student2 value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
	
	public static void main2(String[] args) {
		//	name   student
		Map<String, Student2> map = new TreeMap<>();
		//往map中添加的时候，按照 名字逆序输出
		//	通过String重写Comparable，不可以，因为String类是JDK提供的，不可以修改
		//	但可以 传递比较器对象 实现 新的排序算法
		
		map.put("tom", new Student2("tom",23.4,56.2,34.5));
		map.put("jack", new Student2("jack",42.4,69.2,24.5));
		map.put("lucy", new Student2("lucy",73.4,62.2,54.5));
		map.put("zs", new Student2("zs",23.4,51.2,39.5));
		map.put("tom", new Student2("Tom",23.4,65.2,34.5));
		
		System.out.println("size: " + map.size());
		
		for (String key : map.keySet()) {
			Student2 value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
	
	public static void main1(String[] args) {
		//底层会对 key进行二叉树排序
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(10, "tom");
		map.put(5, "jack");
		map.put(1, "ww");
		map.put(3, "ls");
		map.put(7, "zs");
		map.put(5, "tom");
		
		System.out.println("size: " + map.size());
		System.out.println(map);
	}
}








