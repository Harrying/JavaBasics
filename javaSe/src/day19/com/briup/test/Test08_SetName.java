package day19.com.briup.test;

/*
 * �����ڲ��� ʵ��������
 * Ȼ��ʹ��setName�޸��߳�����
 */
public class Test08_SetName {
	
	//����������
	public static void main(String[] args) {
		
		Thread th1 = new Thread() {
			//��runִ����ɺ����߳��Զ�����
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				Thread cTh = Thread.currentThread();
				System.out.println("cTh: " + cTh.getName());
				//cTh.setName("���߳�");
				System.out.println("run: �߳����Ѿ��޸�: " + this.getName());
			}
		};
		
		th1.setName("���߳�1");
		
		//th1.start();
		th1.run();
		
		//JVM�У����߳�|���� ��ȴ� ���е����߳�ȫ����ֹ��Ȼ�������˳�
		//												���̽���
		System.out.println("in main, end...");
		//System.exit(1);
	}
}






