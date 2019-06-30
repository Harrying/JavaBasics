package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 从本地文件中a.txt
 */
public class Test02_readObject {
	public static void main(String[] args) throws Exception {
		
		//1.打开对象输入流
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/a.txt"));
		
		
		Object obj1 = ois.readObject();
		Object obj2 = ois.readObject();
		//Object obj3 = ois.readObject();  EORException
		
		System.out.println("obj1:" + obj1);
		System.out.println("obj2:" + obj2);
		
		ois.close();
	}
}
