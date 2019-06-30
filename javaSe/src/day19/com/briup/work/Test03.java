package day19.com.briup.work;

/*
 * 实例化两个线程，线程处理函数中都循环10次，
	一个输出A，另一个输出B，
	使用同步方法控制 交替打印A、B
 */
public class Test03 {
	public static void main(String[] args) {
	
		//准备一个标志
		final Demo d = new Demo();
		//flag为0 表示轮到 A输出，为1表示轮到B输出
		d.setFlag(0);
		
		//1.实例化线程1,输出10次A
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						//如果标志位不对，就sleep
						while(d.getFlag() != 0) {
							Thread.sleep(10);
						}
					} catch (InterruptedException e) {
							e.printStackTrace();
					}
					
					System.out.println("A");
					//修改标志位
					d.setFlag(1);
				}
			}
		};
		
		//2.实例化线程2,输出10次B
		Thread th2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						//如果标志位不对，就sleep
						while(d.getFlag() != 1) {
							Thread.sleep(10);
						}
					} catch (InterruptedException e) {
							e.printStackTrace();
					}
					
					System.out.println("B");
					//修改标志位
					d.setFlag(0);
				}
			}
		};
		
		//3.启动两个线程，交替打印
		th1.start();
		th2.start();
	}
}

class Demo {
	private int flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}






