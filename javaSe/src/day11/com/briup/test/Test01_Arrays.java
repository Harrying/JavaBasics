package day11.com.briup.test;

import java.util.Arrays;
import java.util.Random;

/*
 * ʹ��Arrays������
 */
public class Test01_Arrays {
	
	public static void main(String[] args) {
		//1970.1.1 00:00:00  ��ʼʱ��
		//��ָ�����ӵ� ����������Ե�ǰϵͳʱ��(����)
		Random random = new Random();
		
		for(int i = 0;i < 10;i++) {
			//����[0,10)
			int n = random.nextInt(10);
			System.out.print(n + "  ");
		}
		System.out.println();
		
		
	}
	
	public static void main1(String[] args) {
		//���ֲ��ң���������
		int[] array = {7, 1, 4, 3, 5, 11, 9};
		Arrays.sort(array);
		
		//������  ת���� �ַ�������ʽ���������
		String str = Arrays.toString(array);
		System.out.println(str);
		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + "  ");
//		}
//		System.out.println();
		
		int value = 6;
		
		int index = Arrays.binarySearch(array, value);
		System.out.println("index: " + index);
	}
}





