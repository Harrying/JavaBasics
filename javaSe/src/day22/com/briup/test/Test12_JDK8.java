package day22.com.briup.test;

/*
 * jdk8新特性
 * 	1.接口中可以定义方法
 */
public class Test12_JDK8 {
	
	public static void main(String[] args) {
		System.out.println(Inter.num);
		//Inter.num = 12;

		//默认 final int n = 12;
		int n = 12;
		//在匿名内部类中如果使用局部变量，则 默认final修饰
		Inter i = new Inter() {
			@Override
			public void show() {
				//n = 10;
				System.out.println("show, n: " + n);
			}
		};
		
		i.show();
		i.disp();
		
		Inter.sdisp();
		
		System.out.println("*****************");
		
		//JDK8增加lambda表达式【可以由 匿名内部类简化得到】
		//	只能针对 只包含一个抽象方法的接口  使用Lambda表达式
		Inter i2 = ()->System.out.println("show, n: " + n);
		i2.show();
	}
	
}

interface Inter {
	//public static final 
	int num = 10;
	
	//public abstract 
	void show();
	
	//jdk8中，接口中可以定义方法，但是必须default修饰
	default public void disp() {
		System.out.println("in disp, num: " + num);
	}
	
	//jdk8中可以定义 static方法
	public static void sdisp() {
		System.out.println("in static disp, num: " + num);
	}
}









