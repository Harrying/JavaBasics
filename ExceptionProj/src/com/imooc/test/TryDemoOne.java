package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		// 要求定义连个整数，输出两数之商
		try {
			//抛出异常
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个整数");
			int one = sc.nextInt();
			System.out.println("请输入第二个整数");
			int two = sc.nextInt();
			System.out.println(one + "和" + two + "的商是:" + (one / two));
		} catch (ArithmeticException e) {
			//算数异常
			System.exit(1);//终止程序运行
			System.out.println("除数不允许为零。");
			e.printStackTrace();//输出错误代码
			
		}catch (InputMismatchException e) {
			//输入格式异常
			System.out.println("请输入整数.");
			e.printStackTrace();
		}catch (Exception e) {
			//捕获上述无法识别的异常
			System.out.println("出错了---.");
			e.printStackTrace();
		}finally {
			//无论是否异常都执行下面代码
			System.out.println("========运算结束=========");
		}
	}

}
