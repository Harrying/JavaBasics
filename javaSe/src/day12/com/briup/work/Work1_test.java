package day12.com.briup.work;

import day12.com.briup.bean.MyStack;
/*
 * 使用LinkedList实现一个队列 数据结构
 */
public class Work1_test {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.inStack("1111");
		stack.inStack("2222");
		stack.inStack("3333");
		stack.inStack("4444");
		
		
		System.out.println("队列的长度为：" + stack.size());
		System.out.println("*******队列遍历**********");
		
		System.out.println(stack);
		
		//第一次出队列
		System.out.println("*******第一次出队列**********");
		String s = stack.outStack();
		System.out.println(s);
		System.out.println("*******第一次出队列完毕**********");
		
		System.out.println("*******第二次出队列**********");
		String d = stack.outStack();
		System.out.println(d);
		System.out.println("*******第二次出队列完毕**********");
		System.out.println("队列的长度为：" + stack.size());
		
		
	}
}
