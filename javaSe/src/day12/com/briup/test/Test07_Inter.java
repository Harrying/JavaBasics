package day12.com.briup.test;

import day12.com.briup.bean.InterImpl;
import day12.com.briup.bean.InterImpl2;

/*
 * ���ͽӿ� �� ʵ���� ����
 */
public class Test07_Inter {
	public static void main(String[] args) {
		//1.���ͽӿڵ�ʵ����  Ҳ�� ������
		InterImpl<String,Integer> inter = new InterImpl<>(); 
		inter.show("hello");
		inter.disp(123);
		
		//2.���ͽӿڵڶ�����ʽ  ��ʵ�����Ǿ�����
		InterImpl2 iter2 = new InterImpl2();
		iter2.show(12);
		iter2.disp("hello");
	}
}



