package day10.com.briup.work;

import java.util.Scanner;

public class LoginTest {
	/*
	 * 模拟登陆  三次机会
	 * 	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String user = "admin";
		String password = "admin";
		String a;
		String b;
		for(int i = 1;i < 4;i++) {
			System.out.println("请输入用户名：");
			a = sc.next();
			System.out.println("请输入密码");
			b = sc.next();
			if(a.equals(user)&&b.equals(password)){
				System.out.println("登陆成功！");
				break;
			}else if(i == 3) {
				System.out.println("错误次数较多，账户已被锁定，请联系管理员");
				break;
			}
			System.out.println("用户名或密码错误，请重新输入，您还有"+(3-i)+"次机会");
		}
	}
	
}
