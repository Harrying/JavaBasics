package day20.com.briup.work;

/*
 * 
	创建两个线程，其中一个输出1到52，另外一个输出A到Z。
	输出格式要求：
		12A 34B 56C 78D 5152Z
 */
public class Test02 {
	public static void main(String[] args) {
		Printer3 p = new Printer3();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				try {
					p.print1();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread th2 = new Thread() {
			@Override
			public void run() {
				try {
					p.print2();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		th1.start();
		th2.start();
	}
}

class Printer3 {
	private static int flag = 0;
	
	public void print1() throws Exception {
		for(int i = 1; i <= 52; i++) {
			synchronized (this) {
				if(i % 2 != 0) {
					if(flag != 0) {
						this.wait();
					}
				}else {
					if(flag != 1) {
						this.wait();
					}
				}
			
				System.out.print(i);
				
				if(flag == 0)
					flag = 1;
				else if(flag == 1)
					flag = 2;
				
				this.notify();
			}
		}
	}
	
	public void print2() throws Exception {
		for(int i = 'A'; i <= 'Z'; i++) {
			synchronized (this) {
				if(flag != 2) {
					this.wait();
				}
			
				System.out.println((char)i);
				
				flag = 0;
				this.notify();
			}
		}
	}
	
}
