package com.imooc.array;

public class SortDemo {

	public static void main(String[] args) {
		// 冒泡排序
		int[] a= {12,213,342,21,123,123,43,23,43,54,65};
		System.out.print("排序前的数组元素为：");
		for(int n:a) {
			System.out.print(n+"  ");
		}
		System.out.println();
		int temp;
		for(int i=0;i<a.length-1;i++) {
			//内循环控制每次排序
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("从小到大排序后的数组元素为：");
		for(int h:a) {
			System.out.print(h+"  ");
		}

	}

}
