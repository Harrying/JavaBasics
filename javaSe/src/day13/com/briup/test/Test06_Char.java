package day13.com.briup.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * �ַ�����ȥ���ظ��ַ�
 */
public class Test06_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ַ���: "); 
		String line = sc.nextLine();
		
		char[] array = line.toCharArray();
		//׼��Set���char�ַ�
		Set<Character> set = new HashSet<>();
		for(char c : array) {
			set.add(c);
		}
		
		//��������������ַ�
		for(Character c : set) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
}







