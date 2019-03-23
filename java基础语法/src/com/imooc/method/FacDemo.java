package com.imooc.method;

import java.util.Scanner;

public class FacDemo {
	//带参数有返回值的方法
	
	//方法不能嵌套定义
	//求阶乘的方法
	public int fac(int n) {
		int s=1;
		for(int i=1;i<=n;i++) {
			s*=i;
			}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入求阶乘的数字：");
		int n=sc.nextInt();
		FacDemo a=new FacDemo();
		System.out.println(n+"！="+a.fac(n));
		
		//求阶乘的和
		int sum=0,d=0;
		for(int i=1;i<=n;i++) {
			d=a.fac(i);
			sum=sum+d;
		}
		System.out.println(n+"内所有数的阶乘和为："+sum);

	}

}
