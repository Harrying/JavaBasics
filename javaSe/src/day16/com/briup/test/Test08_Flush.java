package day16.com.briup.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Test08_Flush {
	public static void main(String[] args) throws Exception {

		//1.关联 缓冲流对象  和 本地文件
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream("src\\day16\\com\\briup\\1.png"));
		BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("src\\day16\\com\\briup\\2.png"));
		
		//2.小数组拷贝
		byte[] buff = new byte[1024];
		int len;
		while((len = bis.read(buff)) != -1) {
			bos.write(buff, 0, len);
		}
		//通过程序员主动调用flush刷新缓冲区
		bos.flush();
		
		//3.不要关闭bos
		bos.close();//关闭 缓冲输出流，自动刷新缓冲区
		bis.close();
	}
}






