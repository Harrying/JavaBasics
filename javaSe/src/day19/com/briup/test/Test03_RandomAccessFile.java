package day19.com.briup.test;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/*
 * 随机访问流  输入|输出
 */
public class Test03_RandomAccessFile {
	public static void main(String[] args) throws Exception {
		//1.实例化对象  可以读也可以写
		RandomAccessFile raf = 
				new RandomAccessFile("src/a.txt", "rw");
		
		//调整偏移量，从0开始
		raf.seek(1);
		int data = raf.read();
		System.out.println("data: " + data);
		
		//调整文件偏移量
		int size = (int) raf.length();
		raf.seek(size-1);
		data = raf.read();
		System.out.println("data: " + data);
		
		//调整到文件头，写入数据
		raf.seek(raf.length() + 10);
		raf.write('t');
		
		raf.close();
	}
}







