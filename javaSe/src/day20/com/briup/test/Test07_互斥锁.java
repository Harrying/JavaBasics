package day20.com.briup.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 两个线程通信
 * 
 * 	通过 锁对象 进行 wait()  notify()
 */
public class Test07_互斥锁 {
	public static void main(String[] args) {
		
		Printer3 p = new Printer3();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				try {
					p.printA();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread th2 = new Thread() {
			@Override
			public void run() {
				try {
					p.printB();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread th3 = new Thread() {
			@Override
			public void run() {
				try {
					p.printC();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}

class Printer3 {
	
	//flag是一个标志，如果为0，表示轮到 A线程执行
	//				  如果为1，表示轮到 B线程执行
	private static int flag = 0;
	
	//定义一个互斥锁对象
	private static ReentrantLock rl = new ReentrantLock();
	//定义条件变量
	private static Condition c1 = rl.newCondition();
	private static Condition c2 = rl.newCondition();
	private static Condition c3 = rl.newCondition();
	
	public void printA() throws Exception {
		for(int i = 0; i < 100; i++) {
			//上锁
			//synchronized (this) {
			rl.lock();
				
				if(flag != 0) {
					//this.wait();
					c1.await();
				}
				
				System.out.print("努");
				System.out.print("力");
				System.out.print("学");
				System.out.print("习");
				System.out.println();
				
				//修改 标志，让B执行
				flag = 1;
				
				//通知线程2，执行代码
				c2.signal();
				
			//解锁
			//}
			rl.unlock();
		}
	} 
	
	public void printB() throws Exception {
		for(int i = 0; i < 100; i++) {
			//synchronized (this) {
			rl.lock();
				//判断是否轮到  当前线程 执行
				if(flag != 1) {
					//不该自己执行 则 进入等待状态
					c2.await();
				}
				
				System.out.print("挣");
				System.out.print("大");
				System.out.print("钱");
				System.out.println();
				
				//修改标志
				flag = 2;
				
				c3.signal();
			//}
			rl.unlock();
		}
	}
	
	public void printC() throws Exception {
		for(int i = 0; i < 100; i++) {
			//synchronized (this) {
			rl.lock();
				if(flag != 2) {
					c3.await();
				}
				
				System.out.print("买");
				System.out.print("C");
				System.out.print("C");
				System.out.println();
				
				//修改标志
				flag = 0;
				
				c1.signal();
			//}
			rl.unlock();
		}
	}

}




