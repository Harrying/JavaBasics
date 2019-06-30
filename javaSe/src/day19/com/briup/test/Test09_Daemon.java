package day19.com.briup.test;

/*
 * �ػ��߳�
 * 	��һ���߳�����Ϊ�ػ��߳�֮�󣬵��������ػ��߳̽�����
 * ���߳��Զ���ֹ��
 * 
 */
public class Test09_Daemon {
	public static void main(String[] args) throws Exception {
		
		Thread th1 = new Thread("�����߳�") {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " i: " + i);
				}
			}
		};
		
		//���� Ϊ �ػ��߳�
		th1.setDaemon(true);
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 20; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " i: " + i);
				}
			}
		},"�����߳�");
		
		th1.start();
		th2.start();
		
		//�����߳� �޸�����
		Thread mTh = Thread.currentThread();
		mTh.setName("���߳�");
		for(int i = 0; i < 50; i++) {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + " i: " + i);
		}
		
	}
}






