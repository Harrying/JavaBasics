package day10.com.briup.work;

import java.util.Scanner;
/*
 * ͳ�ƴ��ַ�����С�ַ������ֵĴ���
 */
public class STR_str {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("���������ַ�����");
	String s = sc.next();
	System.out.println("������С�ַ�����");
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
