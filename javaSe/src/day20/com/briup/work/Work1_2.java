package day20.com.briup.work;

public class Work1_2 {
	public static void main(String[] args) {
		Print1 p = new Print1();
		Thread th1 = new Thread() {
			@Override
			public void run() {
				try {
					p.printA();
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
					p.printA1();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread th3 = new Thread() {
			@Override
			public void run() {
				try {
					p.printB();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		th1.start();
		th2.start();
		th3.start();
	}
}
class Print1{
	private static int flg = 0;
	public void printA() throws Exception {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				while(flg != 0) {
					this.wait();
				}
				System.out.print("A");
				
				flg = 1;
				this.notifyAll();
			}
		}
	}
	public void printA1() throws Exception {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				while(flg != 1) {
					this.wait();
				}
				System.out.print("A");
				
				flg = 2;
				this.notifyAll();
			}
		}
	}
	
	public void printB() throws Exception {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				while(flg != 2) {
					this.wait();
				}
				System.out.print("B");
				System.out.println();
				
				flg = 0;
				this.notifyAll();
			}
		}
	}
}