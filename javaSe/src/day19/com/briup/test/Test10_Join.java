package day19.com.briup.test;

/*
 * join()
 * join(int mills);
 */
public class Test10_Join {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...aaaaaa i: " + i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					try {
						if(i == 10) {
							t1.join();	//插队,加入
							//t1.join(30);	//加入,有固定的时间,过了固定时间,继续交替执行
							
							//在匿名内部类中使用的局部变量，默认final修饰
							//t1 = null;
						}
						
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "...bb, i: " + i);
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}



