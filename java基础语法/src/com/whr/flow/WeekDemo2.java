package com.whr.flow;

import java.util.Scanner;

public class WeekDemo2 {

	public static void main(String[] args) {
		// switch语句 实现对应星期
		System.out.println("请输入表示星期的英文单词");
		Scanner sc = new Scanner(System.in);
		String week = sc.next();
		week=week.toUpperCase();//把字符串中的字符全部改为大写
		switch (week) {
		case "MONDAY":
			System.out.println("星期一");
			break;
		case "TUESDAY":
			System.out.println("星期二");
			break;
		case "WEDNESDAY":
			System.out.println("星期三");
			break;
		case "THURSDAY":
			System.out.println("星期四");
			break;
		case "FRIDAY":
			System.out.println("星期五");
			break;
		case "SATURDAY":
			System.out.println("星期六");
			break;
		case "SUNDAY":
			System.out.println("星期日");
			break;
		default:
			System.out.println("单词输入错误");
		}

	}

}
