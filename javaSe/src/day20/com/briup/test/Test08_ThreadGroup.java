package day20.com.briup.test;

/*
 * ��ȡ����� �߳�Ĭ���������߳���
 * 
 * 	Ĭ������£����̴߳������������̣߳�������main����߳���
 */
public class Test08_ThreadGroup {
	public static void main(String[] args) {
		Thread th1 = new Thread("�����߳�") {
			@Override
			public void run() {
				//��� ��ǰ�߳���������� �����߳�������
				String name = this.getName();
				System.out.println("��ǰ�߳�: " + name);
				
				String gName = this.getThreadGroup().getName();
				System.out.println("�����߳���: " + gName);
			}
		};
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				//��ȡ��ǰ�߳� Ȼ���ٻ�ȡ�߳�����
				Thread t = Thread.currentThread();
				System.out.println("�߳�: " + t.getName());
				System.out.println("�߳���: " + t.getThreadGroup().getName());
			}
		},"�����߳�");
		
		th1.start();
		th2.start();
		
		//��� ���̵߳����ֺ� �����߳���
		Thread mTh = Thread.currentThread();
		System.out.println("mian: " + mTh.getName());
		System.out.println("mian��: " + mTh.getThreadGroup().getName());
	}
}





