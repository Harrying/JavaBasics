package day11.com.briup.test;

import java.util.Arrays;

public class Test02_System {
	public static void main(String[] args) {
		
		//System.exit(int)  ������ֹ
		
		int[] arr = new int[] {1, 5, 3, 2, 10, 9, 8};
		
		System.out.println("start time: " + System.currentTimeMillis());
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 10) {
//				break;
				continue;
//				return;
				//��ֹ����   ʵ�ʲ���: 1   �˳�״̬��[0,255]��ÿ�����ֶ�������ĺ���
				//System.exit(1);
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("end time: " + System.currentTimeMillis());
		
		/*pubiic static void arraycopy(Object src, ������
				int srcPos,  �ӵ�ǰλ�ÿ���
				Object dest, ������
				int destPos, �ӵ�ǰλ�÷���
				int length)  ��������
		*/
		
		//int[] newArr = new int[arr.length + 5];
		//���鿽��
		//System.arraycopy(arr, 0, newArr, 0, arr.length);
		
		//							����1������������   ����2: �����鳤��
		int[] newArr = Arrays.copyOf(arr, arr.length+5);
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "  ");
		}
		System.out.println();
		
		
		System.out.println("main end...");
	}
}
