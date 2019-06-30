package day12.com.briup.test;

import day12.com.briup.bean.InterImpl;
import day12.com.briup.bean.InterImpl2;

/*
 * 泛型接口 的 实现类 测试
 */
public class Test07_Inter {
	public static void main(String[] args) {
		//1.泛型接口的实现类  也是 泛型类
		InterImpl<String,Integer> inter = new InterImpl<>(); 
		inter.show("hello");
		inter.disp(123);
		
		//2.泛型接口第二种形式  其实现类是具体类
		InterImpl2 iter2 = new InterImpl2();
		iter2.show(12);
		iter2.disp("hello");
	}
}



