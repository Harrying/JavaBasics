package day13.com.briup.work;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Work2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> set = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.equals(o2)) {
					return 1;
				}
				int num = o2.compareTo(o1);
				
					return num;	
			}	
	});
		System.out.println("请输入四个字符串：");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String s4 = sc.nextLine();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("逆序排列后的结果：");
		
		for (String str : set) {
			System.out.println(str);
		}
		
		
		
}	
	
}
