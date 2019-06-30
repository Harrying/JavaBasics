package day19.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 标准输入输出流测试
 *   标准输入   标准输出  标准出错
 *   
 */
public class Test01_SystemIo {
	public static void main(String[] args) throws Exception  {
		
		
		System.out.println("world");
		//1.修改系统的标准测试
		System.setOut(new PrintStream("src/a.txt"));
		
		//2 输出测试
		System.out.println("hello");
		
		//注意:标准输入输出流  无需关闭  系统会自动处理
		
		
		
	}
}
