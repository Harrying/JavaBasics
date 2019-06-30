package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test04_ObjStuRead {
	public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/b.txt"));
		
		Object obj1 = ois.readObject();
		Object obj2 = ois.readObject();
		
		System.out.println("obj1:" +obj1);
		System.out.println("obj2:" +obj2);
		
		
		ois.close();
		
	}
}
