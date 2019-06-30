package day22.com.briup.test;

import java.lang.reflect.Field;

import day21.com.briup.work.Student;

/*
 * ����һ������ ����������� �� �������� ���и�ֵ
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
	//˽�й����๹����  ���ⲻ��ʵ��������
	private Tool() {}
	
	public static void setProperty(Object obj, String propertyName, Object value) throws Exception {
		
		//1.��ȡ�ֽ������
		Class<? extends Object> clazz = obj.getClass();
		//��ȡ���Զ���
		Field f = clazz.getDeclaredField(propertyName);
		f.setAccessible(true);
		
		//��������ֵ
		f.set(obj, value);
	}
}





