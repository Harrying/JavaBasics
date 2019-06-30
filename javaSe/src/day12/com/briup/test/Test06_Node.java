package day12.com.briup.test;

import day12.com.briup.bean.MyNode;
import day12.com.briup.bean.Teacher;

/*
 * 泛型类测试
 */
public class Test06_Node {
	public static void main(String[] args) {
		//实例化对象
		//List<E>
		//List<Integer> list = new ArrayList<>();
		
		//泛型类实例化对象   需要<>中指定 数据类型
		//	泛型： 引用数据类型
		MyNode<Integer> node = new MyNode<>();
		node.setData(10);
		System.out.println(node);
		
		System.out.println("*********************");
		MyNode<String> node2 = new MyNode<>();
		node2.setData("zs");
		System.out.println(node2);
		
		//泛型方法的调用，和普通方法调用 没有区别
		//	调用的过程中，系统会自觉确定 泛型类型，然后传值
		node2.disp("lisi");
		node2.disp(123);
		node.disp(new Teacher("zs", 23, 2345.1));
		
		//静态泛型方法的调用，通过对象名调用，与普通方法调用没有区别
		//	直接通过   类名.static泛型方法()
		//MyNode<String>.disp(13);
		MyNode.disp("hello world");
	}
}





