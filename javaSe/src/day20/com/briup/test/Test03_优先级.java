package day20.com.briup.test;

public class Test03_���ȼ� {
	public static void main(String[] args) {
		
		Thread th1 = new Thread("�߳�1") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					/*try {
						Thread.sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}*/
					
					System.out.println(name + " ִ�еĵ� " + i + " ��...");
				}
			}
		};
		
		Thread th2 = new Thread("�߳�2") {
			public void run() {
				String name = this.getName();
				
				for(int i = 0; i < 50; i++) {
					/*try {
						Thread.sleep(50);
					} catch (Exception e) {
						e.printStackTrace();
					}*/
					
					System.out.println(name + " ִ�еĵ� " + i + " ��...");
				}
			}
		};
		
		//�޸��߳����ȼ��������ԡ�
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(10);
		
		th1.start();
		th2.start();
		
	}
}





