package com.whr.method;

public class MathDemo {
	
	//求两个int类型的和
	public int plus(int m,int n) {
		return m+n;
	}
	
	//求两个double类型的和
	public double plus(double m,double n) {
		return m+n;
	}
	//求数组元素的累加和
	public int plus(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
	  return sum;	
	}
	public static void main(String[] args) {
		int m=5,n=9;
		int[] arr= {1,2,3,4,5,6};
		MathDemo mathDemo = new MathDemo();
		System.out.println("int类型的累加和"+mathDemo.plus(m, n));
		System.out.println("double类型的累加和"+mathDemo.plus(4.5,4.5));
		System.out.println("数组元素的累加和"+mathDemo.plus(arr));
		

	}

}
