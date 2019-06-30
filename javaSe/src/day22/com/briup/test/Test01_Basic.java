package day22.com.briup.test;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;

import day21.com.briup.work.Student;
/*
 * 字节码对象 基础了解
 */
public class Test01_Basic {
	public static void main(String[] args) {
		
		//1.获取到一个类的字节码对象
		//	三种方式
		Class<?> clazz1 =  FileInputStream.class;
		
		//获取自定义Student类的字节码对象
		Class<?> clazz2 = Student.class;
		Constructor<?>[] cons = clazz2.getConstructors();
		for (Constructor<?> c : cons) {
			System.out.println(c);
		}
	}
}







