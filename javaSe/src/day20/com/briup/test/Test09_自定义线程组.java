package day20.com.briup.test;

/*
 * 构造线程的时候，自己指定线程组
 * 
 */
public class Test09_自定义线程组 {
	public static void main(String[] args) {
		//1.实例化线程组对象
		ThreadGroup group = new ThreadGroup("第一组");
		ThreadGroup parent = group.getParent();
		System.out.println("parent: " + parent.getName());
		
		Thread th1 = new Thread(group, new Runnable() {
			@Override
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("线程: " + t.getName());
				System.out.println("线程组: " + t.getThreadGroup().getName());
			}
		});
		th1.setName("李四线程");
		
		th1.start();
	}
}






