package day19.com.briup.test;

/*
 * 同步 代码块 
 * 	synchronized(锁对象) {
 * 		需要锁住的代码段
 *  }
 * 同步 方法
 */
public class Test11_Synchronized {
	public static void main(String[] args) {
		Printer p = new Printer();
		//Printer p2 = new Printer();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					p.print1();
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

class Printer {
	//线程同步,
	//当线程执行一截代码的时候，必须保证系统只分配给我cpu
	
	public void print1() {
		//同步代码块
		//	保证，多个线程中 同步代码块使用同一把锁
		//		多个线程 都要遵循 规则
		synchronized (this) {
			System.out.print("我");
			System.out.print("要");
			System.out.print("赚");
			System.out.print("大");
			System.out.print("钱");
			System.out.print("\r\n");
		}
	}
	
	public void print2() {
		synchronized (this) {
			System.out.print("努");
			System.out.print("力");
			System.out.print("学");
			System.out.print("习");
			System.out.print("\r\n");
		}
	}
	
}




