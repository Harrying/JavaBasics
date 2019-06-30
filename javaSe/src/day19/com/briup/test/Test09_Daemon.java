package day19.com.briup.test;

/*
 * 守护线程
 * 	将一个线程设置为守护线程之后，当其他非守护线程结束后，
 * 该线程自动终止。
 * 
 */
public class Test09_Daemon {
	public static void main(String[] args) throws Exception {
		
		Thread th1 = new Thread("张三线程") {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " i: " + i);
				}
			}
		};
		
		//设置 为 守护线程
		th1.setDaemon(true);
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 20; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " i: " + i);
				}
			}
		},"李四线程");
		
		th1.start();
		th2.start();
		
		//给主线程 修改名字
		Thread mTh = Thread.currentThread();
		mTh.setName("主线程");
		for(int i = 0; i < 50; i++) {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + " i: " + i);
		}
		
	}
}






