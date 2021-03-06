package day20.com.briup.test;

/*
 * 两个线程通信
 * 
 * 	通过 锁对象 进行 wait()  notify()
 */
public class Test05_通信2 {
	public static void main(String[] args) {
		
		Printer p = new Printer();
		
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
		
		th1.start();
		th2.start();
		
	}
}

class Printer {
	
	//flag是一个标志，如果为0，表示轮到 A线程执行
	//				  如果为1，表示轮到 B线程执行
	private static int flag = 0;
	
	public void printA() throws Exception {
		for(int i = 0; i < 100; i++) {
			synchronized (this) {
				
				if(flag != 0) {
					this.wait();
				}
				
				System.out.print("努");
				System.out.print("力");
				System.out.print("学");
				System.out.print("习");
				System.out.println();
				
				//修改 标志，让B执行
				flag = 1;
				//通知另一个线程执行
				this.notify();
			}
		}
	} 
	
	public void printB() throws Exception {
		for(int i = 0; i < 100; i++) {
			synchronized (this) {
				//判断是否轮到  当前线程 执行
				if(flag != 1) {
					//不该自己执行 则 进入等待状态
					this.wait();
				}
				
				System.out.print("挣");
				System.out.print("大");
				System.out.print("钱");
				System.out.println();
				
				//修改标志
				flag = 0;
				//通知另一个线程执行
				this.notify();
			}
		}
	}
}




