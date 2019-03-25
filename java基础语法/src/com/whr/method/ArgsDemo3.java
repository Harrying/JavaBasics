package com.whr.method;
/**
 * 文档注释
 * @author whr
 * @version1.0
 */
public class ArgsDemo3 {
	//可变参数列表所在的方法是最后访问的。
	/*
	 多行注释
	 */
	
	
	public int plus(int a,int b) {
		System.out.println("不可变参数的方法被调用！");
		return a+b;
	}
	
	public int plus(int...a) {
		int sum=0;
		for(int n:a) {
			sum=sum+n;
		}
		System.out.println("带可变参数的方法被调用！");
		return sum;
	}

	public static void main(String[] args) {
		ArgsDemo3 ad = new ArgsDemo3();
		System.out.println("和为"+ad.plus(1,2));

	}

}
