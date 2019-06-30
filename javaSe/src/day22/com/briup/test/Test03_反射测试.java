package day22.com.briup.test;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * 反射基本功能使用
 */
public class Test03_反射测试 {
	public static void main(String[] args) throws Exception {
		//实例化水果
		//Fruit f = new Apple();
		
		BufferedReader br = 
				new BufferedReader(new FileReader("src/config.txt"));
		//不修改代码，得到 不同的子类对象
		String className = br.readLine();
		// 先获取类的字节码对象
		Class<?> clazz1 = Class.forName(className);
		
		//再 由字节码对象  通过反射实例化子类对象
		//接口引用 指向  子类对象
		Fruit f = (Fruit) clazz1.newInstance();
		
		//实例化一个榨汁机对象
		Juicer j = new Juicer();
		j.run(f);
	}
}

//定义榨汁机
class Juicer {
	//传入水果，然后榨汁
	public void run(Fruit f) {
		f.squeeze();
	}
}

//定义水果接口
interface Fruit {
	//榨汁
	public void squeeze();
}

//定义 苹果类
class Apple implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯苹果汁儿");
	}
}

//定义 桔子类
class Orange implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯桔子汁儿");
	}
}







