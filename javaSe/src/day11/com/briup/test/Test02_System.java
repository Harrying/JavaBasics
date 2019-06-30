package day11.com.briup.test;

import java.util.Arrays;

public class Test02_System {
	public static void main(String[] args) {
		
		//System.exit(int)  程序终止
		
		int[] arr = new int[] {1, 5, 3, 2, 10, 9, 8};
		
		System.out.println("start time: " + System.currentTimeMillis());
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 10) {
//				break;
				continue;
//				return;
				//终止程序   实际参数: 1   退出状态码[0,255]，每个数字都有特殊的含义
				//System.exit(1);
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("end time: " + System.currentTimeMillis());
		
		/*pubiic static void arraycopy(Object src, 老数组
				int srcPos,  从当前位置拷贝
				Object dest, 新数组
				int destPos, 从当前位置放入
				int length)  拷贝长度
		*/
		
		//int[] newArr = new int[arr.length + 5];
		//数组拷贝
		//System.arraycopy(arr, 0, newArr, 0, arr.length);
		
		//							参数1：拷贝的数组   参数2: 新数组长度
		int[] newArr = Arrays.copyOf(arr, arr.length+5);
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "  ");
		}
		System.out.println();
		
		
		System.out.println("main end...");
	}
}
