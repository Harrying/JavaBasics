package day15.com.briup.test;

import day15.com.briup.bean.Person;

/*
 * �����Զ��� �쳣��
 */
public class Test06_AgeException {
	//���� ����ʱ�쳣
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
	
	//�Լ������쳣 ������
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
	
	//ֱ�������׳��쳣
	public static void main1(String[] args) throws Exception {
	
		Person p = new Person();
		
		p.setName("zs");
		p.setAge(-2);
		
		System.out.println("p: " + p);
		
	}
}










