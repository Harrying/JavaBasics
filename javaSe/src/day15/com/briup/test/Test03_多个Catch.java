package day15.com.briup.test;

import javax.xml.soap.AttachmentPart;

/*
 * try  - catch  -catch
 */
public class Test03_���Catch {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		int num = 0;
		System.out.println("��ʼ����");
		try {
			num = div(x, y);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: exception
			System.out.println("�����г�������Խ���쳣");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("�����г��ֳ���Ϊ0���쳣");
		}
		
		System.out.println("�������,���Ϊ��" + num);
	
}
	
	public static int div(int a,int b) {
		int n = a / b;
		
		return n;
	}
}
