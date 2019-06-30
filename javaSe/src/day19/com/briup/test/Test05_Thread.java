package day19.com.briup.test;

/*
 * �̴߳����ĵ�һ�ַ�ʽ
 * 	����һ���� �̳� Thread,Ȼ����дrun����
 * 	
 * 	ʵ���� ��������������start���������̼߳��ɡ�
 * 		ϵͳ���Զ��ҵ� run()�̴߳����� ȥ���У�
 */
public class Test05_Thread {
	public static void main(String[] args) throws Exception {
		
		//2.ʵ�����̶߳���
		Thread th = new MyThread();
				
		//3.�����Զ����̡߳����̡߳�
		th.start();
		//th.run();
		//��ע�⣬�Ӵ˴���ʼ��run���� �Ϳ�ʼִ���ˣ���main���� ����ִ�С�
		
		//main  ���߳� ѭ������
		for(int i = 0; i < 100; i++) {
			Thread.sleep(100);
			System.out.println("in main for,i: " + i);
		}
		
		System.out.println("main end!");
	}
}

//1.����Thread����,��дrun������
//	ע�⣬run���������׳��쳣
class MyThread extends Thread {
	
	//��дrun�������̴߳�������
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			try {
				//���߳� ����
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("in MyThread run, i: " + i);
		}
	}
	
}






