package day16.com.briup.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/*
 * 缓冲流 逐个字节拷贝  mp3文件
 */
public class Test07_Buffered {
	public static void main(String[] args) throws Exception {
		//如果要操作本地文件  必须通过 FileXxxStream
		InputStream is = 
				new FileInputStream("src\\day16\\com\\briup\\1.mp3");
		BufferedInputStream bis = new BufferedInputStream(is);
		
		BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("src\\day16\\com\\briup\\3.mp3"));
		
		//2.逐个字节拷贝
		long start = System.currentTimeMillis();
		int data;
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("使用的毫秒: " + (end - start));
		
		//3.只需要关闭  包装增强流，自动关闭 核心流
		bos.close();
		bis.close();
	}
}







