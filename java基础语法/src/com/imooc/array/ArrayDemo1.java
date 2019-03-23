package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 求整形数组的累加和
		int[] aa=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<aa.length;i++) {
			System.out.println("请输入数组aa的第"+(i+1)+"个元素：");
			aa[i]=sc.nextInt();
		}
		System.out.print("数组元素的内容为：");
		for(int i=0;i<aa.length;i++) {
			System.out.print(aa[i]+"  ");
		}
		System.out.println();
		System.out.print("使用增强型for循环输出数组内的元素：");
		for(int n:aa) {
			System.out.print(n+"  ");
		}
		System.out.println();
		int sum =0;
		for(int i=0;i<6;i++) {
			sum=sum+aa[i];
		}
		System.out.println("数组aa所有元素的和为："+sum);

	}

}
