package day20.com.briup.work;

import java.util.ArrayList;
import java.util.Random;

/*
 * �齱������int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
  ���������齱�䡾�̡߳���
  	�߳����ֱ�Ϊ���齱��1�������齱��2����
  �����߳� �����arr�����л�ȡ����Ԫ�ز���ӡ�ڿ���̨�ϣ�
  һֱ������������Ԫ��ȫ������꣬�߳̽�����
 */
public class Test03 {
	public static void main(String[] args) {
		Thread th1 = new Lottery1("����");
		Thread th2 = new Lottery1("����");
		
		th1.start();
		th2.start();
	}
}

//�齱��
class Lottery1 extends Thread {
	public static ArrayList<Integer> list;
	
	//��̬�����
	static {
		int[] array = {10,5,20,50,100,200,500,800,2,80,300};
		list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
	}
	
	public Lottery1() {}
	
	public Lottery1(String name) {
		super(name);
	}
	
	//�̴߳���������Ϊ: ��list�г齱��Ȼ�����
	@Override
	public void run() {
		Random random = new Random();
		
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (Lottery.class) {
				if(list.isEmpty())
					break;

				int len = list.size();
				//[0,len);
				int index = random.nextInt(len);
				
				Integer num = list.get(index);
				System.out.println(getName() + "�ӽ���  �г鵽��: " + num);

//				System.out.println("len: " + len);
//				System.out.println("index: " + index);
				//list.remove(index);
				
				//ע�⣬ɾ������ ���� ����
				list.remove(num);
			}
		}
	}
	
}


