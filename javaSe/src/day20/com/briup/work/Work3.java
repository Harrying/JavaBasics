package day20.com.briup.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Work3 {
	public static void main(String[] args) {
		/*Lottery l = new Lottery();
		Thread th1 = new Thread(l,"³é½±³Ø1");
		Thread th2 = new Thread(l,"³é½±³Ø2");*/
		Thread th1 = new Lottery("³é½±³Ø1");
		Thread th2 = new Lottery("³é½±³Ø2");

		th1.start();
		th2.start();

	}
}
//class Lottery implements Runnable {
class Lottery extends Thread {
	/*int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
	List<Integer> list = Arrays.stream( arr ).boxed().collect(Collectors.toList());
	*/
	public static ArrayList<Integer> list;
	static {
		int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
		list = new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);
		}
	}
	public Lottery() {}
	public Lottery(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		//String name = this.getName();
		
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Lottery.class) {
				if(list.size() == 0) {
					break;
				}
				
				Random random = new Random();
				int n = random.nextInt(list.size());
				
				System.out.println(Thread.currentThread().getName() + "½±½ð£º" + list.get(n));
				list.remove(n);
				
			} 
		}
	}
}

	
	

