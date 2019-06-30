package day22.com.briup.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList<Integer>��һ������
 * ��������������һ���ַ�������
 */
public class Test07_List {
	public static void main(String[] args) throws Exception {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(12);
		list.add(21);
		
		//���� ֻ�ڱ���׶� �﷨��飬��֤����һ��
		//list.add("hello");
		
		//ͨ������ķ�ʽ  �����ַ������
		Class<? extends List> clazz = list.getClass();
		//��ȡMethod
		Method m = clazz.getMethod("add", Object.class);
		boolean b = (boolean) m.invoke(list, "hello");
		System.out.println("b: " + b);
		System.out.println(list);
	}
}






