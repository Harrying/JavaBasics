package day16.com.briup.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 文件操作的话，必须通过 文件流
 * 	FileOutputSteam
 * 	FileInputStream
 */
public class Test02_FileOutputStream {
	public static void main(String[] args) throws Exception {
		//往文件中  逐个字节写入数据
		//1.打开流对象 写入时，文件可以不存在
		OutputStream os = new FileOutputStream(new File("E://a//c.txt"));
		
		//2.逐个字节写入
		String str = "hello world";
		char[] array = str.toCharArray();
		for (char c : array) {
			//文件流写入，从文件起始位置开始
			os.write(c);
		}
//		os.write(97);
//		os.write('b');	//write(int);
//		os.write('c');
		
		//3.关闭流
		os.close();
		
	}
}










