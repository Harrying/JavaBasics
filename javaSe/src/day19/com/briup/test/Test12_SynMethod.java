package day19.com.briup.test;

/*
 * 同步 代码块 
 * 	synchronized(锁对象) {
 * 		需要锁住的代码段
 *  }
 * 同步 方法
 */
public class Test12_SynMethod {
	public static void main(String[] args) {
		Printer2 p = new Printer2();
		//Printer p2 = new Printer();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					//p.print1();
					Printer2.print3();
				}
			}
		};
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					p.print2();
				}
			}
		});
		
		th1.start();
		th2.start();
	}
}

class Printer2 {
	//线程同步,
	//当线程执行一截代码的时候，必须保证系统只分配给我cpu
	
	//同步方法: synchronized直接修饰 函数
	//	将方法体 全部锁住
	//	普通的同步方法，默认的锁对象是 ? 【this】
	public synchronized void print1() {
		//synchronized (this) {
			System.out.print("我");
			System.out.print("要");
			System.out.print("赚");
			System.out.print("大");
			System.out.print("钱");
			System.out.print("\r\n");
		//}
	}
	
	//静态的同步方法   默认的锁对象 ? 【本类字节码对象】  
	//	本类名.class
	public static synchronized void print3() {
		System.out.print("我");
		System.out.print("要");
		System.out.print("赚");
		System.out.print("大");
		System.out.print("钱");
		System.out.print("\r\n");
	}
	
	public void print2() {
//		synchronized (this) {
		synchronized (Printer2.class) {
			System.out.print("努");
			System.out.print("力");
			System.out.print("学");
			System.out.print("习");
			System.out.print("\r\n");
		}
	}
	
}




