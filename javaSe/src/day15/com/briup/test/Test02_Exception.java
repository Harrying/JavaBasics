package day15.com.briup.test;

/*
 * 异常默认处理方式
 * 	我啥都不干，直接往上一级传递，一直传递到main方法，再交给JVM
 * 	JVM获取后，直接输出错误信息，然后程序终止
 * 		谁是上一级? 当前函数的调用函数【主调函数】
 */
public class Test02_Exception {
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 4, 2, 5, 7};
		System.out.println("准备遍历数组...");
		
		outArray2(arr);
		
		System.out.println("main, 遍历数组完成!");
		
	}
	
	//在 当前方法中直接捕获异常，进行处理
	public static void outArray2(int[] array) {
		//try-catch代码块
		//	可以只跟 1个catch块，也可以跟多个catch块，
		//	可以跟finally【有且只有一个】，也可以不跟
		try {
			//可能出现异常的代码
			for (int i = 0; i <= array.length; i++) {
				if(i == 2)
					System.out.println(array[array.length]);
				else
					System.out.println(array[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("异常发生,数组越界");
		}/*catch() {
			
		}*///finally可以写，也可以不写
		
		System.out.println("outArray2, for循环遍历成功...");
	}
	
	public static void outArray(int[] array) {
		//数组越界异常  对应的情况 发生了【系统会默认抛出 该异常对象】
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
}







