package day12.com.briup.work;

import java.util.ArrayList;

/*
 * 2.实例化ArrayList对象用来存放字符串，然后存入多个字符串，
   *    然后定义一个函数，用来去除集合中字符串的重复值【可以借助另一个List】
 * public Collection<String> getSingle(Collection<String> coll);
 */
public class Work2_list {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Work2_GetSingle  ddd  = new Work2_GetSingle();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("bbbb");
		list.add("cccc");
		list.add("dddd");
		
		//遍历
		for (String ss : list) {
			System.out.println(ss);
		}
		
		ddd.getSingle(list);
		
		System.out.println("***********删除相同元素***********");
		
		
		for (String ss : list) {
			System.out.println(ss);
		}
		
	
		
	}
 
	
}


