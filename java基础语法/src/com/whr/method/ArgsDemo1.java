package com.whr.method;

public class ArgsDemo1 {
	//查找
	//参数列表中如果有两个以上的参数，可变参数一定是在最后的
	public void search(int n,int...a) {
		//可变参数列表和数组兼容
		boolean flag=false;
		for(int a1:a) {
			if(a1==n) {
				flag=true;break;
			}
		}
		if(flag) {
			System.out.println("找到了"+n);
		}else {
			System.out.println("没找到"+n);
		}
	}

	public static void main(String[] args) {
		ArgsDemo1 ad=new ArgsDemo1();
		int[] a= {1,2,3,4,5,6};
		ad.search(3, a);
		

	}

}
