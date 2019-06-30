package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 使用小数组拷贝  文件
 * 	准备一个mp3文件，通过小数组byte[1024] 拷贝
 * 					通过逐个字节拷贝，观察  效率
 * 					计时，System.currentTimeMillis()
 */
public class Test05_ArrayCopy {
	public static void main(String[] args) throws Exception {
		//1.
		InputStream is = new FileInputStream("E://a//a.txt");
		OutputStream os = new FileOutputStream("E://a//c.txt");
		
		//2.
		byte[] array = new byte[12];
		int len;
		while((len = is.read(array)) != -1) {
			//注意: 读取多少个字节，就写入多少字节
			os.write(array, 0, len);
			System.out.println("一次写入 ...");
		}
		
		//3.
		os.close();
		is.close();
		
	}
}






