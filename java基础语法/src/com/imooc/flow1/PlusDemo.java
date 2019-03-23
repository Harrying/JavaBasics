package com.imooc.flow1;

public class PlusDemo {

	public static void main(String[] args) {
		// 求1-50的累加和
		int i = 0,sum=0;
		while(i<=50) {
			sum=sum+i;
			i++;
		}
		System.out.println("1-50累加和为"+sum);

	}

}
