package day15.com.briup.test;

import java.io.File;
import java.util.Date;

/*
 * * public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取路径，构造方法中传入的
	* public String getName():获取名称
	* public long length():获取长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
 */
public class Test09_File获取 {
	public static void main(String[] args) {
		File f = new File("src/a.txt");
		
		System.out.println("a.txt长度: " + f.length());
		System.out.println("getName: " + f.getName());
		//getPath()获取的是 你在 构造器中传递的路径名
		System.out.println("getPath: " + f.getPath());
		System.out.println("getAbsolutePath: " + f.getAbsolutePath());
		
		//获取最后一次访问时间
		long t = f.lastModified();
		Date date = new Date(t);
		System.out.println("最后一次修改时间: " + date);
		
		//获取目录中所有的文件【普通文件，子目录】
		File f2 = new File("E:/a");
		File[] listFiles = f2.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
		}
		
		/*String[] list = f2.list();
		for (String s : list) {
			System.out.println(s);
		}*/
		
	}
}







