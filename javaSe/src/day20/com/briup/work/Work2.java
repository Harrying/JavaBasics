package day20.com.briup.work;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Work2 {
	public static void main(String[] args) {
		PrintNum p1 = new PrintNum();
		Thread th1 = new Thread() {
			@Override
			public void run() {
				try {
					p1.printNum();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread th2 = new Thread() {
			@Override
			public void run() {
				try {
					p1.printChar();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		th1.start();
		th2.start();
	}
}

class PrintNum{
	private static int fls = 0;
	
	private static ReentrantLock rl = new ReentrantLock();
	
	private static Condition c1 = rl.newCondition();
	private static Condition c2 = rl.newCondition();
	
	public void printNum() throws Exception {
		for (int i = 1; i < 53; i += 2) {
			rl.lock();
			if(fls != 0) {
				c1.await();
			}
			System.out.print(i);
			System.out.print(i+1);
			
			fls = 1;
			c2.signal();
			
			rl.unlock();
		}
	}
	public void printChar() throws Exception {
		for (int i = 65; i <= 90; i++) {
			rl.lock();
			if(fls != 1) {
				c2.await();
			}
			System.out.print((char)i);
			System.out.println();
			
			fls = 0;
			c1.signal();
			
			rl.unlock();
		}
	}
}