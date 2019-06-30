package day14.com.briup.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 测试 Map中判断  遍历功能
 */
public class Test03_判断遍历 {
	public static void main(String[] args) {
		//第二种遍历方式: 获取所有的key-value【键值对】，然后遍历拆分
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "tom");
		map.put(5, "lily");
		map.put(3, "jack");
		map.put(4, "rose");
		map.put(2, "jack");
		map.put(4, "rose");
		
		//获取所有的键值对 
		//Set<Entry<Integer, String>> set = map.entrySet();
		for (Entry<Integer, String> entry : map.entrySet()) {
			//Integer key = entry.getKey();
			//String value = entry.getValue();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	public static void main2(String[] args) {
		//集合的遍历方法1: 先获取所有的key,遍历key,再由key获取value
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "tom");
		map.put(5, "lily");
		map.put(3, "jack");
		map.put(4, "rose");
		map.put(2, "jack");
		map.put(4, "rose");
		
		//遍历方法1: 先获取所有的key,遍历key,再由key获取value
		/*Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			
			System.out.println("key: " + key + " value: " + value);
		}*/
		
		for (Integer key : map.keySet()) {
			//String value = map.get(key);
			System.out.println(key + ": " + map.get(key));
		}
		
		
		
		
	}
	
	public static void main1(String[] args) {
		//    学号     姓名   
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "tom");
		map.put(5, "lily");
		map.put(3, "jack");
		map.put(4, "rose");
		map.put(2, "jack");
		map.put(4, "rose");
		
		//判断是否 包含  key： 4
		boolean b1 = map.containsKey(4);
		//判断是否 包含 value: lucy
		boolean b2 = map.containsValue("lucy");
		
		System.out.println(b1);
		System.out.println(b2);
		
		//获取功能，根据键 获取值
		String value = map.get(10);
		System.out.println("10: " + value);
		
		//获取所有的键  得到set集合
		Set<Integer> set = map.keySet();
		System.out.println("keySet: " + set);
		
		//获取所有的值
		Collection<String> coll = map.values();
		System.out.println("values: " + coll);
		
	}
}








