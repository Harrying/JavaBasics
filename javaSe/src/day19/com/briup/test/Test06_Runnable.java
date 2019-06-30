package day19.com.briup.test;

/*
 * 线程创建的第二种方式
 * 	1.创建一个Runnable的实现类，重写run方法
 * 
 * 	2.实例化一个Runnable实现类对象
 * 	
 * 	3.实例化Thread(Runnable对象),启动线程
 * 
 * 线程有默认的命名
 * 	主线程默认  main
 * 	子线程         Thread-n [n从0开始，逐个递增]
 */
public class Test06_Runnable {
	public static void main(String[] args) throws Exception {
		//2.实例化Runnable对象
		Runnable r = new MyRunnable();
		
		//3.实例化Thread对象
		Thread th = new Thread(r);
		Thread th2 = new Thread(r);
		
		//启动线程
		th.start();
		th2.start();
		
		//主方法中 也进行 循环
		for(int i = 0; i < 100; i++) {
			Thread.sleep(100);
		
			Thread th3 = Thread.currentThread();
			System.out.println(th3.getName() + " in main for,i: " + i);
		}
		
		System.out.println("main end!");
	}
}

//1.创建 Runnable实现类，重写run方法
class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			try {
				//让线程 休眠
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//获取执行当前代码的那个 线程
			Thread th = Thread.currentThread();
			
			System.out.println(th.getName() + " in MyRunnable run, i: " + i);
		}
	}
}





