package day17.com.briup.test;

import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 小数组拷贝  纯文本文件
 * 使用jdk1.6以后 新的异常处理
 */
public class Test03_Buff {
	public static void main(String[] args) {
		
		//如果采用如下格式，异常处理，则系统自动调用对象的close方法
		try(
			//1.流对象 和文件 关联
			Reader r = new FileReader("src/a.txt");
			Writer w = new FileWriter("src/b.txt");
			DemoClose demo1 = new DemoClose("第一个demo");
			DemoClose demo2 = new DemoClose("第二个demo");
		) {
			demo1.show();
			demo2.show();
			
			//2.流对象操作
			char[] buff = new char[8];
			int len;
			int count = 0;
			while((len = r.read(buff)) != -1) {
				//要注意，写入字符的个数
				w.write(buff, 0, len);
				count++;
			}
			System.out.println("一共拷贝: " + count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

//如果类 实现了Closeable接口，
//则通过特殊的try-catch，系统会自动调用其close方法
//相对于之前代码，省去finally代码，更简单
class DemoClose implements Closeable {
	
	private String name;
	
	public DemoClose(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("in DemoClose show() ...");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println(name + " close方法被调用了...");
	}
}








