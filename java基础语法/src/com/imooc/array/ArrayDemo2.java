package com.imooc.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 求数组元素的最大值
		int[] a= {12,34,53,12,45,6,3,12,78};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("数组a的最大值为："+max);

	}

}
