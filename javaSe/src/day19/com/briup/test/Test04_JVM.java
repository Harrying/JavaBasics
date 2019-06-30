package day19.com.briup.test;

import day18.com.briup.work.Student;

public class Test04_JVM {
	//主线程
	public static void main(String[] args) {
		
		for(int i = 0; i < 100000; i++) {
			//匿名对象
			new Student();
		}
		

		for(int i = 0; i < 100000; i++) {
			//匿名对象
			System.out.println("in main . for... i: " + i);
		}
		
	}
}
