package day20.com.briup.test;

/*
 * �����߳� yield()
 * �����Ե�
 */
public class Test04_���� {
	public static void main(String[] args) {
		
		Thread th1 = new Thread("�߳�1") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					try {
						Thread.sleep(5);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println(name + " ִ�еĵ� " + i + " ��...");
				}
			}
		};
		
		Thread th2 = new Thread("�߳�2") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					try {
						Thread.sleep(5);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					//��������������õ�ǰ�߳�����
					if(i % 10 == 0)
						Thread.yield();
					System.out.println(name + " ִ�еĵ� " + i + " ��...");
				}
			}
		};
		
		th1.start();
		th2.start();
	}
}





