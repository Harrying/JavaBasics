package day18.com.briup.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import day18.com.briup.bean.Student;


public class Test03_ObjStuWrite {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/b.txt"));
				
				Student s1 = new Student("zs", 18);
				Student s2 = new Student("ls", 19);
				
				oos.writeObject(s1);
				oos.writeObject(s2);
				
				
				
				oos.close();
	}

}
