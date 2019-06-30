package day12.com.briup.work;
/*
 * 使用LinkedList实现一个队列 数据结构
 */
import java.util.LinkedList;

public class Work1_Queue {
	
	private LinkedList<String> list;
	
	public Work1_Queue() {
		list = new LinkedList<String>();
	}
	
	//入队列
	public void inQueue(String str) {
		list.add(str);
	}
	
	//出队列
	public String outQueue() {
		return list.removeFirst();
		
	}
	
	//获取队列长度
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return "Work1_Queue [list=" + list + "]";
	}
	
	
}
