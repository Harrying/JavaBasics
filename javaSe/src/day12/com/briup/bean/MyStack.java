package day12.com.briup.bean;

import java.util.LinkedList;

/*
 * ����һ�� �Զ��� �� ջ
 * 	ʵ�� ������
 */
public class MyStack {
	//����ջ������ �������list����
	private LinkedList<String> list;
	
	public MyStack() {
		list = new LinkedList<>();
	}
	
	//��ջ
	public void inStack(String str) {
		list.addLast(str);
	}
	
	//��ջ
	public String outStack() {
		//ɾ�������� ���һ��Ԫ��
		return list.remove(0);
	}
	
	//��ȡջ����
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return "MyStack [list=" + list + "]";
	}
}








