package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			try {
//				int result = test();
//				System.out.println("one和two的商是："+result);
//			} catch (InputMismatchException e) {
//				System.out.println("请输入整数");
//				e.printStackTrace();
//			} catch (ArithmeticException e) {
//				System.out.println("除数不能为0");
//				e.printStackTrace();
//			}
		try {
			int result = test();
			System.out.println("one和two的商是："+result);		
			}catch (InputMismatchException e) {
				System.out.println("请输入整数");
				e.printStackTrace();
			} catch (ArithmeticException e) {
				System.out.println("除数不能为0");
				e.printStackTrace();
			}catch(Exception e){
				System.out.println("其他异常");
			}
		test();
	}
    /*
     * 通过throws抛出异常时针对可能出现的多种异常情况，解决方案
     * 1.throws后接多个异常类型，中间用逗号隔开
     * 2.throws后面接Exception 
     */
	/**
	 * 测试接受数据相除结果的方法
	 * @return 两个接收数据的商
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 */
	private static int test() throws ArithmeticException,InputMismatchException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("======运算开始=======");
			//抛出异常			
			System.out.println("请输入第一个整数");
			int one = sc.nextInt();
			System.out.println("请输入第二个整数");
			int two = sc.nextInt();
			System.out.println("========运算结束=========");
			return one/two;
		}
	
//	private static int test() throws Exception{
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("======运算开始=======");
//			//抛出异常			
//			System.out.println("请输入第一个整数");
//			int one = sc.nextInt();
//			System.out.println("请输入第二个整数");
//			int two = sc.nextInt();
//			System.out.println("========运算结束=========");
//			return one/two;
//		}
}
