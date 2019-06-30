package day10.com.briup.test;

import day10.com.briup.bean.Person;

public class Test02_Object {
	
	public static void main(String[] args) {
		//测试 equals()   判断两个对象是否相等
		Person p1 = new Person("zs",21);
		
		//复制一行	ctrl+alt+下键  
		//移动  alt+上下键【如果屏幕反转，则去处理】
		Person p2 = new Person("zs",21);
		
		System.out.println("p1 == p2: " + (p1 == p2));
		//判断是否相等  equals比较  所有属性值，而不是地址值
		boolean b = p1.equals(p2);
		System.out.println("b: " + b);
		
		//重写Person类的toString()方法
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
	}
	
	//hashCode()  getClass()  toString();
	public static void main1(String[] args) {
		//按下ctrl，鼠标点击类名
		Person p1 = new Person("zs", 21);
		//hashCode();
		//getClass();
		//无法确定 左侧变量 类型  ctrl+1: 
		
		//hashCode() 可以获取  当前对象的地址值
		int hashCode = p1.hashCode();
		System.out.println("hashCode: " + hashCode);
		
		//获取当前类的 字节码对象
		Class<? extends Person> clazz = p1.getClass();
		//获取类的名称【类的全包名】
		String name = clazz.getName();
		System.out.println("getClass.getName: " + name);
		
		//获取对象的 字符串形式
		String str = p1.toString();
		System.out.println("p1.toString(): " + str);
		
		//如果直接输出对象，则 自动 输出:  对象.toString()
		System.out.println("p1: " + p1);
	}
}





