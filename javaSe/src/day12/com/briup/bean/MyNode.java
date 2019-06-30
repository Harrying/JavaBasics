package day12.com.briup.bean;

/*
 * 定义泛型类【模板】
 * 	格式:
 * 		[修饰符] class 类名<泛型声明列表> {
 * 			...
 * 		}
 */		//         E: 声明的数据类型
public class MyNode<E> {
	//定义属性data  存放 数据 【确定的类型】
	//private int data;
	
	private E data;
	private int num;
	
	public MyNode() {}
	
	public MyNode(E data,int num) {
		this.data = data;
		this.num = num;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	public E getData() {
		return data;
	}

	@Override
	public String toString() {
		return "MyNode [data=" + data + ", num=" + num + "]";
	}
	
	//这个是泛型方法？  不是
	public void show(E e) {
		System.out.println("in show, e: " + e);
	}
	
	/* 泛型类中的静态方法必须要声明  为 泛型方法 */
	/*public static void show2(E e) {
		System.out.println("show2, e: " + e);
	}*/
	
	//必须显式的声明 泛型方法
	//[修饰符] <泛型声明列表> 返回值 函数名(形参列表) { ... }
	//public <E> void disp(E u) {
	public static <U> void disp(U u) {
		System.out.println("in disp, u: " + u);
	}
}






