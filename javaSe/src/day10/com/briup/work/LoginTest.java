package day10.com.briup.work;

import java.util.Scanner;

public class LoginTest {
	/*
	 * ģ���½  ���λ���
	 * 	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String user = "admin";
		String password = "admin";
		String a;
		String b;
		for(int i = 1;i < 4;i++) {
			System.out.println("�������û�����");
			a = sc.next();
			System.out.println("����������");
			b = sc.next();
			if(a.equals(user)&&b.equals(password)){
				System.out.println("��½�ɹ���");
				break;
			}else if(i == 3) {
				System.out.println("��������϶࣬�˻��ѱ�����������ϵ����Ա");
				break;
			}
			System.out.println("�û���������������������룬������"+(3-i)+"�λ���");
		}
	}
	
}
