package day20.com.briup.work;

public class Work1 {
	public static void main(String[] args) {
		Print p = new Print();
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
					p.printB();
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
class Print{
	private static int flg = 0;
	public void printA() throws Exception {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				if(flg != 0) {
					this.wait();
				}
				System.out.print("A");
				
				flg = 1;
				this.notify();
			}
		}
	}
	public void printB() throws Exception {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				if(flg != 1) {
					this.wait();
				}
				System.out.print("B");
				System.out.println();
				
				flg = 0;
				this.notify();
			}
		}
	}
}