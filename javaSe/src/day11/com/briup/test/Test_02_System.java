package day11.com.briup.test;

public class Test_02_System {
public static void main(String[] args) {
	
	
	//������ֹ
	int[] arr = new int[] {1,5,7,8,10,6,4,5,4};
	System.out.println("start time :" + System.currentTimeMillis());
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == 10) {
			
			continue;
			//������ֹ  ʵ�ʲ����� 1�˳�״̬��
//			System.exit(1);
		}
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println("end time :" + System.currentTimeMillis());
	
	
	
	
	System.out.println("main end ....");
}
}
