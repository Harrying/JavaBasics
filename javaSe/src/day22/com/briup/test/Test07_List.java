package day22.com.briup.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList<Integer>的一个对象，
 * 在这个集合中添加一个字符串数据
 */
public class Test07_List {
	public static void main(String[] args) throws Exception {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(12);
		list.add(21);
		
		//泛型 只在编译阶段 语法检查，保证类型一致
		//list.add("hello");
		
		//通过反射的方式  进行字符串添加
		Class<? extends List> clazz = list.getClass();
		//获取Method
		Method m = clazz.getMethod("add", Object.class);
		boolean b = (boolean) m.invoke(list, "hello");
		System.out.println("b: " + b);
		System.out.println(list);
	}
}






