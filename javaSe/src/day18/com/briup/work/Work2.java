package day18.com.briup.work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.ʵ���� ���������
		Properties prop = new Properties();

		//2.���ļ����� ���� prop����
		prop.load(new FileInputStream("src\\day18\\com\\briup\\work\\user.properties"));
		
		
		String name = prop.getProperty("name");
		int age = Integer.parseInt(prop.getProperty("age"));
		double id = Double.parseDouble(prop.getProperty("id"));
		
		Student s = new Student(name, id, age);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\day18\\com\\briup\\work\\user.txt"));
		
		oos.writeObject(s);
		
		oos.close();
		
		

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\day18\\com\\briup\\work\\user.txt"));
		Object obj1 = ois.readObject();
		System.out.println(obj1);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������µ�name����ֵ��");
		prop.setProperty("name",sc.next());
		prop.store(new FileOutputStream("src\\day18\\com\\briup\\work\\user.properties"), "This is new name");

	}

}
