package day17.com.briup.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/*
 * 将一个文本文档上的文本反转,
 * 第一行和倒数第一行交换,第二行和倒数第二行交换
 * 
 * 难点：读取一行  BufferedReader readLine()
 * '\r\n'
 */
public class Test04_反转 {
	public static void main(String[] args) throws Exception {
		
		//1.
		Reader fr = new FileReader("src/a.txt"); 
		BufferedReader br = new BufferedReader(fr);
		
		//2.逐行读取文件内容，并保存到list集合中
		List<String> list = new ArrayList<>();
		String line;
		while((line = br.readLine()) != null) {
			//将一行数据写入list
			list.add(line);
		}
		
		//3.关闭流对象
		br.close();
		
		//4.关联输出流和文件
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter("src/a.txt"));
		
		//5.遍历list,逐行写入【逆序】
		for(int i = list.size() - 1; i >= 0; i--) {
			//直接写    write(String)   注意跟上 换行符
			bw.write(list.get(i));
			if(i != 0) {
				//所有的平台，代码都没有问题
				bw.newLine();
				
				//windows专用
				//bw.write("\r\n");
			}
		}
		
		//6.关闭流
		bw.close();
	}
}






