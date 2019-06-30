package day15.com.briup.test;

import java.util.Scanner;

/*
 * finally�� ����
 * 	��try_catch�飬�����Ƿ����쳣��
 * 	������ ���һ��ִ��finally���롣
 * 
 * 	һ������£�finally�������� ��Դ���� ����
 */
public class Test04_Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;

		System.out.println("������һ��������: ");
		int b = sc.nextInt();
		
		int num = getNum(a, b);
		
		System.out.println("in main, num�� " + num);
		
		
	}
	
	public static int getNum(int a, int b) {
		
		int n = 0;
		try {
			n = a / b;
			
			n = 10;
		}catch(Exception e) {
			System.out.println("e.getMessage: " + e.getMessage());
			n = 20;
			//�Ƚ�������ͨ�������� n��ǰ��ֵ 20�������շ���ǰ����ȥ����finally
			return n;
		}finally {
			System.out.println("in finally, n: " + n);
			n = 30;
			System.out.println("in finally,��� n: " + n);
		}
		
		return n;
	}
	
	
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;

		System.out.println("������һ��������: ");
		int b = sc.nextInt();
		
		int num = 0;
		int s = 0;
		try {
			num = a / b;
			s = 10;
		}catch (Exception e) {
			//e.printStackTrace();           e.toString()
			System.out.println("�쳣����: " + e);
			s = 15;
		}finally {
			System.out.println("���finally���ͷ���Դ...s: " + s);
			s = 20;
		}
		
		System.out.println("main end ...,s: " + s);
	}
	
	
	
}








