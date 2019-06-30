package day17.com.briup.Work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * 准备一个utf-8的文件 a.txt
 * 读取文件内容，输出显示，然后写入到b.txt里面
 * 但是b.txt是gbk编码
 */
public class Work1_编码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			Reader r = new InputStreamReader(new FileInputStream("src\\a.txt"), "utf-8");
			Writer w = new OutputStreamWriter(new FileOutputStream("src/b.txt"), "gbk");
		) {
			int len;
			System.out.println("输出信息为：");
			while((len = r.read()) != -1) {
				System.out.print((char)len);
				w.write(len);
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
