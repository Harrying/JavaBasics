package day12.com.briup.test;

/*
 * �ɱ�����б�
 * 	[���η�] ����ֵ���� ������(�������� ... ������)
 */
public class Test09_�ɱ�����б� {
	public static void main(String[] args) {
		int s = add(10,12);
		System.out.println("s�� " + s);
		
		System.out.println("*************");
		
		s = add(10,12,13,25);
		System.out.println("s�� " + s);
		
		System.out.println("*********");
		int[] array = {1,3,5,7,9};
		s = add(array);
		System.out.println("s�� " + s);
		
		System.out.println("*********");
		addNum(1, 2, 3, 4);
		
	}
	
	//�ɱ�����б� �ײ���� ����ʵ��
	//					int[] arr
	public static int add(int... arr) {
		/*for (int i : arr) {
			System.out.println(i);
		}*/
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	//addNum(1,2,3,4);
	//public static int addNum(int count,int... arr,int temp);ERROR
	//public static int addNum(int... arr,int count);  ERROR
	//�������ɱ�����б���������� ���Ĳ���
	public static int addNum(int count, int... arr) {
		System.out.println("count: " + count);
		System.out.println("arr.length: " + arr.length);
		return 0;
	}
}





