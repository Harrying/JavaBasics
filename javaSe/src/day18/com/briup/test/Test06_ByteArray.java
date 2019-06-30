package day18.com.briup.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * ���� �ڴ������������С�����ȡ�������� �ֽ���Ϣ
 * 
 */
public class Test06_ByteArray {
	/*
	 * С�����ȡa.txt���ݣ�Ȼ�󽫶�ȡ�����ֽ� д�뵽 �ڴ������
	 * ȫ��д���Ժ�������ȡ �ڴ��������ݣ�Ȼ��ת����String���
	 */
	public static void main(String[] args) throws Exception {
		
		//1.
		FileInputStream fis = new FileInputStream("src/a.txt");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//2.С���鿽��a.txt���� �� �ڴ�����
		byte[] array = new byte[4];
		int len;
		while((len = fis.read(array)) != -1) {
			bos.write(array, 0, len);
		}
		
		//4.���ڴ������鵼��
		byte[] byteArray = bos.toByteArray();
		String s = new String(byteArray,0,byteArray.length);
		
		System.out.println("�ļ���������: ");
		System.out.println(s);
		System.out.println("****************");
		//ֱ�ӽ� �ڴ������ת�����ַ���
		System.out.println(bos);//bos.toString()
		
		//3.�ر��ļ���
		fis.close();
		//û�б�Ҫ
		//bos.close();
	}
	
	//* ģ�� С�ֽ����� ��ȡ�����ļ�����ʾ����������
	public static void main1(String[] args) throws Exception {
		
		//1.
		FileInputStream fis = new FileInputStream("src/a.txt");

		//2.С�����ȡ��Ȼ�����
		byte[] array = new byte[4];
		int len;
		while((len = fis.read(array)) != -1) {
			String str = new String(array,0,len);
			System.out.println("��ȡ��: " + str);
		}
		
		//3.
		fis.close();
	}
}




