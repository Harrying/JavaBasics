package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import day18.com.briup.bean.Student;

/*
 * 1.通过集合整合所有学生对象，最后 写入文件c.txt
 * 2.在从c.txt读取集合对象，然后拆分 输出每一个学生对象
 */
public class Test05_ListObject {
	//从c.txt读取list
	public static void main(String[] args) throws Exception {
		//1.关联对象流
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("src/c.txt"));
		
		//2.读取
		List<Student> list = (List<Student>) ois.readObject();
		//遍历集合，输出所有学生信息
		for (Student s : list) {
			System.out.println(s);
		}
		
		//3.关闭流
		ois.close();
	}
	
	//往c.txt写入 list
	public static void main1(String[] args) throws Exception {
		//1.关联对象流和文件
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/c.txt"));
		
		//2.准备多个学生，添加到list中
		List<Student> list = new ArrayList<>();
		list.add(new Student("zs",21));
		list.add(new Student("ls",20));
		list.add(new Student("jack",19));
		list.add(new Student("lucy",11));
		
		//操作的对象 必须实现序列化接口
		oos.writeObject(list);
		
		//3.关闭流
		oos.close();
	}
}
