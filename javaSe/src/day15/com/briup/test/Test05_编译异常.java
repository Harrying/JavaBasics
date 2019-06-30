package day15.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test05_编译异常 {
	
	/*
	 * 编译时异常
	 * 	除了RuntimeException及其子类，其他的异常都是 编译时异常
	 * 	程序员必须 显式处理掉{1. try-catch捕获处理; 2. throws向上传递}
	 * 	否则，编译都无法通过 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = null;
		
		//第二种，用户不处理，直接扔给上一级
//		fis = new FileInputStream("src/a.txt");
//		
//		System.out.println("file 打开成功: " + fis);
		
		//第一种  处理方式  用户直接捕获处理
		try {
			fis = new FileInputStream("src/a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("*************printStackTrace************");
			e.printStackTrace();
//			System.out.println("***********getMessage*************");
//			String message = e.getMessage();
//			System.out.println(message);
//			System.out.println("***********e*************");
//			System.out.println(e);
			
		}
		
		
	}
	
	
	//运行时异常介绍
	public static void main1(String[] args) {
		//运行时异常: RuntimeException类及其子类
		//	用户可以忽略，不显式处理，编译不会报错，只有运行时才会出问题
		//	运行时异常，往往需要程序员  修改源码
		
		int[] arr = {1, 3 , 5, 9};
		System.out.println("arr[0]: " + arr[0]);
		
		arr = null;
		System.out.println("arr[3]: " + arr[3]);
		
	}
}







