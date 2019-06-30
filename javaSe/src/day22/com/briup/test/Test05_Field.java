package day22.com.briup.test;

import java.lang.reflect.Field;

import day21.com.briup.work.Student;

/*
 * 反射获取Field 相关操作
 */
public class Test05_Field {
	public static void main(String[] args) throws Exception {
		
		//1.获取字节码对象
		Class<?> clazz = Student.class;
		
		//获取所有的 公有属性
		Field[] fs = clazz.getFields();
		for (Field f : fs) {
			System.out.println(f);
		}
		
		//获取指定公有属性
		Field f1 = clazz.getField("name");
		System.out.println("f1: " + f1);
		
		System.out.println("*********************");
		//获取所有 属性[private 保护  默认]
		fs = clazz.getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f);
		}
		//获取指定任意 属性
		Field f2 = clazz.getDeclaredField("id");
		System.out.println("f2: " + f2);
		
		//实例化对象
		Student s = new Student();
		s.name = "zs";
		//s.id = 12;
		
		//通过反射 修改对象的属性值
		f2.setAccessible(true);
		f2.set(s, 12);
		
		System.out.println("s: " + s);
	}
}









