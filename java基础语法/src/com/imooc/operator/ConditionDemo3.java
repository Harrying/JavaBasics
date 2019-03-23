package com.imooc.operator;

import java.util.Scanner;

public class ConditionDemo3 {

	public static void main(String[] args) {
		// 升学考试
		System.out.println("请输入英语，数学，C语言三门成绩");
		Scanner s = new Scanner(System.in);
		int English=s.nextInt();
		int Math=s.nextInt();
		int C=s.nextInt();
		int sum=English+Math+C;
		if(sum>=230&&English>=60) {
			System.out.println("此学生英语成绩"+English+"\n"+"数学成绩"+Math+"\n"+"C语言"+C+"\n"+"总分"+sum+"\n"+"可以升学");
		}else if(sum>=230&&English<60) {
			System.out.println("此学生英语成绩"+English+"\n"+"数学成绩"+Math+"\n"+"C语言"+C+"\n"+"总分"+sum+"\n"+"英语成绩不达标，不可以升学");
		}else if(sum < 230){
			System.out.println("此学生英语成绩"+English+"\n"+"数学成绩"+Math+"\n"+"C语言"+C+"\n"+"总分"+sum+"\n"+"总成绩不达标，不可以升学");
		}
		

	}

}
