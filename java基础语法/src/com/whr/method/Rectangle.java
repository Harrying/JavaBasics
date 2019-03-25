package com.whr.method;

import java.util.Scanner;

public class Rectangle {
	//无参数带返回值的方法
	
	//求长方形面积的方法
	public int area() {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		int length=sc.nextInt();
		System.out.println("请输入长方形的宽：");
		int width=sc.nextInt();
		
		int getArea=length*width;
		return getArea;
	}

	public static void main(String[] args) {
		Rectangle rc =new Rectangle();
		int ar=rc.area();
		System.out.println("长方形面积的值为："+ar);
	}

}
