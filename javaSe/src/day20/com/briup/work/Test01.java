package day20.com.briup.work;

/*
 * 
	两个线程分别输出A、B
	
	先轮流输出10次AB
	
	然后再修改代码 输出: AABAABAAB...
		A输出20次，B输出10次。
 */
public class Test01 {
	// AAB AAB AAB 输出
	public static void main(String[] args) {
		
		Printer2 p = new Printer2();
		
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

	//A B 轮流输出 10次
	public static void main1(String[] args) {
		
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

class Printer2 {
	private static int flag = 0;
	
	public void printA() throws Exception {
		for(int i = 0; i < 20; i++) {
			synchronized (this) {
				if(i % 2 == 0) {
					if(flag != 0) {
						this.wait();
					}
				}else {
					if(flag != 1) {
						this.wait();
					}
				}
			
				System.out.print("A");
				
				if(flag == 0)
					flag = 1;
				else if(flag == 1)
					flag = 2;
				
				this.notify();
			}
		}
	}
	
	public void printB() throws Exception {
		for(int i = 0; i < 10; i++) {
			synchronized (this) {
				if(flag != 2) {
					this.wait();
				}
			
				System.out.println("B");
				
				flag = 0;
				this.notify();
			}
		}
	}
	
}

class Printer {
	private static int flag = 0;
	
	public void printA() throws Exception {
		for(int i = 0; i < 10; i++) {
			synchronized (this) {
				if(flag != 0) {
					this.wait();
				}
			
				System.out.println("A");
				
				flag = 1;
				this.notify();
			}
		}
	}
	
	public void printB() throws Exception {
		for(int i = 0; i < 10; i++) {
			synchronized (this) {
				if(flag != 1) {
					this.wait();
				}
			
				System.out.println("B");
				
				flag = 0;
				this.notify();
			}
		}
	}
}








