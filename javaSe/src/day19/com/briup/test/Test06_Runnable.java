package day19.com.briup.test;

/*
 * �̴߳����ĵڶ��ַ�ʽ
 * 	1.����һ��Runnable��ʵ���࣬��дrun����
 * 
 * 	2.ʵ����һ��Runnableʵ�������
 * 	
 * 	3.ʵ����Thread(Runnable����),�����߳�
 * 
 * �߳���Ĭ�ϵ�����
 * 	���߳�Ĭ��  main
 * 	���߳�         Thread-n [n��0��ʼ���������]
 */
public class Test06_Runnable {
	public static void main(String[] args) throws Exception {
		//2.ʵ����Runnable����
		Runnable r = new MyRunnable();
		
		//3.ʵ����Thread����
		Thread th = new Thread(r);
		Thread th2 = new Thread(r);
		
		//�����߳�
		th.start();
		th2.start();
		
		//�������� Ҳ���� ѭ��
		for(int i = 0; i < 100; i++) {
			Thread.sleep(100);
		
			Thread th3 = Thread.currentThread();
			System.out.println(th3.getName() + " in main for,i: " + i);
		}
		
		System.out.println("main end!");
	}
}

//1.���� Runnableʵ���࣬��дrun����
class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			try {
				//���߳� ����
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//��ȡִ�е�ǰ������Ǹ� �߳�
			Thread th = Thread.currentThread();
			
			System.out.println(th.getName() + " in MyRunnable run, i: " + i);
		}
	}
}





