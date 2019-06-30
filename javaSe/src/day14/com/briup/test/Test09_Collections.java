package day14.com.briup.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Arrays 数组工具类
 * Collections工具类
 * 		public static <T> void sort(List<T> list)
		public static <T> int binarySearch(List<?> list,T key)
		public static <T> T max(Collection<?> coll)
		public static void reverse(List<?> list)
		public static void shuffle(List<?> list)
 */
public class Test09_Collections {
	public static void main(String[] args) {
		//调用static泛型方法，不需要指定 泛型类型，系统会自动根据 实参来确定泛型
		List<Integer> list = Arrays.asList(3,1,4,1,2,5);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Integer max = Collections.max(list);
		System.out.println("max: " + max);
		
//		Collections.reverse(list);
//		System.out.println(list);
		
		//二分查找一定对  有序序列，集合中成员类型，要实现Comparable接口
		int index = Collections.binarySearch(list, 3);
		System.out.println(index);
		
		//随机打乱次序
		Collections.shuffle(list);
		System.out.println(list);
	}
}







