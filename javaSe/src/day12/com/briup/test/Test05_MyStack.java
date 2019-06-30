package day12.com.briup.test;

import day12.com.briup.bean.MyStack;

/*
 * 测试MyStack类
 */
public class Test05_MyStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.inStack("hello");
		stack.inStack("nihao");
		stack.inStack("world");
		stack.inStack("abc");
		
		System.out.println("size: " + stack.size());
		System.out.println(stack);
		
		String s = stack.outStack();
		System.out.println("第一次出栈: " + s);
		
		System.out.println("**********");
		System.out.println(stack);
		
	}
}
