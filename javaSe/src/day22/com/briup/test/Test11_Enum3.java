package day22.com.briup.test;

/*
 * 枚举类学习
 * 
 */
public class Test11_Enum3 {
	
	public static void main(String[] args) {
		
		//switch(表达式) byte short char int 
		//						String 枚举
		
		Week3 w = Week3.TUE;
		//Week3 w2 =  MON;
		
		System.out.println("枚举元素编号: " + w.ordinal());
		System.out.println(w.compareTo(Week3.WED));
		
		Week3 w3 = Week3.valueOf(Week3.class, "TUE");
		System.out.println("w3: " + w3);
		
		switch(w) {
			//在switch语句中  枚举元素可以直接出现
			case MON:
				System.out.println("case 匹配 MON");
				break;
			case TUE:
				System.out.println("case 匹配 TUE");
				break;
			case WED:
				System.out.println("case 匹配 WED");
				break;
			default:
				System.out.println("w的赋值有误");
		}
		
	}
	
	public static void main1(String[] args) {
		int n = 15;
		
		//给枚举变量赋值
		//	枚举类型名 变量 = 类名.枚举元素;
		Week3 w1 = Week3.MON; //绝对不可以 new 枚举类型
		Week3 w2 = Week3.TUE;
		Week3 w3 = Week3.WED;
		
		w1.show();
	}
}

//定义枚举类的 方式3
//	可以包含  抽象方法
enum Week3 {
	//注意，枚举元素 必须出现的第一行
	MON("星期一") {
		@Override
		public void show() {
			System.out.println("show, 星期一");
		}
	},TUE("星期二") {
		@Override
		public void show() {
			System.out.println("星期二");
		}
	},WED("星期三") {
		@Override
		public void show() {
			System.out.println("星期三");
		}
	};
	
	private String name;
	
	//注意，构造器必须私有
	private Week3(String name) {
		this.name = name;
	}
	
	//抽象方法
	public abstract void show();
}

