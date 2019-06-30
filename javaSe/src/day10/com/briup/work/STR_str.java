package day10.com.briup.work;

import java.util.Scanner;
/*
 * 统计大字符串中小字符串出现的次数
 */
public class STR_str {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入总字符串：");
	String s = sc.next();
	System.out.println("请输入小字符串：");
	String ss = sc.next();    
    int index = 0;
    int count = 0;
    String findStr = "Hello";
    while((index = s.trim().indexOf(ss, index)) != -1) {
        index += ss.length();
        count++;
    }
    System.out.println(count);
}	
}
