package day20.com.briup.work;

import java.util.ArrayList;
import java.util.Random;

/*
 * 抽奖池数组int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
  创建两个抽奖箱【线程】，
  	线程名分别为“抽奖箱1”，“抽奖箱2”，
  两个线程 随机从arr数组中获取奖项元素并打印在控制台上，
  一直到数组中所有元素全部输出完，线程结束。
 */
public class Test03 {
	public static void main(String[] args) {
		Thread th1 = new Lottery1("张三");
		Thread th2 = new Lottery1("李四");
		
		th1.start();
		th2.start();
	}
}

//抽奖类
class Lottery1 extends Thread {
	public static ArrayList<Integer> list;
	
	//静态代码块
	static {
		int[] array = {10,5,20,50,100,200,500,800,2,80,300};
		list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
	}
	
	public Lottery1() {}
	
	public Lottery1(String name) {
		super(name);
	}
	
	//线程处理函数功能为: 从list中抽奖，然后输出
	@Override
	public void run() {
		Random random = new Random();
		
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (Lottery.class) {
				if(list.isEmpty())
					break;

				int len = list.size();
				//[0,len);
				int index = random.nextInt(len);
				
				Integer num = list.get(index);
				System.out.println(getName() + "从奖箱  中抽到奖: " + num);

//				System.out.println("len: " + len);
//				System.out.println("index: " + index);
				//list.remove(index);
				
				//注意，删除对象 还是 索引
				list.remove(num);
			}
		}
	}
	
}


