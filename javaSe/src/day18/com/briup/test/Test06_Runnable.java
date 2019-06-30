package day18.com.briup.test;
/*
 * 线程创建的第二种方式
 * 	1.创建一个Runnable实现类  重写run方法
 * 
 * 	2.实例化一个
 */
public class Test06_Runnable {
	public static void main(String[] args) throws Exception {
		//实例化对象
		Runnable r = new MyRunnable();
		
		Thread th = new Thread(r);
		Thread th2 = new Thread(r);
		
		th.start();
		th2.start();
		
		
		for (int i = 0; i < 100; i++) {
			Thread.sleep(100);
			Thread th3 = Thread.currentThread();
			System.out.println(th3.getName() + "in main for , i:" + i);
		}
		
		
		System.out.println("main end!");
	}
}


class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			//线程休眠
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//获取当前执行代码的线程
			Thread th = Thread.currentThread();
			
			
			System.out.println(th.getName()+"in MyRunnable run , i :" + i);
		}
	}
	
}