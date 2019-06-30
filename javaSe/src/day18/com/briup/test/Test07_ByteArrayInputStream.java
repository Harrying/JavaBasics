package day18.com.briup.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import day18.com.briup.bean.Student;

/*
 * 使用内存流 拷贝对象
 */
public class Test07_ByteArrayInputStream {
	public static void main(String[] args) throws Exception {
		//1.实例化对象输出流  内存输出流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		//2.往集合中添加学生对象，然后 将集合对象写入 流中
		List<Student> list = new ArrayList<>();
		list.add(new Student("zs",21));
		list.add(new Student("jack",20));
		list.add(new Student("lily",19));
		
		oos.writeObject(list);
		
		//3.关闭流
		oos.close();
		
		//4.准备 内存输入流  对象输入流
		//获取 字节数组，包含了list对象
		byte[] buf = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(buf);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		//5.读取list对象
		List<Student> list2 = (List<Student>) ois.readObject();
		
		//遍历集合
		for (Student s : list2) {
			System.out.println(s);
		}
		
		//6.关闭流对象
		ois.close();
	}
}










