package day19.com.briup.test;

import day18.com.briup.work.Student;

public class Test04_JVM {
	//���߳�
	public static void main(String[] args) {
		
		for(int i = 0; i < 100000; i++) {
			//��������
			new Student();
		}
		

		for(int i = 0; i < 100000; i++) {
			//��������
			System.out.println("in main . for... i: " + i);
		}
		
	}
}
