package day15.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test05_�����쳣 {
	
	/*
	 * ����ʱ�쳣
	 * 	����RuntimeException�������࣬�������쳣���� ����ʱ�쳣
	 * 	����Ա���� ��ʽ�����{1. try-catch������; 2. throws���ϴ���}
	 * 	���򣬱��붼�޷�ͨ�� 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = null;
		
		//�ڶ��֣��û�������ֱ���Ӹ���һ��
//		fis = new FileInputStream("src/a.txt");
//		
//		System.out.println("file �򿪳ɹ�: " + fis);
		
		//��һ��  ����ʽ  �û�ֱ�Ӳ�����
		try {
			fis = new FileInputStream("src/a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("*************printStackTrace************");
			e.printStackTrace();
//			System.out.println("***********getMessage*************");
//			String message = e.getMessage();
//			System.out.println(message);
//			System.out.println("***********e*************");
//			System.out.println(e);
			
		}
		
		
	}
	
	
	//����ʱ�쳣����
	public static void main1(String[] args) {
		//����ʱ�쳣: RuntimeException�༰������
		//	�û����Ժ��ԣ�����ʽ�������벻�ᱨ��ֻ������ʱ�Ż������
		//	����ʱ�쳣��������Ҫ����Ա  �޸�Դ��
		
		int[] arr = {1, 3 , 5, 9};
		System.out.println("arr[0]: " + arr[0]);
		
		arr = null;
		System.out.println("arr[3]: " + arr[3]);
		
	}
}







