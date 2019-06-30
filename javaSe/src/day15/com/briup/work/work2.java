package day15.com.briup.work;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class work2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("请输入文件路径名");
			String path = sc.nextLine();
			File f = new File(path);
			if(f.exists()==false || f.isFile()==true) {
				System.out.println("文件目录不存，请重新输入");
				continue;
			}else if(f.isDirectory()){
				System.out.println("请输入新文件的文件名");
				String filename = sc.nextLine();
				String a = path + "\\" + filename;
				File f2 = new File(a);
				f2.createNewFile();
				System.out.println("新文件的绝对路径：" + f2.getAbsoluteFile());
				System.out.println("新文件的文件名：" + f2.getName());	
			}
			File[] list = f.listFiles();
			System.out.println("给文件目录下所有的.txt文件:");
			for (int i = 0; i < list.length; i++) {
				String s = list[i].toString();
				if(s.contains(".txt")) {
					System.out.println(list[i]);
				}
				
			}
			break;
			
		}
	}

}
