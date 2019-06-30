package day11.com.briup.test;

public class Test_02_System {
public static void main(String[] args) {
	
	
	//程序终止
	int[] arr = new int[] {1,5,7,8,10,6,4,5,4};
	System.out.println("start time :" + System.currentTimeMillis());
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == 10) {
			
			continue;
			//程序终止  实际参数： 1退出状态码
//			System.exit(1);
		}
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println("end time :" + System.currentTimeMillis());
	
	
	
	
	System.out.println("main end ....");
}
}
