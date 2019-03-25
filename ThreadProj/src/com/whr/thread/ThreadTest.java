package com.whr.thread;

class MyThread extends Thread{
	public void run() {
		System.out.println(getName()+"该线程正在执行！");
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("主线程1");
		MyThread mt= new  MyThread();
		mt.start();//启动线程（线程不能多次启动）
		System.out.println("主线程2");

	}

}
