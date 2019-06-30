package day12.com.briup.work;
/*
 * ʹ��LinkedListʵ��һ������ ���ݽṹ
 */
import java.util.LinkedList;

public class Work1_Queue {
	
	private LinkedList<String> list;
	
	public Work1_Queue() {
		list = new LinkedList<String>();
	}
	
	//�����
	public void inQueue(String str) {
		list.add(str);
	}
	
	//������
	public String outQueue() {
		return list.removeFirst();
		
	}
	
	//��ȡ���г���
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return "Work1_Queue [list=" + list + "]";
	}
	
	
}
