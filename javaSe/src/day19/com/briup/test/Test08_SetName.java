package day19.com.briup.test;

/*
 * 匿名内部类 实例化对象
 * 然后使用setName修改线程名称
 */
public class Test08_SetName {
	
	//典型面试题
	public static void main(String[] args) {
		
		Thread th1 = new Thread() {
			//当run执行完成后，子线程自动销毁
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				Thread cTh = Thread.currentThread();
				System.out.println("cTh: " + cTh.getName());
				//cTh.setName("子线程");
				System.out.println("run: 线程名已经修改: " + this.getName());
			}
		};
		
		th1.setName("子线程1");
		
		//th1.start();
		th1.run();
		
		//JVM中，主线程|进程 会等待 所有的子线程全部终止，然后程序才退出
		//												进程结束
		System.out.println("in main, end...");
		//System.exit(1);
	}
}






