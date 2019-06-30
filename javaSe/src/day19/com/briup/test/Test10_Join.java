package day19.com.briup.test;

/*
 * join()
 * join(int mills);
 */
public class Test10_Join {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...aaaaaa i: " + i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					try {
						if(i == 10) {
							t1.join();	//���,����
							//t1.join(30);	//����,�й̶���ʱ��,���˹̶�ʱ��,��������ִ��
							
							//�������ڲ�����ʹ�õľֲ�������Ĭ��final����
							//t1 = null;
						}
						
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "...bb, i: " + i);
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}



