package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 通过Properties类对象  获取 配置文件user.properties信息
 */
public class Test09_Properties {
	public static void main(String[] args) throws Exception {
		//1.实例化 配置类对象
		Properties prop = new Properties();
		
		//2.将文件内容 导入 prop对象
		prop.load(new FileInputStream("src/user.properties"));
		
		//3.遍历prop里面的内容
		//先获取所有key，再获取value
		Set<String> keySet = prop.stringPropertyNames();
		for (String key : keySet) {
			String value = prop.getProperty(key);
			System.out.println(key + " " + value);
		}
		
//		String name = prop.getProperty("name");
//		int age = Integer.parseInt(prop.getProperty("age"));
//		String passwd = prop.getProperty("passwd");
		
		//System.out.println(name + " " + age + " " + passwd);
		
		//4.修改 双列集合中的值，然后写回到 配置文件
		prop.setProperty("passwd", "zb");
		
		prop.store(new FileOutputStream("src/user.properties"), "this is user prop");
	}
}





