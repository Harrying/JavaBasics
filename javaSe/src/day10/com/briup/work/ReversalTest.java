package day10.com.briup.work;

import java.util.Scanner;

public class ReversalTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next();
	StringBuffer a = new StringBuffer(s);
	System.out.println("��ת����ַ� ��" + a.reverse().toString());
}
}
