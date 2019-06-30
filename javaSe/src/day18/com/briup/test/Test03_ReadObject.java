package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 从 本地文件中a.txt【已经放入了对应类型的对象】
 * 读取 对象出来
 * 
 */
public class Test03_ReadObject {
	public static void main(String[] args) throws Exception {
		
		//1.打开对象 输入流
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("src/a.txt"));
		
		//2.读取文件内容，注意，放的是什么，就读取什么
		Object obj1 = ois.readObject();
		Object obj2 = ois.readObject();
		//Object obj3 = ois.readObject();	EOFException
		
		String s1 = (String)obj1;
		//Integer s2 = (Integer)obj2;	放入的类型 和读取的 类型 一定保持一致
		
		System.out.println("obj1: " + s1);//Object.toString();
		System.out.println("obj2: " + obj2.toString());
		
		//3.关闭流
		ois.close();
	}
}





