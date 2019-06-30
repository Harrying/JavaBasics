package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 准备一个mp3文件，通过小数组byte[1024] 拷贝
 * 					通过逐个字节拷贝，观察  效率
 * 					计时，System.currentTimeMillis()
 */
public class Test06_CopyMp3 {
	//小数组 拷贝
	public static void main(String[] args) throws Exception {
		
		//1.关联流对象和文件
		InputStream is = new FileInputStream("src\\day16\\com\\briup\\1.mp3");
		OutputStream os = new FileOutputStream("src\\day16\\com\\briup\\2.mp3");
		
		//2.数据拷贝 小数组拷贝
		long start = System.currentTimeMillis();
		byte[] array = new byte[1024 * 8];
		int len;
		while((len = is.read(array)) != -1) {
			os.write(array,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("使用的毫秒: " + (end - start));
		
		//3.关闭流对象 释放资源
		os.close();
		is.close();
	}
	
	public static void main1(String[] args) throws Exception {
		
		//1.关联流对象和文件
		InputStream is = new FileInputStream("src\\day16\\com\\briup\\1.mp3");
		OutputStream os = new FileOutputStream("src\\day16\\com\\briup\\2.mp3");
		
		//2.数据拷贝 单个字节逐个拷贝
		long start = System.currentTimeMillis();
		int data;
		while((data = is.read()) != -1) {
			os.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("使用的毫秒: " + (end - start));
		
		//3.关闭流对象 释放资源
		os.close();
		is.close();
	}
}






