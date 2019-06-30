package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 从a.txt拷贝文件内容到c.txt
 */
public class Test03_Copy {
	public static void main(String[] args) throws Exception {
		//1.关联流对象和文件
//		InputStream is = new FileInputStream("E://a//a.txt");
		
		//通过字节流  逐个字节 拷贝  二进制图片
		InputStream is = new FileInputStream("src/day16/com/briup/1.png");
		OutputStream os = new FileOutputStream("E://a//1.png");
		
		//2.拷贝
		int n;
		int count = 0;
		while((n = is.read()) != -1) {
			count++;
			os.write(n);
		}
		System.out.println("size: " + count);
		
		//3.关闭资源[先打开的 后关闭，避免 依赖]
		os.close();
		is.close();
	}
}
