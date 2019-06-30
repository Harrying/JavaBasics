package day22.com.briup.test;

/*
 * 枚举类学习
 * 
 */
public class Test09_Enum {
	public static void main(String[] args) {
		int n = 15;
		
		//给枚举变量赋值
		//	枚举类型名 变量 = 类名.枚举元素;
		Week w1 = Week.MON;
		Week w2 = Week.TUE;
		Week w3 = Week.WED;
		//Week.WED = Week.TUE;
		//Week w4 = Week.FRI;
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		
		//Week2 w5 = Week2.MON;
	}
}

//方式1
//enum 枚举类名 { 枚举元素1,元素2,...;  }
enum Week {
	//可以认为 枚举元素就是  【该类的 public static final对象】
	MON,TUE,WED;
}

/*class Week2 {
	public final static Week2 MON = new Week2(); 
	public final static Week2 TUE = new Week2(); 
	public final static Week2 WED = new Week2(); 
}*/







