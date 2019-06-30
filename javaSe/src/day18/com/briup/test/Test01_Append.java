package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 
 * 如果要讲多个文件内容a.txt b.txt c.txt 按照次序 写入到另一个文件中
 * 推荐使用序列流
 */
public class Test01_Append {
	
	//简化写法
	public static void main(String[] args) throws Exception {
		//1.打开对应的流
		FileInputStream fis1 = new FileInputStream("src/a.txt");
		FileInputStream fis2 = new FileInputStream("src/b.txt");
		FileInputStream fis3 = new FileInputStream("src/c.txt");
		FileOutputStream fos = new FileOutputStream("src/d.txt");
		
		Vector<InputStream> vector = new Vector<>();
		vector.addElement(fis1);
		vector.addElement(fis2);
		vector.addElement(fis3);
		
		Enumeration<InputStream> elements = vector.elements();
		
		//实例化序列流，传递 集合的所有成员[包含了所有fis]
		SequenceInputStream sis = 
				new SequenceInputStream(elements);
		
		byte[] buff = new byte[12];
		int len;
		while((len = sis.read(buff)) != -1) {
			fos.write(buff,0,len);
		}
		
		//3.关闭流
		fos.close();
		sis.close();
	}
	
	public static void main2(String[] args) throws Exception {
		//1.打开序列流
		FileInputStream fis1 = new FileInputStream("src/a.txt");
		FileInputStream fis2 = new FileInputStream("src/b.txt");
		FileInputStream fis3 = new FileInputStream("src/c.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		SequenceInputStream sis2 = 
				new SequenceInputStream(sis, fis3);
		
		FileOutputStream fos = new FileOutputStream("src/d.txt");
		
		//2.逐个字符数组拷贝【字节流采用字节数组】
		byte[] buff = new byte[12];
		int len;
		while((len = sis2.read(buff)) != -1) {
			fos.write(buff,0,len);
		}
		
		//3.关闭流
		fos.close();
		sis2.close();
		
	}
	
	/*
	 * 将a.txt拷贝到d.txt
	 * 然后将b.txt追加到d.txt
	 */
	public static void main1(String[] args) throws Exception {
		//1.关联文件和流
		FileReader fr1 = new FileReader("src/a.txt"); 
		FileWriter fw = new FileWriter("src/d.txt");
		
		//2.小数组拷贝
		char[] buff = new char[12];
		int len;
		
		while((len = fr1.read(buff)) != -1) {
			fw.write(buff,0,len);
		}
		
		//3.关闭资源
		//fw.close();
		fr1.close();
		
		//4.在拷贝另一个文件
		FileReader fr2 = new FileReader("src/b.txt"); 
		//								写入 时候 追加，而非默认 覆盖
		//FileWriter fw2 = new FileWriter("src/d.txt",true);
		
		//5.
		while((len = fr2.read(buff)) != -1) {
			fw.write(buff,0,len);
		}
		
		//6
		fw.close();
		fr2.close();
	}
}








