package day12.com.briup.test;

public class Test01_Integer {
	public static void main(String[] args) {
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("-----------");
		
		//为了 运算过程中，拆箱装箱   效率更高
		//在Integer包装类中 -128 , 127 对应的Integer对象，已经存在缓冲数组中
		//	用户使用时，直接从缓冲数组中获取，而不用新创建new 
		Integer i5 = 128;	//2^7-1   127
		Integer i6 = 128;
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		System.out.println("-----------");
	}
}
