package day22.com.briup.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import day21.com.briup.work.Student;

/*
 * 通过反射的方式获取Method
 * 然后调用Method
 * 
 */
public class Test06_Method {
	public static void main(String[] args) throws Exception {
		
		//1.获取字节码对象
		Student s = new Student();
		Class<? extends Student> clazz = s.getClass();
		
		//2.获取所有公共方法【包括父类继承的】
		Method[] methods = clazz.getMethods();
		System.out.println("size: " + methods.length);
		/*for (Method m : methods) {
			System.out.println(m);
		}*/
		System.out.println("*********************");
		//获取指定的公共方法
		Method method = clazz.getMethod("setName", String.class);
		System.out.println("method: " + method);
		
		//通过反射 让方法执行
		//s.setName("Tom");
		method.invoke(s, "Tom");
		
		System.out.println("s: " + s);
		
		System.out.println("******************");
		
		//通过Field修改属性值
		Field f = clazz.getDeclaredField("id");
		f.setAccessible(true);
		f.set(s, 18);
		
		System.out.println("s: " + s);
		
		System.out.println("*****************");
		
		// 通过反射 获取当前类中 所有方法【继承的除外】
		Method[] dArr = clazz.getDeclaredMethods();
		System.out.println(dArr.length);
		for (Method m : dArr) {
			System.out.println(m);
		}
		
		//通过反射 在类外调用 私有方法
		Method m2 = clazz.getDeclaredMethod("setAge", int.class);
		m2.setAccessible(true);
		m2.invoke(s, 21);
		
		System.out.println("s: " + s);
	}
}









