package day18.com.briup.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day18.com.briup.bean.Student;

public class Test06_ByteArrayStu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Student> list  = new ArrayList<Student>();
		
		list.add(new Student("zs", 19));
		list.add(new Student("ls", 15));
		list.add(new Student("ww", 17));
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(list);
		
		
		oos.close();
		
		byte[] buf = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(buf);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		List<Student> list2 = (List<Student>) ois.readObject();
		
		
		Iterator<Student> iterator = list2.iterator();
		for (Student stu : list2) {
			System.out.println(stu);
		}
		
		ois.close();
		
	}

}
