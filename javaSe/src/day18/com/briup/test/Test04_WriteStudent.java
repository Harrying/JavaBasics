package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day18.com.briup.bean.Student;


/*
 * 【注意】
 * 	  如果要通过对象流 操作 自定义对象，则自定义类型 必须实现 序列化接口
 * 
 *  * 定义Student name,age
 * 程序1.将两个学生 写入b.txt   
 * 	查看文件内容
 * 
 * 程序2.从b.txt读取学生出来，输出
 * 
 * 读取对象 出来，保证，文件里面放入的就是对象
 */
public class Test04_WriteStudent {
	//从b.txt文件中读取对象
	//	保证该文件中，已经放入了对象
	public static void main(String[] args) throws Exception {
		//1.流打开
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("src/b.txt"));
		
		//2.读取对象出来
		Student s1 = (Student) ois.readObject();
		Student s2 = (Student) ois.readObject();
		//注意，文件中存在几个对象，就读取几个对象，多读取会出现EOFException
		//Student s3 = (Student) ois.readObject();
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		//3.关闭流
		ois.close();
	}
	
	//往文件中写入对象
	public static void main1(String[] args) throws Exception {
		//1.打开对象流
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/b.txt"));
		
		//2.准备两个学生对象，写入文件
		Student s1 = new Student("zs", 20);
		Student s2 = new Student("Tom", 21);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		//3.关闭流
		oos.close();
	}
}




