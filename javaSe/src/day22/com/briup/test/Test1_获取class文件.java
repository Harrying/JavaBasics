package day22.com.briup.test;

import java.lang.reflect.Constructor;

import day22.com.briup.bean.Student;


public class Test1_获取class文件 {
	public static void main(String[] args) throws Exception {
		Class c2 = Student.class;
		//A.1：获取构造方法的数组：
			 	//1.public Constructor<?>[] getConstructors():获得所有公共构造方法
				Constructor[] cons1 = c2.getConstructors();
				for (Constructor cons : cons1) {
					System.out.println(cons);
				}
				System.out.println("******************************");
			
				//2.public Constructor<?>[] getDeclaredConstructors():获得所有构造方法
				Constructor[] cons2 = c2.getDeclaredConstructors();
				for (Constructor cons : cons2) {
					System.out.println(cons);
				}
		//A.2：获取单个构造方法(用于非私有的构造方法)
				//public Constructor<T> getConstructor(Class<?>... parameterTypes)
				//参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象
				Constructor  cons3 = c2.getConstructor();
				System.out.println(cons3);
				
				System.out.println("******************************");
		//A.3：获取单个构造方法（用于私有的构造方法）
				//public Constructor<T> getDeclaredtConstructor(Class<?>... parameterTypes)
				Constructor  cons4 = c2.getDeclaredConstructor(int.class);
				System.out.println(cons4);
				
				
				
				
				System.out.println("******************************");
		//通过反射获取公共带参构造方法并使用：
		//获取指定的构造方法，需要该方法的参数列表
		        Constructor cons5 = c2.getDeclaredConstructor(int.class,String.class,int.class);
		        System.out.println(cons5);
		        
		        // 通过带参构造方法对象创建对象
		        // public T newInstance(Object... initargs):
		        //有泛型，前面没使用泛型，先用Objcet
		        Object b = cons5.newInstance(12,"张三",45);
		        System.out.println(b); 
		        
		        
		        System.out.println("******************************");
	    //通过反射获取私有带参构造方法并使用：   
	    //获取指定的私有构造方法
		        Constructor cons6 = c2.getDeclaredConstructor(int.class);
		        
		        //public void setAccessible(boolean flag)：
		        //flag的值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。(设置权限)
		        cons6.setAccessible(true);
		        
		        //　public T newInstance(Object... initargs) 
		        Object ob = cons6.newInstance(19);
		        System.out.println(ob);		
	}
	
	
	
	
	
	
	
	
	public static void main1(String[] args) throws Exception {
		
		/*
		 * 获取class文件对象的方式：
		 */
		
		//方式A:Object类的getClass()方法
		Student t1 = new Student();
		Class c1 = t1.getClass();
		
		//方式B:数据类型的静态属性class
		Class c2 = Student.class;
		
		//方式C:Class类中的静态方法
		Class c3 = Class.forName("day22.com.briup.bean.Student");
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
	}
	

}
