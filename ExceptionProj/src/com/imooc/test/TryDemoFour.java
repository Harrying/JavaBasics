package com.imooc.test;

import java.util.Scanner;

public class TryDemoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testAge();
		} catch (HotelAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("酒店前台工作人员不允许办理入住登记");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * throw抛出异常的处理方案：
	 * 1.通过try..catch包含throw语句---自己抛出异常自己处理
	 * 2.通过throws在方法声明中抛出异常类型----谁调用谁处理---调用者可以自己处理也可以继续上抛
	 *   此时可以抛出与throw对象相同异常的类型，或者是他的父类Throwable
	 */
	
	
	//描述酒店入住的规则：限定年龄：18岁以下80岁以上入住必须由亲友陪同
	/*public static void testAge() {
		
	try {
	    System.out.println("请输入年龄：");
	    Scanner input=new Scanner(System.in);
		int age= input.nextInt();
		if(age<18||age>80) {
		   throw new Exception("18岁以下80岁以上入住必须由亲友陪同");
		    } else {
				System.out.println("欢迎入住本酒店");
			}
	}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		
	}*/ 
	public static void testAge() throws HotelAgeException {
		System.out.println("请输入年龄：");
	    Scanner input=new Scanner(System.in);
	    int age= input.nextInt();
	    if(age<18||age>80) {
			//throw new Exception("18岁以下80岁以上入住必须由亲友陪同");
	    	throw new HotelAgeException();
	    } else {
			System.out.println("欢迎入住本酒店");
			}
		}
			
} 

