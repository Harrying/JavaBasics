package day14.com.briup.test;

import java.util.HashMap;
import java.util.Map;

/*
 * Map集合基本使用
 * 	双列集合，存放 键值对  key-value
 * 	V put(K key,V value);	//返回之前key对应的值
 *  V remove(Object key);
 */
public class Test02_Map {
	public static void main(String[] args) {
		//HashMap底层 原理 和 HashSet一样
		Map<String, Integer> map = new HashMap<>();
		
		//姓名       年龄
		//往map集合中放入不存在的key-value，则返回null
		Integer v1 = map.put("zs", 20);
		Integer v2 = map.put("ls", 21);
		Integer v3 = map.put("ww", 19);
		Integer v4 = map.put("tom", 22);
		//往map中放入 已经存在的key值，新值替换老值，返回老值
		Integer v5 = map.put("zs", 24);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println("v5: " + v5);
		
		//删除 "zs"的键值对
		Integer v = map.remove("zs");
		System.out.println("remove zs: " + v);
		
		//清空集合
		map.clear();
		System.out.println(map.isEmpty());
		System.out.println("size: " + map.size());
		
		System.out.println(map);
		
	}
}








