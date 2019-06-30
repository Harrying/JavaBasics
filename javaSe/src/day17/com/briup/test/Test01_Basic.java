package day17.com.briup.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/*
 * 对比字节流 字符流 读取文件并输出
 * 	是否出现乱码问题  src/a.txt
 * 
 * 操作纯文本文件，只要通过 字符流即可，效率稍低，但是方便
 */
public class Test01_Basic {
	
	//2.小数组 字符流 读取文件并输出【捕获异常】
	public static void main(String[] args) {
		//Reader抽象类   FileReader文件输入字符流
		Reader r = null;
		try {
			//1.
			r = new FileReader("src/a.txt");
			
			//小数组读取
			char[] buff = new char[6];
			int len;
			while((len = r.read(buff)) != -1) {
				System.out.println(new String(buff,0,len));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.释放资源
			try {
				if(r != null)
					r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//1.小数组  字节楼 读取输出【自己捕获异常处理】
	public static void main1(String[] args) {
		InputStream is = null;
		try {
			//1.关联流对象和 文件
			//try块中放入可以出现异常的代码
			//	io每一步都会产生异常
			is = new FileInputStream("src/a.txt");
			
			//2.小数组读取
			byte[] buf = new byte[6];
			int len;
			while((len = is.read(buf)) != -1) {
				//输出读取到的 字节 --> char --> String 内容
				System.out.println(new String(buf,0,len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.关闭资源
			try {
				if(is != null)
					is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}








