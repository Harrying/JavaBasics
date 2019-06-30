package day19.com.briup.work;

/*
 * ʵ���������̣߳��̴߳������ж�ѭ��10�Σ�
	һ�����A����һ�����B��
	ʹ��ͬ���������� �����ӡA��B
 */
public class Test03 {
	public static void main(String[] args) {
	
		//׼��һ����־
		final Demo d = new Demo();
		//flagΪ0 ��ʾ�ֵ� A�����Ϊ1��ʾ�ֵ�B���
		d.setFlag(0);
		
		//1.ʵ�����߳�1,���10��A
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						//�����־λ���ԣ���sleep
						while(d.getFlag() != 0) {
							Thread.sleep(10);
						}
					} catch (InterruptedException e) {
							e.printStackTrace();
					}
					
					System.out.println("A");
					//�޸ı�־λ
					d.setFlag(1);
				}
			}
		};
		
		//2.ʵ�����߳�2,���10��B
		Thread th2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						//�����־λ���ԣ���sleep
						while(d.getFlag() != 1) {
							Thread.sleep(10);
						}
					} catch (InterruptedException e) {
							e.printStackTrace();
					}
					
					System.out.println("B");
					//�޸ı�־λ
					d.setFlag(0);
				}
			}
		};
		
		//3.���������̣߳������ӡ
		th1.start();
		th2.start();
	}
}

class Demo {
	private int flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}






