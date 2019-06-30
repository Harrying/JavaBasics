package day20.com.briup.test;

public class Test03_优先级 {
	public static void main(String[] args) {
		
		Thread th1 = new Thread("线程1") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					/*try {
						Thread.sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}*/
					
					System.out.println(name + " 执行的第 " + i + " 次...");
				}
			}
		};
		
		Thread th2 = new Thread("线程2") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					/*try {
						Thread.sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}*/
					
					System.out.println(name + " 执行的第 " + i + " 次...");
				}
			}
		};
		
		//修改线程优先级【建议性】
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(10);
		
		th1.start();
		th2.start();
		
	}
}





