package day11.com.briup.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import day10.com.briup.work.Teacher;

public class List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Teacher> li = new ArrayList<>();
		//.创建list集合
		Teacher a1 = new Teacher("zhang3", 18, 3000);
		Teacher a2 = new Teacher("wang5", 10, 2300);
		Teacher a3 = new Teacher("li4", 25, 3500);
		Teacher a4 = new Teacher("wang5", 22, 3200);
		//添加四个老师
		li.add(a1);
		li.add(a2);
		li.add(a3);
		li.add(a4);
		//1.获取li4的索引
		int li4 = li.indexOf(a4);
		//2.键盘获取信息  进行员工插入
		System.out.println("请输入老师zhao4的信息：");
		String str = sc.nextLine();
		String[] sss = str.split("\\.",3);
		String name = sss[0];
		
		int age = Integer.parseInt(sss[1]);
		
		double salary = Double.parseDouble(sss[2]);
		Teacher a5 = new Teacher(name, age, salary);
		li.add(li4-1, a5);
		//3.输出当前工人的数量
		int count = li.size();
		System.out.println("当前工人有：" + count +"个");
		//4.使用三种方式遍历集合中的信息
		System.out.println("********1.数组遍历*********");
		
		Object[] array = li.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]: " + array[i]);
		}
		
		System.out.println("********2.迭代遍历*********");
		Iterator<Teacher> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("********3.get方法*********");
		for(int index=0;index<li.size();index++) {
			System.out.println(li.get(index));
		    }
		
		//5.删除所有姓名为awng5的老师
		int[] shuzu = new int[count];
		int y = 0;
		for(int index=0;index<li.size();index++) {
			String ss =li.get(index).toString();
			 if(ss.contains("wang5")) {
				 li.remove(index);
				 y++;
			 }
		    }
		System.out.println("删除王五后的结果：");
		Iterator<Teacher> it2 = li.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
	}
}
