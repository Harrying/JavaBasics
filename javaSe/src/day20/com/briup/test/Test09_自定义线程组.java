package day20.com.briup.test;

/*
 * �����̵߳�ʱ���Լ�ָ���߳���
 * 
 */
public class Test09_�Զ����߳��� {
	public static void main(String[] args) {
		//1.ʵ�����߳������
		ThreadGroup group = new ThreadGroup("��һ��");
		ThreadGroup parent = group.getParent();
		System.out.println("parent: " + parent.getName());
		
		Thread th1 = new Thread(group, new Runnable() {
			@Override
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("�߳�: " + t.getName());
				System.out.println("�߳���: " + t.getThreadGroup().getName());
			}
		});
		th1.setName("�����߳�");
		
		th1.start();
	}
}






