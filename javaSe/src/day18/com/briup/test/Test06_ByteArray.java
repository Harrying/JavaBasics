package day18.com.briup.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 采用 内存输出流，保存小数组读取到的所有 字节信息
 * 
 */
public class Test06_ByteArray {
	/*
	 * 小数组读取a.txt内容，然后将读取到的字节 写入到 内存输出流
	 * 全部写完以后，整个提取 内存流中数据，然后转换成String输出
	 */
	public static void main(String[] args) throws Exception {
		
		//1.
		FileInputStream fis = new FileInputStream("src/a.txt");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//2.小数组拷贝a.txt内容 到 内存流中
		byte[] array = new byte[4];
		int len;
		while((len = fis.read(array)) != -1) {
			bos.write(array, 0, len);
		}
		
		//4.将内存流数组导出
		byte[] byteArray = bos.toByteArray();
		String s = new String(byteArray,0,byteArray.length);
		
		System.out.println("文件内容如下: ");
		System.out.println(s);
		System.out.println("****************");
		//直接将 内存输出流转换成字符串
		System.out.println(bos);//bos.toString()
		
		//3.关闭文件流
		fis.close();
		//没有必要
		//bos.close();
	}
	
	//* 模拟 小字节数组 读取中文文件，显示有乱码问题
	public static void main1(String[] args) throws Exception {
		
		//1.
		FileInputStream fis = new FileInputStream("src/a.txt");

		//2.小数组读取，然后输出
		byte[] array = new byte[4];
		int len;
		while((len = fis.read(array)) != -1) {
			String str = new String(array,0,len);
			System.out.println("读取到: " + str);
		}
		
		//3.
		fis.close();
	}
}




