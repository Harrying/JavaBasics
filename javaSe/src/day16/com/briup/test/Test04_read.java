package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ��ȡ�ļ�����
 * ������ͬ���ȵ�����
 * һ���Զ�ȡ�ļ������ֽڵ����顾ʵ�ʿ������������ʹ�á�
 */
public class Test04_read {

	public static void main(String[] args) throws Exception {
			
			InputStream is = new FileInputStream("d:\\a\\b.txt");
			
			byte[] array = new byte[12];
			
			int len;
			
			List<Byte> list = new ArrayList<Byte>();
			
			while((len = is.read(array)) != -1) {
				for (int i = 0; i < len; i++) {
					list.add(array[i]);
				}
			}
			Byte[] array2 = list.toArray(new Byte[0]);
			byte[] array3 = new byte[array2.length];
			for (int i = 0; i < array2.length; i++) {
				array3[i] = array2[i];
			}
			System.out.println(new String(array3));
			is.close();
		}	
	
	
	
	
	
	//����һ��С����  ��ζ�ȡһ���ļ�[�����������]
	public static void main2(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("d:\\a\\b.txt");
		
		byte[] array = new byte[12];
		
		int len;
		while((len = is.read(array)) != -1) {
			//���ʵ�ʶ�ȡ�����ֽ�
			System.out.println(new String(array,0,len));
		}
		
		is.close();
	}
	
	
	
	//һ���Զ�ȡ�ļ������ֽڵ����顾ʵ�ʿ������������ʹ�á�
	public static void main1(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("d:\\a\\b.txt");
		
		
		//��ȡ�ļ�����
		int size = is.available();
		System.out.println("�ļ�����" + size);
		//��������ռ�
		byte[] array = new byte[size];
		//��ȡ���ݵ�������
		int num = is.read(array);
		System.out.println("��ȡ�����ֽڸ�����" + num);
		
		//�����ȡ�����ļ�����
		String str = new String(array,0,num);
		System.out.println("��ȡ�����ļ��������£�");
		System.out.println(str);
		
		//��Դ�ر�
		is.close();
	}
}
