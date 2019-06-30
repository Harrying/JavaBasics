package day10.com.briup.test;

import java.util.Scanner;

/*
 * 测试Scanner类方法
 */
public class Test03_Scanner {
	public static void main(String[] args) {
		//黄色波浪线  警告 
		//红色波浪线  错误  编译通不过 
		Scanner sc = new Scanner(System.in);
		
		//用的最多的
		System.out.println("请录入用户名 和 年龄: ");
		//nextLine录入时  不会录入换行符
		String str = sc.nextLine();
		System.out.println("str: " + str);
		
		String[] sarr = str.split(" ");
		System.out.println("len: " + sarr.length);
		String name = sarr[0];
		
		//将字符串  转换成 int:
		//	int = Integer.parseInt(String);
		int age = Integer.parseInt(sarr[1]);
		System.out.println("age: " + age);
		
		
		//进行字符串拆分 转换【String干的事】
		
//		int a = sc.nextInt();
//		System.out.println("a: " + a);
		
		System.out.println("main end!");
		
		/*if(sc.hasNextInt()) {
			int a = sc.nextInt();
			System.out.println("a: " + a);
		}else if(sc.hasNextDouble()) {
			double d = sc.nextDouble();
			System.out.println("d: " + d);
		}*/
		
	}
}






