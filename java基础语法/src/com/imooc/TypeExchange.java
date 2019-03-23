package com.imooc;

public class TypeExchange {
	
	public static void main(String[] args) {
		// char类型和int类型之间的转换
		char c = (char)65536;
		
		int n;
		n=c;//隐式类型转换
		c=(char) n;
		
		//整数和浮点型类型的转换
		int x = 100;
		long y =x;
		x= (int)y;
		float f =100000000000000000L;
		System.out.println("f="+f);
		float f1= 1346455855;
		System.out.println("f1="+f1);
	}

}
