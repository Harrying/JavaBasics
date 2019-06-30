package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * ͨ��Properties�����  ��ȡ �����ļ�user.properties��Ϣ
 */
public class Test09_Properties {
	public static void main(String[] args) throws Exception {
		//1.ʵ���� ���������
		Properties prop = new Properties();
		
		//2.���ļ����� ���� prop����
		prop.load(new FileInputStream("src/user.properties"));
		
		//3.����prop���������
		//�Ȼ�ȡ����key���ٻ�ȡvalue
		Set<String> keySet = prop.stringPropertyNames();
		for (String key : keySet) {
			String value = prop.getProperty(key);
			System.out.println(key + " " + value);
		}
		
//		String name = prop.getProperty("name");
//		int age = Integer.parseInt(prop.getProperty("age"));
//		String passwd = prop.getProperty("passwd");
		
		//System.out.println(name + " " + age + " " + passwd);
		
		//4.�޸� ˫�м����е�ֵ��Ȼ��д�ص� �����ļ�
		prop.setProperty("passwd", "zb");
		
		prop.store(new FileOutputStream("src/user.properties"), "this is user prop");
	}
}





