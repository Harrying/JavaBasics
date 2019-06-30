package day15.com.briup.test;

import java.io.File;
import java.io.IOException;

/*
 * File类的基本使用
 * 	
 */
public class Test08_File {
	public static void main(String[] args) {
		//相对路径【相对谁?】 相对当前项目 目录
		File f1 = new File("src");
		//判断文件是否存在
		boolean b1 = f1.exists();
		
		//绝对路径
		File f2 = new File("E:/a/a.txt");
		boolean b2 = f2.exists();
		
		System.out.println(b1);
		System.out.println(b2);
		
		//判断是否是 普通文件
		b1 = f2.isFile();
		
		//判断是否是 目录文件
		b2 = f1.isDirectory();
		
		System.out.println("isFile: " + b1);
		System.out.println("isDir: " + b2);
		
		//E:/a/a.txt 判断是否可读 可写 是否隐藏
		System.out.println("是否可读: " + f2.canRead());
		System.out.println("是否可写: " + f2.canWrite());
		System.out.println("是否隐藏: " + f2.isHidden());
		
		//删除功能: 不走回收站，直接删除掉
		b1 = f2.delete();
		System.out.println("删除返回: " + b1);
		
		//重新创建文件
		try {
			b1 = f2.createNewFile();
			System.out.println("createFile: " + b1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//创建目录
		File f3 = new File("E:/a/dir","secDir");
		//mkdir: 创建目录时，必须保证
		//	secDir所在的E:/a/dir必须存在
		//mkdir： 创建多级目录，父目录不存在，则先创建父目录
		//	再创建secDir子目录
		b1 = f3.mkdirs();
		System.out.println("创建dir: " + b1);
		
		//修改文件名
		b1 = f3.renameTo(new File("E:/a/dir/thDir"));
		System.out.println("rename: " + b1);
		
		
	}
}







