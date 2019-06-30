package day20.com.briup.test;

/*
 * 获取并输出 线程默认所属的线程组
 * 
 * 	默认情况下，主线程创建的所有子线程，都属于main这个线程组
 */
public class Test08_ThreadGroup {
	public static void main(String[] args) {
		Thread th1 = new Thread("张三线程") {
			@Override
			public void run() {
				//输出 当前线程名，再输出 所属线程组名称
				String name = this.getName();
				System.out.println("当前线程: " + name);
				
				String gName = this.getThreadGroup().getName();
				System.out.println("所属线程组: " + gName);
			}
		};
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				//获取当前线程 然后再获取线程名称
				Thread t = Thread.currentThread();
				System.out.println("线程: " + t.getName());
				System.out.println("线程组: " + t.getThreadGroup().getName());
			}
		},"李四线程");
		
		th1.start();
		th2.start();
		
		//输出 主线程的名字和 所属线程组
		Thread mTh = Thread.currentThread();
		System.out.println("mian: " + mTh.getName());
		System.out.println("mian组: " + mTh.getThreadGroup().getName());
	}
}





