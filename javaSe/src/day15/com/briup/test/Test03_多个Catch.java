package day15.com.briup.test;

import javax.xml.soap.AttachmentPart;

/*
 * try  - catch  -catch
 */
public class Test03_多个Catch {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		int num = 0;
		System.out.println("开始运算");
		try {
			num = div(x, y);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: exception
			System.out.println("程序中出现数组越界异常");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("程序中出现除数为0的异常");
		}
		
		System.out.println("运算结束,结果为：" + num);
	
}
	
	public static int div(int a,int b) {
		int n = a / b;
		
		return n;
	}
}
