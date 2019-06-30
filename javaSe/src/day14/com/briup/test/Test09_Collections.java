package day14.com.briup.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Arrays ���鹤����
 * Collections������
 * 		public static <T> void sort(List<T> list)
		public static <T> int binarySearch(List<?> list,T key)
		public static <T> T max(Collection<?> coll)
		public static void reverse(List<?> list)
		public static void shuffle(List<?> list)
 */
public class Test09_Collections {
	public static void main(String[] args) {
		//����static���ͷ���������Ҫָ�� �������ͣ�ϵͳ���Զ����� ʵ����ȷ������
		List<Integer> list = Arrays.asList(3,1,4,1,2,5);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Integer max = Collections.max(list);
		System.out.println("max: " + max);
		
//		Collections.reverse(list);
//		System.out.println(list);
		
		//���ֲ���һ����  �������У������г�Ա���ͣ�Ҫʵ��Comparable�ӿ�
		int index = Collections.binarySearch(list, 3);
		System.out.println(index);
		
		//������Ҵ���
		Collections.shuffle(list);
		System.out.println(list);
	}
}







