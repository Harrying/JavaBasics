package day17.com.briup.Work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test02_试用 {
	public static void main(String[] args) throws Exception {
		
		//1.运行程序，从config.txt中读取剩余的次数
		//读取一行，转换成int
		BufferedReader br = 	//只要是操作文件，一定要通过文件流
				new BufferedReader(new FileReader("src\\day18\\com\\briup\\homework\\config.txt"));
		
		//2.输出提示信息: 剩余次数
		String line = br.readLine();
		int num = Integer.parseInt(line);
		if(num <= 0) {
			//	注意，次数为0，输出特殊提示，也不用再次写回
			System.out.println("试用次数已完，请购买正版!");
			br.close();
			return;
		}
		
		//下面就不是 次数为0的情况了，按照正常逻辑操作
		//3.将次数减1，重新写次数回文件
		System.out.println("试用次数还剩 " + num + " 次");
		num--;
		//使用完成就关闭流
		br.close();
		
		//将次数写回到同一个文件，保证输入流已经关闭
		//写字符 "9" "1" "0" "10"
		FileWriter fw = new FileWriter("src\\day18\\com\\briup\\homework\\config.txt");
		//写一个字符[9对应ASCII码表中那个字符] 到 文件
		//	将字符串 "9" 直接写回  
		fw.write(""+num);
		
		fw.close();
	}
}






