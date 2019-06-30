package day19.com.briup.test;

/*
 * ͬ�� ����� 
 * 	synchronized(������) {
 * 		��Ҫ��ס�Ĵ����
 *  }
 * ͬ�� ����
 */
public class Test11_Synchronized {
	public static void main(String[] args) {
		Printer p = new Printer();
		//Printer p2 = new Printer();
		
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					p.print1();
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

class Printer {
	//�߳�ͬ��,
	//���߳�ִ��һ�ش����ʱ�򣬱��뱣֤ϵͳֻ�������cpu
	
	public void print1() {
		//ͬ�������
		//	��֤������߳��� ͬ�������ʹ��ͬһ����
		//		����߳� ��Ҫ��ѭ ����
		synchronized (this) {
			System.out.print("��");
			System.out.print("Ҫ");
			System.out.print("׬");
			System.out.print("��");
			System.out.print("Ǯ");
			System.out.print("\r\n");
		}
	}
	
	public void print2() {
		synchronized (this) {
			System.out.print("Ŭ");
			System.out.print("��");
			System.out.print("ѧ");
			System.out.print("ϰ");
			System.out.print("\r\n");
		}
	}
	
}




