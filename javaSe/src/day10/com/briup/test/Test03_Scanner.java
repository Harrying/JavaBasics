package day10.com.briup.test;

import java.util.Scanner;

/*
 * ����Scanner�෽��
 */
public class Test03_Scanner {
	public static void main(String[] args) {
		//��ɫ������  ���� 
		//��ɫ������  ����  ����ͨ���� 
		Scanner sc = new Scanner(System.in);
		
		//�õ�����
		System.out.println("��¼���û��� �� ����: ");
		//nextLine¼��ʱ  ����¼�뻻�з�
		String str = sc.nextLine();
		System.out.println("str: " + str);
		
		String[] sarr = str.split(" ");
		System.out.println("len: " + sarr.length);
		String name = sarr[0];
		
		//���ַ���  ת���� int:
		//	int = Integer.parseInt(String);
		int age = Integer.parseInt(sarr[1]);
		System.out.println("age: " + age);
		
		
		//�����ַ������ ת����String�ɵ��¡�
		
//		int a = sc.nextInt();
//		System.out.println("a: " + a);
		
		System.out.println("main end!");
		
		/*if(sc.hasNextInt()) {
			int a = sc.nextInt();
			System.out.println("a: " + a);
		}else if(sc.hasNextDouble()) {
			double d = sc.nextDouble();
			System.out.println("d: " + d);
		}*/
		
	}
}






