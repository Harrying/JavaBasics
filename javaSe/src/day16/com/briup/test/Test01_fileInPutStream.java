package day16.com.briup.test;
/*
 * 测试InputStream基本功能
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test01_fileInPutStream {
	//循环读取 整个文件
	public static void main(String[] args)throws Exception {
		InputStream is = new FileInputStream("d:\\sss\\444.txt");
		
		//循环
		int n;
		while(true) {
			n = is.read();
			
			if(n == -1)
				break;
			System.out.print((char)n);
		}
		System.out.println();
		
		
		is.close();
	}
	
	
	
	
	//基本测试
	public static void main1(String[] args) throws Exception {
		//1.实例化流对象
		//  注意：操作本地文件，一定要FileXxxStream;
		// IO操作的每一步都会产生异常
		InputStream is = new FileInputStream("d:\\sss\\444.txt");
		
		//2.通过流对象操作数据
		//一次读取一个字节
		int n = is.read();
		System.out.println("read :" + n);
		n = is.read();
		System.out.println("read :" + n);
		n = is.read();
		System.out.println("read :" + n);
		n = is.read();
		System.out.println("read :" + n);
		//最后一次读取  读取到文件末尾 返回-1
		
	
		//关闭流
		is.close();
	}
	
}
