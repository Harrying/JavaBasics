package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = test();
		System.out.println("one和two的商是："+result);
	}

	private static int test() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("======运算开始=======");
		try {
			//抛出异常			
			System.out.println("请输入第一个整数");
			int one = sc.nextInt();
			System.out.println("请输入第二个整数");
			int two = sc.nextInt();
			return one/two;
		} catch (ArithmeticException e) {
			//算数异常
			System.out.println("除数不允许为零。");
			return 0;			
		}finally {
			//无论是否异常都执行下面代码
			System.out.println("========运算结束=========");
		}
	}

}
