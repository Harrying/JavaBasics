package day22.com.briup.test;

import java.lang.reflect.Constructor;

import day21.com.briup.work.Student;

/*
 * 获取字节码对象里面的 所有构造器对象
 */
public class Test04_Constructor {
	public static void main(String[] args) throws Exception {
		
		//先获取构造器，用构造器实例化对象
		Class<?> clazz = Class.forName("day22.com.briup.homework.Student");
		
		//调用 公有 无参构造器 实例化对象
		//Student s = (Student) clazz.newInstance();
		
		//先获取三参构造器
		Constructor<?> con = clazz.getConstructor(int.class,String.class,int.class);
		//让构造器去运行,实例化对象
		Student s = (Student) con.newInstance(1, "zs", 22);
		
		System.out.println(s);
		
		//通过私有构造器实例化对象
		Constructor<?> con2 = clazz.getDeclaredConstructor(int.class);
		//额外操作，赋予 访问权限
		con2.setAccessible(true);
		s = (Student) con2.newInstance(12);
		System.out.println(s);
	}
	
	//获取类里面的构造器
	public static void main1(String[] args) throws Exception {
		
		//1.获取学生类的字节码对象
		Class<?> clazz = Class.forName("day22.com.briup.homework.Student");
		
		//2.获取该字节码对象的 构造器
		//				获取所有公共的构造器对象
		Constructor<?>[] cons = clazz.getConstructors();
		for (Constructor<?> con : cons) {
			System.out.println(con);
		}
		
		System.out.println("************");
		
		//获取指定的  共有构造方法
		//		获取无参   公有 构造器
		Constructor<?> con1 = clazz.getConstructor();
		System.out.println("con1: " + con1);
		
		//		获取三参  公有 构造器
		Constructor<?> con2 = clazz.getConstructor(int.class, String.class, int.class);
		System.out.println("con2: " + con2);
		
		System.out.println("***************************");
		//获取所有的构造器【包括 私有 保护 默认】
		Constructor<?>[] dCons = clazz.getDeclaredConstructors();
		for (Constructor<?> con : dCons) {
			System.out.println("con： " + con);
		}
		
		//获取任意指定构造器 【包括私有 保护 默认】
		Constructor<?> con3 = clazz.getDeclaredConstructor(int.class);
		System.out.println("con3: " + con3);
		
	}
}






