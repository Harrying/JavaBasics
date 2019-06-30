package day12.com.briup.bean;

/*
 * ���巺���ࡾģ�塿
 * 	��ʽ:
 * 		[���η�] class ����<���������б�> {
 * 			...
 * 		}
 */		//         E: ��������������
public class MyNode<E> {
	//��������data  ��� ���� ��ȷ�������͡�
	//private int data;
	
	private E data;
	private int num;
	
	public MyNode() {}
	
	public MyNode(E data,int num) {
		this.data = data;
		this.num = num;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	public E getData() {
		return data;
	}

	@Override
	public String toString() {
		return "MyNode [data=" + data + ", num=" + num + "]";
	}
	
	//����Ƿ��ͷ�����  ����
	public void show(E e) {
		System.out.println("in show, e: " + e);
	}
	
	/* �������еľ�̬��������Ҫ����  Ϊ ���ͷ��� */
	/*public static void show2(E e) {
		System.out.println("show2, e: " + e);
	}*/
	
	//������ʽ������ ���ͷ���
	//[���η�] <���������б�> ����ֵ ������(�β��б�) { ... }
	//public <E> void disp(E u) {
	public static <U> void disp(U u) {
		System.out.println("in disp, u: " + u);
	}
}






