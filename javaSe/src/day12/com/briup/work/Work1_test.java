package day12.com.briup.work;

import day12.com.briup.bean.MyStack;
/*
 * ʹ��LinkedListʵ��һ������ ���ݽṹ
 */
public class Work1_test {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.inStack("1111");
		stack.inStack("2222");
		stack.inStack("3333");
		stack.inStack("4444");
		
		
		System.out.println("���еĳ���Ϊ��" + stack.size());
		System.out.println("*******���б���**********");
		
		System.out.println(stack);
		
		//��һ�γ�����
		System.out.println("*******��һ�γ�����**********");
		String s = stack.outStack();
		System.out.println(s);
		System.out.println("*******��һ�γ��������**********");
		
		System.out.println("*******�ڶ��γ�����**********");
		String d = stack.outStack();
		System.out.println(d);
		System.out.println("*******�ڶ��γ��������**********");
		System.out.println("���еĳ���Ϊ��" + stack.size());
		
		
	}
}
