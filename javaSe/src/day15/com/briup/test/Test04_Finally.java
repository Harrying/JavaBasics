package day15.com.briup.test;

import java.util.Scanner;

/*
 * finally块 测试
 * 	出try_catch块，不论是否发生异常，
 * 	都会在 最后一步执行finally代码。
 * 
 * 	一般情况下，finally放入最后的 资源清理 代码
 */
public class Test04_Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;

		System.out.println("请输入一个整形数: ");
		int b = sc.nextInt();
		
		int num = getNum(a, b);
		
		System.out.println("in main, num： " + num);
		
		
	}
	
	public static int getNum(int a, int b) {
		
		int n = 0;
		try {
			n = a / b;
			
			n = 10;
		}catch(Exception e) {
			System.out.println("e.getMessage: " + e.getMessage());
			n = 20;
			//先建立返回通道，放入 n当前的值 20，在最终返回前，再去调用finally
			return n;
		}finally {
			System.out.println("in finally, n: " + n);
			n = 30;
			System.out.println("in finally,最后 n: " + n);
		}
		
		return n;
	}
	
	
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;

		System.out.println("请输入一个整形数: ");
		int b = sc.nextInt();
		
		int num = 0;
		int s = 0;
		try {
			num = a / b;
			s = 10;
		}catch (Exception e) {
			//e.printStackTrace();           e.toString()
			System.out.println("异常对象: " + e);
			s = 15;
		}finally {
			System.out.println("最后finally中释放资源...s: " + s);
			s = 20;
		}
		
		System.out.println("main end ...,s: " + s);
	}
	
	
	
}








