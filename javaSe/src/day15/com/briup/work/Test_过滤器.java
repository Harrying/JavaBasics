package day15.com.briup.work;

import java.io.File;
import java.io.FilenameFilter;

public class Test_过滤器 {
	public static void main(String[] args) {
		File f= new File("d:\\sss");
		
		//通过过滤器获取所有.txt文件
		String[] list = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File f = new File(dir,name);
				
				return f.isFile() && f.getName().endsWith(".txt");
			}
		});
		for (String s : list) {
			System.out.println(s);
		}
	}
}
