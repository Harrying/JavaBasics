package day19.com.briup.test;

/*
 * ͬ�� ����� 
 * 	synchronized(������) {
 * 		��Ҫ��ס�Ĵ����
 *  }
 * ͬ�� ����
 */
public class Test12_SynMethod {
	public static void main(String[] args) {
		Printer2 p = new Printer2();
		//Printer p2 = new Printer();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					//p.print1();
					Printer2.print3();
				}
			}
		};
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					p.print2();
				}
			}
		});
		
		th1.start();
		th2.start();
	}
}

class Printer2 {
	//�߳�ͬ��,
	//���߳�ִ��һ�ش����ʱ�򣬱��뱣֤ϵͳֻ�������cpu
	
	//ͬ������: synchronizedֱ������ ����
	//	�������� ȫ����ס
	//	��ͨ��ͬ��������Ĭ�ϵ��������� ? ��this��
	public synchronized void print1() {
		//synchronized (this) {
			System.out.print("��");
			System.out.print("Ҫ");
			System.out.print("׬");
			System.out.print("��");
			System.out.print("Ǯ");
			System.out.print("\r\n");
		//}
	}
	
	//��̬��ͬ������   Ĭ�ϵ������� ? �������ֽ������  
	//	������.class
	public static synchronized void print3() {
		System.out.print("��");
		System.out.print("Ҫ");
		System.out.print("׬");
		System.out.print("��");
		System.out.print("Ǯ");
		System.out.print("\r\n");
	}
	
	public void print2() {
//		synchronized (this) {
		synchronized (Printer2.class) {
			System.out.print("Ŭ");
			System.out.print("��");
			System.out.print("ѧ");
			System.out.print("ϰ");
			System.out.print("\r\n");
		}
	}
	
}




