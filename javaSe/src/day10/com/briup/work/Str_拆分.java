package day10.com.briup.work;

import java.awt.Container;
import java.util.Scanner;

public class Str_拆分 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = "";

	Teacher[] tArr = new Teacher[10];
	int count = 0;
	while(true) {
		System.out.println("请按照格式录入老师的基本信息");
		String line = sc.nextLine();
		if("quit".equals(line)) {
			System.out.println("录入结束");
			break;
		}
		String[] a = line.split(":");
		if(a.length != 3) {
			System.out.println("录入数据个数有误");
			continue;
		}
		//将录入的数据进行对应类型转换
		String name = a[0];
		
		int age = Integer.parseInt(a[1]);
		
		double salary = Double.parseDouble(a[2]);
		
		Teacher t = new Teacher(name, age, salary);
		System.out.println(t.toString());
		if (count == tArr.length) {
			Teacher[] newArr = new Teacher[tArr.length + 5];
			tArr = newArr;
		}
		tArr[count++] = t;
	}
	
	System.out.println("*********************************");
	//对数组进行遍历
	for (int i = 0; i < count; i++) {
		System.out.println(tArr[i]);
	}
}
}

