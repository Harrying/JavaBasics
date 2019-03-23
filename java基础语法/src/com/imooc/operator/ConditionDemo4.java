package com.imooc.operator;

import java.util.Scanner;

public class ConditionDemo4 {

	public static void main(String[] args) {
		//  判断是否是闰年
		System.out.println("请输入需要判断的年份：");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if((n%4==0&&n%100!=0)|(n%400==0)){
			System.out.println(n+"是闰年");
		}else {
			System.out.println(n+"不是闰年");
		}
		}

	}
