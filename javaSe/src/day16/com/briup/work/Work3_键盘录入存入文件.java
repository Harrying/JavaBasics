package day16.com.briup.work;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Work3_键盘录入存入文件 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入有效的文件目录：");
		String str1 = sc.next();
		System.out.println("请输入文件名：");
		String str2 = sc.next();
		String str = str1 + "\\" + str2;
		System.out.println(str);
		
		File file = new File(str);
		File file1 = new File(str1);
		if(!file.isFile()) {
			file1.mkdir();
			file.createNewFile();
		}
		System.out.println("请输入要写入的内容：");
		
		StringBuffer sb = new StringBuffer();
		while(true) {
			String stra = sc.nextLine();
			if(stra.equals("quit")) {
				break;
			}
			sb.append(stra);			
		}
		String h = sb.toString();
		BufferedWriter writer = new BufferedWriter(new FileWriter(str));
		
		writer.write(h);
		writer.close();
		
	}
}
