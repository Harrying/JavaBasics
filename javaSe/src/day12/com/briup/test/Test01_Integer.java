package day12.com.briup.test;

public class Test01_Integer {
	public static void main(String[] args) {
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("-----------");
		
		//Ϊ�� ��������У�����װ��   Ч�ʸ���
		//��Integer��װ���� -128 , 127 ��Ӧ��Integer�����Ѿ����ڻ���������
		//	�û�ʹ��ʱ��ֱ�Ӵӻ��������л�ȡ���������´���new 
		Integer i5 = 128;	//2^7-1   127
		Integer i6 = 128;
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		System.out.println("-----------");
	}
}
