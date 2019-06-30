package day22.com.briup.test;

import day21.com.briup.work.Student;

/*
 * 三种获取字节码对象的方式
 * 	
 * 	一个类的字节码对象 有且只有一个
 */
public class Test02_字节码对象 {
	public static void main(String[] args) throws Exception {
		//1. Class.forName("类的全包名");
		String className = "day22.com.briup.homework.Student";
		Class<?> clazz1 = Class.forName(className);

		System.out.println("clazz1: " + clazz1);
		
		//2. 当前类.class;
		Class<?> clazz2 = Student.class;
		
		//3. 对象.getClass();
		Student s = new Student();
		Class<? extends Student> clazz3 = s.getClass();
		
		//输出类的字节码对象  是否有且只有一个
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz3 == clazz2);
	}
}







