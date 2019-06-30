package day22.com.briup.test;

/*
 * 枚举类学习
 * 
 */
public class Test10_Enum {
	public static void main(String[] args) {
		int n = 15;
		
		//给枚举变量赋值
		//	枚举类型名 变量 = 类名.枚举元素;
		Week2 w1 = Week2.MON;
		Week2 w2 = Week2.TUE;
		Week2 w3 = Week2.WED;
		
		w1.show();
	}
}

//定义枚举类的 方式2
enum Week2 {
	//注意，枚举元素 必须出现的第一行
	MON("星期一"),TUE("星期二"),WED("星期三");
	
	private String name;
	
	//注意，构造器必须私有
	private Week2(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("name: " + name);
	}
}

/*class Week3 {
	public static final Week3 MON = new Week3("星期一");
	public static final Week3 TUE = new Week3("星期二");
	public static final Week3 WED = new Week3("星期三");
	
	private String name;
	
	private Week3(String name) {
		this.name = name;
	}
}*/



