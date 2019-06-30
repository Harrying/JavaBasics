package day20.com.briup.test;

/*
 * �����߳�ͨ��
 * 
 * 	ͨ�� ������ ���� wait()  notify()
 */
public class Test06_ͨ��3 {
	public static void main(String[] args) {
		
		Printer2 p = new Printer2();
		
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

class Printer2 {
	
	//flag��һ����־�����Ϊ0����ʾ�ֵ� A�߳�ִ��
	//				  ���Ϊ1����ʾ�ֵ� B�߳�ִ��
	private static int flag = 0;
	
	public void printA() throws Exception {
		for(int i = 0; i < 100; i++) {
			synchronized (this) {
				
				while(flag != 0) {
					this.wait();
				}
				
				System.out.print("Ŭ");
				System.out.print("��");
				System.out.print("ѧ");
				System.out.print("ϰ");
				System.out.println();
				
				//�޸� ��־����Bִ��
				flag = 1;
				//֪ͨ���������߳�
				this.notifyAll();
			}
		}
	} 
	
	public void printB() throws Exception {
		for(int i = 0; i < 100; i++) {
			synchronized (this) {
				//�ж��Ƿ��ֵ�  ��ǰ�߳� ִ��
				while(flag != 1) {
					//�����Լ�ִ�� �� ����ȴ�״̬
					this.wait();
				}
				
				System.out.print("��");
				System.out.print("��");
				System.out.print("Ǯ");
				System.out.println();
				
				//�޸ı�־
				flag = 2;
				//֪ͨ��һ���߳�ִ��
				this.notifyAll();
			}
		}
	}
	
	public void printC() throws Exception {
		for(int i = 0; i < 100; i++) {
			synchronized (this) {
				//�ж��Ƿ��ֵ�  ��ǰ�߳� ִ��
				while(flag != 2) {
					//�����Լ�ִ�� �� ����ȴ�״̬
					this.wait();
				}
				
				System.out.print("��");
				System.out.print("C");
				System.out.print("C");
				System.out.println();
				
				//�޸ı�־
				flag = 0;
				//֪ͨ��һ���߳�ִ��
				this.notifyAll();
			}
		}
	}

}




