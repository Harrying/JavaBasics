package day18.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 准备字符串 对象，写入a.txt
 * 	通过对象流实现功能
 * 
 * 注意: 对象流为 字节流，写入到文件的是 二进制数据，人看不懂
 * 文本查看器 不认识二进制，显示乱码，
 */
public class Test02_Object {
	public static void main(String[] args) throws Exception {
		
		//1.关联流
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/a.txt"));
		
		//2.准备字符串对象，写入对象流
		String s1 = "hello";
		String s2 = "你好";
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		//3.关闭流
		oos.close();
		
	}
}






