package day15.com.briup.work;

import java.io.File;
import java.io.FilenameFilter;

public class Test_������ {
	public static void main(String[] args) {
		File f= new File("d:\\sss");
		
		//ͨ����������ȡ����.txt�ļ�
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
