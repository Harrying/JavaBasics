package day19.com.briup.test;

/*
 * 线程创建的第一种方式
 * 	创建一个类 继承 Thread,然后重写run方法
 * 	
 * 	实例化 子类对象，让其调用start方法启动线程即可。
 * 		系统会自动找到 run()线程处理函数 去运行！
 */
public class Test05_Thread {
	public static void main(String[] args) throws Exception {
		
		//2.实例化线程对象
		Thread th = new MyThread();
				
		//3.启动自定义线程【子线程】
		th.start();
		//th.run();
		//【注意，从此处开始，run方法 就开始执行了，和main方法 并发执行】
		
		//main  主线程 循环代码
		for(int i = 0; i < 100; i++) {
			Thread.sleep(100);
			System.out.println("in main for,i: " + i);
		}
		
		System.out.println("main end!");
	}
}

//1.定义Thread子类,重写run方法，
//	注意，run方法不能抛出异常
class MyThread extends Thread {
	
	//重写run方法【线程处理函数】
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			try {
				//让线程 休眠
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("in MyThread run, i: " + i);
		}
	}
	
}






