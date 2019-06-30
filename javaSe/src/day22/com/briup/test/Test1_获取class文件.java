package day22.com.briup.test;

import java.lang.reflect.Constructor;

import day22.com.briup.bean.Student;


public class Test1_��ȡclass�ļ� {
	public static void main(String[] args) throws Exception {
		Class c2 = Student.class;
		//A.1����ȡ���췽�������飺
			 	//1.public Constructor<?>[] getConstructors():������й������췽��
				Constructor[] cons1 = c2.getConstructors();
				for (Constructor cons : cons1) {
					System.out.println(cons);
				}
				System.out.println("******************************");
			
				//2.public Constructor<?>[] getDeclaredConstructors():������й��췽��
				Constructor[] cons2 = c2.getDeclaredConstructors();
				for (Constructor cons : cons2) {
					System.out.println(cons);
				}
		//A.2����ȡ�������췽��(���ڷ�˽�еĹ��췽��)
				//public Constructor<T> getConstructor(Class<?>... parameterTypes)
				//������ʾ���ǣ���Ҫ��ȡ�Ĺ��췽���Ĺ�������������������͵�class�ֽ����ļ�����
				Constructor  cons3 = c2.getConstructor();
				System.out.println(cons3);
				
				System.out.println("******************************");
		//A.3����ȡ�������췽��������˽�еĹ��췽����
				//public Constructor<T> getDeclaredtConstructor(Class<?>... parameterTypes)
				Constructor  cons4 = c2.getDeclaredConstructor(int.class);
				System.out.println(cons4);
				
				
				
				
				System.out.println("******************************");
		//ͨ�������ȡ�������ι��췽����ʹ�ã�
		//��ȡָ���Ĺ��췽������Ҫ�÷����Ĳ����б�
		        Constructor cons5 = c2.getDeclaredConstructor(int.class,String.class,int.class);
		        System.out.println(cons5);
		        
		        // ͨ�����ι��췽�����󴴽�����
		        // public T newInstance(Object... initargs):
		        //�з��ͣ�ǰ��ûʹ�÷��ͣ�����Objcet
		        Object b = cons5.newInstance(12,"����",45);
		        System.out.println(b); 
		        
		        
		        System.out.println("******************************");
	    //ͨ�������ȡ˽�д��ι��췽����ʹ�ã�   
	    //��ȡָ����˽�й��췽��
		        Constructor cons6 = c2.getDeclaredConstructor(int.class);
		        
		        //public void setAccessible(boolean flag)��
		        //flag��ֵΪ true ��ָʾ����Ķ�����ʹ��ʱӦ��ȡ�� Java ���Է��ʼ�顣(����Ȩ��)
		        cons6.setAccessible(true);
		        
		        //��public T newInstance(Object... initargs) 
		        Object ob = cons6.newInstance(19);
		        System.out.println(ob);		
	}
	
	
	
	
	
	
	
	
	public static void main1(String[] args) throws Exception {
		
		/*
		 * ��ȡclass�ļ�����ķ�ʽ��
		 */
		
		//��ʽA:Object���getClass()����
		Student t1 = new Student();
		Class c1 = t1.getClass();
		
		//��ʽB:�������͵ľ�̬����class
		Class c2 = Student.class;
		
		//��ʽC:Class���еľ�̬����
		Class c3 = Class.forName("day22.com.briup.bean.Student");
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
	}
	

}
