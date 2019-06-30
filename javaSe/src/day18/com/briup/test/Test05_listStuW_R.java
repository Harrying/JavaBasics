package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day18.com.briup.bean.Student;

public class Test05_listStuW_R {
	
	
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/b.txt"));
		
		List list = (List<Student>)ois.readObject();
		
		Iterator iterator = list.iterator();
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		
		//System.out.println(obj);
		ois.close();
	}

	
	
	
	
	
	
	public static void main1(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("zs", 18));
		list.add(new Student("ls", 18));
		list.add(new Student("ws", 45));
		list.add(new Student("ss", 8));
		list.add(new Student("dd", 55));
		list.add(new Student("ee", 66));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/b.txt"));
		
		oos.writeObject(list);
		
		oos.close();
	}

}
