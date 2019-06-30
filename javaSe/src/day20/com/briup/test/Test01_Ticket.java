package day20.com.briup.test;

/*
 * 需求:铁路售票,一共100张,通过四个窗口卖完.
 */
public class Test01_Ticket {
	public static void main(String[] args) {
		Thread th1 = new TicketsSeller("窗口1");
		Thread th2 = new TicketsSeller("窗口2");
		Thread th3 = new TicketsSeller("窗口3");
		Thread th4 = new TicketsSeller("窗口4");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}

//定义一个线程类，里面包含100张票，
//	实例化4个子线程对象，同时启动，运行run函数进行售票
class TicketsSeller extends Thread {
	//定义静态成员，所有类对象 共享
	private static int tickets = 100;
	
	public TicketsSeller() {}
	
	public TicketsSeller(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String name = this.getName();
		
		while(true) {
			synchronized (TicketsSeller.class) {
				if(tickets <= 0)
					break;
				
				System.out.println(name + " 正在卖 第 " + tickets + " 张票");
				tickets--;
			}
		}
	}
}





