package zonghe;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
	//对数组进行操作的综合小型系统
	public int[] insertData() {
		//插入数据
		int[] a= new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("请插入第"+(i+1)+"个数字：");
			a[i]=sc.nextInt();
		}
		System.out.println("插入数据完毕");
		return a;
	}
	
	public void showData(int[] a,int length) {
		//显示所有数据
		for(int i=0;i<length;i++) {
			System.out.print(a[i]+"   ");
		}
	}
	
	public int[] insertAtArray(int[] a1,int n,int k) {
		//在指定位置插入数据
		int[] newArray = new int[a1.length + 1]; 
		for (int i = 0; i < a1.length; i++) {
			newArray[i] = a1[i];
		}
		for (int i = newArray.length - 1; i > k; i--) {
			newArray[i] = newArray[i - 1];
		}
		newArray[k] = n;
		a1 = newArray;
		System.out.println(Arrays.toString(a1));
		System.out.println("插入成功");
		return a1;
	}
	public void divThree(int[] a) {
		//查询能被三整除的数据
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0) {
				System.out.print(a[i]+"  ");
			}
		}
	}
	
	public void notice() {
		//显示提示信息的方法
		System.out.println("********************************");
		System.out.println("1--插入数据");
		System.out.println("2--显示所有数据");
		System.out.println("3--在指定位置插入数据");
		System.out.println("4--查询能被3整除的数据");
		System.out.println("0--退出");
		System.out.println("********************************");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayOperation ar=new ArrayOperation();
		
		int a[] = null;
		for(int j=1;j<100;j++) {
			System.out.println();
			ar.notice();
			System.out.println("请输入选项代码：");
			int i=sc.nextInt();
			if(i!=0) {
		switch(i){
		case 1:
			  a=ar.insertData();
			  break;
		case 2:
		    ar.showData(a, a.length);
		    break;
		case 3:
			  Scanner sc1=new Scanner(System.in);
			  System.out.println("请输入要插入的数据：");
			  int n=sc1.nextInt();
			  System.out.println("请输入插入数据的位置：");
			  int k=sc1.nextInt();
		    a=ar.insertAtArray(a, n, n);
		    break;
		case 4:
		    ar.divThree(a);
		    break;
		}
			}else {
		    System.out.println("系统关闭");
		    j=100;
   	}
		}

	}

}
