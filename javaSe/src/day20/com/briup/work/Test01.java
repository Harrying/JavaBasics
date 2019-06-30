package day20.com.briup.work;

/*
 * 
	�����̷ֱ߳����A��B
	
	���������10��AB
	
	Ȼ�����޸Ĵ��� ���: AABAABAAB...
		A���20�Σ�B���10�Ρ�
 */
public class Test01 {
	// AAB AAB AAB ���
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

	//A B ������� 10��
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








