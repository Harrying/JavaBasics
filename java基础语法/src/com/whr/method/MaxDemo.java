package com.whr.method;

import java.util.Scanner;

public class MaxDemo {
	//带参数无返回值的方法
	
	//求最大值的方法
	public void max(float a,float b) {
		float max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		float a= sc.nextFloat();
		System.out.println("请输入第二个数：");
		float b=sc.nextFloat();
		MaxDemo d = new MaxDemo();
		d.max(a, b);
	}

}
