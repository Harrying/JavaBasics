package day20.com.briup.test;

/*
 * ����:��·��Ʊ,һ��100��,ͨ���ĸ���������.
 */
public class Test01_Ticket {
	public static void main(String[] args) {
		Thread th1 = new TicketsSeller("����1");
		Thread th2 = new TicketsSeller("����2");
		Thread th3 = new TicketsSeller("����3");
		Thread th4 = new TicketsSeller("����4");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}

//����һ���߳��࣬�������100��Ʊ��
//	ʵ����4�����̶߳���ͬʱ����������run����������Ʊ
class TicketsSeller extends Thread {
	//���徲̬��Ա����������� ����
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
				
				System.out.println(name + " ������ �� " + tickets + " ��Ʊ");
				tickets--;
			}
		}
	}
}





