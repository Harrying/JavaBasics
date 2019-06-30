package day11.com.briup.test;

import java.util.Arrays;
import java.util.Random;

/*
 * 使用Arrays工具类
 */
public class Test01_Arrays {
	
	public static void main(String[] args) {
		//1970.1.1 00:00:00  起始时间
		//不指定种子的 随机数对象，以当前系统时间(纳秒)
		Random random = new Random();
		
		for(int i = 0;i < 10;i++) {
			//生成[0,10)
			int n = random.nextInt(10);
			System.out.print(n + "  ");
		}
		System.out.println();
		
		
	}
	
	public static void main1(String[] args) {
		//二分查找，有序序列
		int[] array = {7, 1, 4, 3, 5, 11, 9};
		Arrays.sort(array);
		
		//将数组  转换成 字符串的形式，方便输出
		String str = Arrays.toString(array);
		System.out.println(str);
		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + "  ");
//		}
//		System.out.println();
		
		int value = 6;
		
		int index = Arrays.binarySearch(array, value);
		System.out.println("index: " + index);
	}
}





