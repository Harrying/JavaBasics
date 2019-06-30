package day16.com.briup.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 获取文件长度
 * 定义相同长度的数组
 * 一次性读取文件所有字节到数组【实际开发不介意如此使用】
 */
public class Test04_read {

	public static void main(String[] args) throws Exception {
			
			InputStream is = new FileInputStream("d:\\a\\b.txt");
			
			byte[] array = new byte[12];
			
			int len;
			
			List<Byte> list = new ArrayList<Byte>();
			
			while((len = is.read(array)) != -1) {
				for (int i = 0; i < len; i++) {
					list.add(array[i]);
				}
			}
			Byte[] array2 = list.toArray(new Byte[0]);
			byte[] array3 = new byte[array2.length];
			for (int i = 0; i < array2.length; i++) {
				array3[i] = array2[i];
			}
			System.out.println(new String(array3));
			is.close();
		}	
	
	
	
	
	
	//定义一个小数组  多次读取一个文件[可能输出乱码]
	public static void main2(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("d:\\a\\b.txt");
		
		byte[] array = new byte[12];
		
		int len;
		while((len = is.read(array)) != -1) {
			//输出实际读取到的字节
			System.out.println(new String(array,0,len));
		}
		
		is.close();
	}
	
	
	
	//一次性读取文件所有字节到数组【实际开发不介意如此使用】
	public static void main1(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("d:\\a\\b.txt");
		
		
		//获取文件长度
		int size = is.available();
		System.out.println("文件长度" + size);
		//开辟数组空间
		byte[] array = new byte[size];
		//读取数据到数组中
		int num = is.read(array);
		System.out.println("读取到的字节个数：" + num);
		
		//输出读取到的文件内容
		String str = new String(array,0,num);
		System.out.println("读取到的文件内容如下：");
		System.out.println(str);
		
		//资源关闭
		is.close();
	}
}
