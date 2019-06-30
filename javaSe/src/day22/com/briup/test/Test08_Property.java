package day22.com.briup.test;

import java.lang.reflect.Field;

import day21.com.briup.work.Student;

/*
 * 定义一个函数 ，个任意对象 中 任意属性 进行赋值
 */
public class Test08_Property {

	public static void main(String[] args) throws Exception {
		Student s = new Student();
		
		Tool.setProperty(s, "name", "zs");
		Tool.setProperty(s, "age", 21);
		Tool.setProperty(s, "id", 2);
		
		System.out.println(s);
		
	}
}

class Tool {
	//私有工具类构造器  类外不能实例化对象
	private Tool() {}
	
	public static void setProperty(Object obj, String propertyName, Object value) throws Exception {
		
		//1.获取字节码对象
		Class<? extends Object> clazz = obj.getClass();
		//获取属性对象
		Field f = clazz.getDeclaredField(propertyName);
		f.setAccessible(true);
		
		//设置属性值
		f.set(obj, value);
	}
}





