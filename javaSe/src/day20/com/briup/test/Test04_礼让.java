package day20.com.briup.test;

/*
 * 礼让线程 yield()
 * 建议性的
 */
public class Test04_礼让 {
	public static void main(String[] args) {
		
		Thread th1 = new Thread("线程1") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					try {
						Thread.sleep(5);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println(name + " 执行的第 " + i + " 次...");
				}
			}
		};
		
		Thread th2 = new Thread("线程2") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					try {
						Thread.sleep(5);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					//如果满足条件，让当前线程礼让
					if(i % 10 == 0)
						Thread.yield();
					System.out.println(name + " 执行的第 " + i + " 次...");
				}
			}
		};
		
		th1.start();
		th2.start();
	}
}





