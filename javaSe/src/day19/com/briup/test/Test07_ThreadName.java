package day19.com.briup.test;

public class Test07_ThreadName {
	public static void main(String[] args) throws Exception {
		
		//Thread(Runnable r,String name);
		
		//匿名内部类的形式  获取 Runnable实现类对象
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					try {
						//让线程 休眠
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String name = Thread.currentThread().getName();
					System.out.println(name + " in MyRunnable run, i: " + i);
				}
			}
		},"子线程1");
		
		//th1.run();
		
		th1.start();
		
		Thread th3 = Thread.currentThread();
		th3.setName("主线程");
		
		String name = th3.getName();
		//添加主线程循环
		for(int i = 0; i < 100; i++) {
			Thread.sleep(100);
		
			System.out.println(name + " in main for,i: " + i);
		}
		
		System.out.println("main end!");
	}
}
