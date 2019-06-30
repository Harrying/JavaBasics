package day18.com.briup.test;
/*
 * �̴߳����ĵڶ��ַ�ʽ
 * 	1.����һ��Runnableʵ����  ��дrun����
 * 
 * 	2.ʵ����һ��
 */
public class Test06_Runnable {
	public static void main(String[] args) throws Exception {
		//ʵ��������
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
			//�߳�����
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//��ȡ��ǰִ�д�����߳�
			Thread th = Thread.currentThread();
			
			
			System.out.println(th.getName()+"in MyRunnable run , i :" + i);
		}
	}
	
}