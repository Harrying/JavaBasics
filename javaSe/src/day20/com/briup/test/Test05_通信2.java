package day20.com.briup.test;

/*
 * �����߳�ͨ��
 * 
 * 	ͨ�� ������ ���� wait()  notify()
 */
public class Test05_ͨ��2 {
	public static void main(String[] args) {
		
		Printer p = new Printer();
		
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
		
		th1.start();
		th2.start();
		
	}
}

class Printer {
	
	//flag��һ����־�����Ϊ0����ʾ�ֵ� A�߳�ִ��
	//				  ���Ϊ1����ʾ�ֵ� B�߳�ִ��
	private static int flag = 0;
	
	public void printA() throws Exception {
		for(int i = 0; i < 100; i++) {
			synchronized (this) {
				
				if(flag != 0) {
					this.wait();
				}
				
				System.out.print("Ŭ");
				System.out.print("��");
				System.out.print("ѧ");
				System.out.print("ϰ");
				System.out.println();
				
				//�޸� ��־����Bִ��
				flag = 1;
				//֪ͨ��һ���߳�ִ��
				this.notify();
			}
		}
	} 
	
	public void printB() throws Exception {
		for(int i = 0; i < 100; i++) {
			synchronized (this) {
				//�ж��Ƿ��ֵ�  ��ǰ�߳� ִ��
				if(flag != 1) {
					//�����Լ�ִ�� �� ����ȴ�״̬
					this.wait();
				}
				
				System.out.print("��");
				System.out.print("��");
				System.out.print("Ǯ");
				System.out.println();
				
				//�޸ı�־
				flag = 0;
				//֪ͨ��һ���߳�ִ��
				this.notify();
			}
		}
	}
}




