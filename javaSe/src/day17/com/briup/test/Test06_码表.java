package day17.com.briup.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 只要是 读取、写入  出现乱码问题，
 * 原因肯定是操作的文件 和 程序的编码不一致。
 * 文件编码:  通过文件的属性查看
 * 程序编码:  通过java文件属性查看
 * 
 * 转换流:
 * 	InputStreamReader
 * 	OutputStreamWriter
 */
public class Test06_码表 {
	public static void main(String[] args) throws Exception {
		
		//实例化流对象的时候，指定编码表
		//Reader r = new FileReader("src/a.txt");
		
		//增强类: 转换字节流【让核心流 按照用户指定的码表进行 编码】
		InputStream is = new FileInputStream("src/a.txt");
		Reader r = new InputStreamReader(is, "utf-8");
		
		int ch;
		while((ch = r.read()) != -1) {
			System.out.println("ch: " + ch + " " + (char)ch);
		}
		
		r.close();
	}
}
