package day14.com.briup.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * 区分 HashMap  和    Hashtable
 * 	可以存放null      不能存放null键  null值
 */
public class Test07_Hashtable {
	public static void main(String[] args) {
		//HashMap是可以存放null键  null值的   效率高
		Map<String, String> map = new HashMap<>();
		
		map.put("zs", "001");
		map.put("ls", null);
		map.put(null, "005");
		map.put(null, "006");	//覆盖“005”
		
		System.out.println(map);
		
		//Hashtable不可以存放null键  null值的     另外其线程安全，效率低
		Map<String, String> map2 = new Hashtable<>();
		map2.put("tom", "010");
		map2.put("jack", null);
		map2.put(null, "012");
		
		System.out.println(map2);
		
	}
}






