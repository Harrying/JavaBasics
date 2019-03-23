package com.imooc.operator;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// 商场打折
		double price1=80,price2=55;
		double sum= price1+price2;
	    System.out.println("原价为"+sum);
		if(sum>100) {
			sum=sum-20;//sum-=20;
			System.out.println("折后价格为"+sum);	
		}
	}

}
