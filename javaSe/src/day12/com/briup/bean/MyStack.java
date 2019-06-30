package day12.com.briup.bean;

import java.util.LinkedList;

/*
 * 定义一个 自定义 的 栈
 * 	实现 先入后出
 */
public class MyStack {
	//加入栈的数据 都会放入list集合
	private LinkedList<String> list;
	
	public MyStack() {
		list = new LinkedList<>();
	}
	
	//入栈
	public void inStack(String str) {
		list.addLast(str);
	}
	
	//出栈
	public String outStack() {
		//删除并返回 最后一个元素
		return list.remove(0);
	}
	
	//获取栈长度
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return "MyStack [list=" + list + "]";
	}
}








