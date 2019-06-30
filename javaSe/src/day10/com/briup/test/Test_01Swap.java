package day10.com.briup.test;

public class Test_01Swap {
	public static void main(String[] args) {
		
		/*
		 * int x = 10; int y = 20; swap(x,y); System.out.println("x:" + x + "y:" + y);
		 * int[] x1 = {10}; int[] x2 = {20}; swap1(x1, x2); System.out.println("x1[0]:"
		 * + x1[0]+"    " + "x2[0]" + x2[0]);
		 */ 	
		int[] array = {8,4,6,2,5,7};
		change(array);
		
	}
	//传值调用
	public static void change(int[] arr) {
		int len = arr.length;
		for(int i = 0;i < len/2;i++) {
			arr[i] = arr[i] ^ arr[len-i-1];
			arr[len-i] = arr[i] ^ arr[len-i-1];
			arr[i] = arr[i] ^ arr[len-i-1];
		}
	}
	
	
	//传值调用
	public static void swap(int a,int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
	public static void swap1(int[] x1,int[] x2) {
		x1[0] = x1[0] ^ x2[0]; 
		x2[0] = x1[0] ^ x2[0]; 
		x1[0] = x1[0] ^ x2[0]; 
		
	}
}
