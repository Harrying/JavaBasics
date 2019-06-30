package day17.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 测试字符流 		只能操作  纯文本文件
 * 					绝对不能  操作二进制文件
 */
public class Test02_Copy {
	public static void main(String[] args) {
		Reader r = null;
		Writer w = null;
		
		try {
			//	拷贝纯文本文件，没有问题
			//	能否拷贝 二进制文件  1.png   14381字节
			//1.关联流对象 和 文件	  2.png	  14362字节
			r = new FileReader("src/1.png");
			w = new FileWriter("src/2.png");
			
			//2.拷贝
			//	逐个字符拷贝
			//	小数组拷贝
			int data;
			while((data = r.read()) != -1) {
				w.write(data);
			}
			System.out.println("拷贝已经完成");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.关闭流【每一个对象.close都要try-catch】
			try {
				if(w != null)
					w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(r != null)
					r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}






