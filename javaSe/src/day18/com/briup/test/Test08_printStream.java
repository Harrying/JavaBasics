package day18.com.briup.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

/*
 * 简单测试
 */
public class Test08_printStream {
	
	public static void main(String[] args) throws Exception {
		BufferedReader bd  = new BufferedReader(new FileReader("src/a.txt"));
		
		PrintStream ps = new PrintStream("src/b.txt");
		
		String line = null;
		
		while((line = bd.readLine()) != null) {
			boolean f = bd.ready();//判断流中是否还有数据
			if(f) {
				ps.println(line);
			}else {
				ps.print(line);
			}
			
		}
		
		ps.close();
		bd.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//通过打印流  向a.txt中写入对象
	public static void main1(String[] args) throws Exception {
		//1.创建流对象
		PrintStream ps = new PrintStream("src/a.txt");
		
		//测试自动刷新功能
		//2.写入内容到文件中
		ps.write(97);
		
		ps.print("华为MateBook14");
		ps.println("京东618");
		
	}
}
