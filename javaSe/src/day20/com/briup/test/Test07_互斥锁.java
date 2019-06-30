package day20.com.briup.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * �����߳�ͨ��
 * 
 * 	ͨ�� ������ ���� wait()  notify()
 */
public class Test07_������ {
	public static void main(String[] args) {
		
		Printer3 p = new Printer3();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				try {
					p.printA();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread th2 = new Thread() {
			@Override
			public void run() {
				try {
					p.printB();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread th3 = new Thread() {
			@Override
			public void run() {
				try {
					p.printC();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}

class Printer3 {
	
	//flag��һ����־�����Ϊ0����ʾ�ֵ� A�߳�ִ��
	//				  ���Ϊ1����ʾ�ֵ� B�߳�ִ��
	private static int flag = 0;
	
	//����һ������������
	private static ReentrantLock rl = new ReentrantLock();
	//������������
	private static Condition c1 = rl.newCondition();
	private static Condition c2 = rl.newCondition();
	private static Condition c3 = rl.newCondition();
	
	public void printA() throws Exception {
		for(int i = 0; i < 100; i++) {
			//����
			//synchronized (this) {
			rl.lock();
				
				if(flag != 0) {
					//this.wait();
					c1.await();
				}
				
				System.out.print("Ŭ");
				System.out.print("��");
				System.out.print("ѧ");
				System.out.print("ϰ");
				System.out.println();
				
				//�޸� ��־����Bִ��
				flag = 1;
				
				//֪ͨ�߳�2��ִ�д���
				c2.signal();
				
			//����
			//}
			rl.unlock();
		}
	} 
	
	public void printB() throws Exception {
		for(int i = 0; i < 100; i++) {
			//synchronized (this) {
			rl.lock();
				//�ж��Ƿ��ֵ�  ��ǰ�߳� ִ��
				if(flag != 1) {
					//�����Լ�ִ�� �� ����ȴ�״̬
					c2.await();
				}
				
				System.out.print("��");
				System.out.print("��");
				System.out.print("Ǯ");
				System.out.println();
				
				//�޸ı�־
				flag = 2;
				
				c3.signal();
			//}
			rl.unlock();
		}
	}
	
	public void printC() throws Exception {
		for(int i = 0; i < 100; i++) {
			//synchronized (this) {
			rl.lock();
				if(flag != 2) {
					c3.await();
				}
				
				System.out.print("��");
				System.out.print("C");
				System.out.print("C");
				System.out.println();
				
				//�޸ı�־
				flag = 0;
				
				c1.signal();
			//}
			rl.unlock();
		}
	}

}




