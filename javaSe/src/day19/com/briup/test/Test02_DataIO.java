package day19.com.briup.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 数据操作流
 * 	DataInputStream
 * 	DataOutputStream
 * 
 */
public class Test02_DataIO {
	public static void main(String[] args) throws Exception {
		
		//1.通过Data流 往 文件中写入  int char double数据
		OutputStream os = new FileOutputStream("src/a.txt");
		DataOutputStream dos = new DataOutputStream(os);
		
		//os.write(97);	1字节
		//直接写 整形数
		dos.writeInt(97);	//4字节
		dos.writeDouble(1.3);//8字节
		dos.writeChar('t');	//2
		
		dos.close();
		
		//2.将文件中存在的数据，读取出来
		DataInputStream dis = 
				new DataInputStream(new FileInputStream("src/a.txt"));
		//读取的次序  要和 写入次序一致
		int num = dis.readInt();
		double d = dis.readDouble();
		char c = dis.readChar();
		//char c2 = dis.readChar();
		
		System.out.println(num);
		System.out.println(d);
		System.out.println(c);
		
		dis.close();
	}
}	







