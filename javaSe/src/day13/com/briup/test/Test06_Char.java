package day13.com.briup.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 字符串中去除重复字符
 */
public class Test06_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出字符串: "); 
		String line = sc.nextLine();
		
		char[] array = line.toCharArray();
		//准备Set存放char字符
		Set<Character> set = new HashSet<>();
		for(char c : array) {
			set.add(c);
		}
		
		//输出集合中所有字符
		for(Character c : set) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
}







