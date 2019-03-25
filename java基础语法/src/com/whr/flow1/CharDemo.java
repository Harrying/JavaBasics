package com.whr.flow1;

public class CharDemo {

	public static void main(String[] args) {
		// 循环输出26个英文字母
		char ch='a';
		int count =1;
		while(ch<='z') {
			System.out.print(ch+" ");
			if(count%13==0)
				System.out.print("\n");
			count++;
			ch++;
		}

	}

}
