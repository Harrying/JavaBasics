package day17.com.briup.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 测试字符流拷贝      只能拷贝 纯文本文件
 * 			不能处理二进制文件
 */
public class Test02_拷贝 {
	public static void main(String[] args) throws Exception {
		//1.关联流对象
		Reader r = null;
		Writer w = null;
		try {
			r = new FileReader("src/1.jpg");

			w = new FileWriter("src/2.jpg");

			int data;
			while ((data = r.read()) != -1) {
				w.write(data);
			}

			System.out.println("拷贝已经完成");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		} finally {
			//每一个对象的close  都需要try-catch
			try {
				if(w != null)
					w.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(w != null)
					r.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}		
		}
	}
}
