package day22.com.briup.work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Zuoye001 {
public static void main(String[] args) throws Exception, IllegalAccessException {
	Class<?> clazz1 = Class.forName("java.util.Scanner");
	Constructor<?> con = clazz1.getConstructor(InputStream.class);
	 Scanner sc  = (Scanner) con.newInstance(System.in);
	
	String line;
	Class<?> clazz2 = ArrayList.class;
	List<Student> list = (List<Student>) clazz2.newInstance();
	Class<?> clazz3 = Student.class;
	//Student s = (Student) clazz3.newInstance();
	Constructor<?> con0 = clazz3.getDeclaredConstructor(String.class,int.class,double.class);
	con0.setAccessible(true);
	while(true) {
		line = sc.nextLine();
		if("quit".equals(line)) {
			break;
		}
		String[] sp = line.split(" ");
		 Student s = (Student) con0.newInstance(sp[0],Integer.parseInt(sp[1]),Double.parseDouble(sp[2]));
		list.add(s);
	}
	Class<?> clazz4 = ObjectOutputStream.class;
	Class<?> clazz5 = FileOutputStream.class;
	Class<?> clazz6 = PrintStream.class;
	Constructor<?> con1 = clazz4.getConstructor(OutputStream.class);
	Constructor<?> con2 = clazz5.getConstructor(String.class);
	ObjectOutputStream oos =  (ObjectOutputStream) con1.newInstance(con2.newInstance("src/Student22.txt"));
	Method method = clazz4.getMethod("writeObject", Object.class);
	Method method1 = clazz4.getMethod("close", null);
	method.invoke(oos, list);
	//oos.writeObject(list);
	//oos.close();
	method1.invoke(oos, null);
	//”ÎObjectOutputStreamœ‡¿‡À∆
	Class<?> clazz7 = ObjectInputStream.class;
	Class<?> clazz8 = FileInputStream.class;
	Constructor<?> con3 = clazz7.getConstructor(InputStream.class);
	Constructor<?> con4 = clazz8.getConstructor(String.class);
	ObjectInputStream ois = (ObjectInputStream) con3.newInstance(con4.newInstance("src/Student22.txt"));
	//ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Student22.txt"));
	Method method2 = clazz7.getMethod("readObject");
	Method method3 = clazz7.getMethod("close", null);
	List<Student> list2 = (List<Student>) method2.invoke(ois);
	//List<Student> list2 = (List<Student>) ois.readObject();
	Constructor<?> con5 = clazz6.getConstructor(String.class);
	PrintStream ps = (PrintStream) con5.newInstance("src/Student.txt");
	//PrintStream ps = new PrintStream("src/Student.txt");
	for (Student stu : list2) {
		System.out.println(stu);
		ps.println(stu);
		}
	ps.close();
	ois.close();
}
}
