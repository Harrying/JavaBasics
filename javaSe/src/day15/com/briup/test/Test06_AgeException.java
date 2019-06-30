package day15.com.briup.test;

import day15.com.briup.bean.Person;

/*
 * 测试自定义 异常类
 */
public class Test06_AgeException {
	//处理 运行时异常
	public static void main(String[] args) throws InterruptedException {
	
		Person p = new Person();
		
		try {
			p.setName("zs");
			p.setAge(-2);
			
			System.out.println("p: " + p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println("main end ...");
	}
	
	//自己捕获异常 并处理
	public static void main2(String[] args) {
		
		Person p = new Person();
		
		try {
			p.setName("zs");
			p.setAge(-2);
			
			System.out.println("p: " + p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main end ...");
	}
	
	//直接往上抛出异常
	public static void main1(String[] args) throws Exception {
	
		Person p = new Person();
		
		p.setName("zs");
		p.setAge(-2);
		
		System.out.println("p: " + p);
		
	}
}










