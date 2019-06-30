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
		//1.实例化 配置类对象
		Properties prop = new Properties();

		//2.将文件内容 导入 prop对象
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
		System.out.println("请输入新的name属性值：");
		prop.setProperty("name",sc.next());
		prop.store(new FileOutputStream("src\\day18\\com\\briup\\work\\user.properties"), "This is new name");

	}

}
