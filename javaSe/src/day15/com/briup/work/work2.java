package day15.com.briup.work;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class work2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�������ļ�·����");
			String path = sc.nextLine();
			File f = new File(path);
			if(f.exists()==false || f.isFile()==true) {
				System.out.println("�ļ�Ŀ¼���棬����������");
				continue;
			}else if(f.isDirectory()){
				System.out.println("���������ļ����ļ���");
				String filename = sc.nextLine();
				String a = path + "\\" + filename;
				File f2 = new File(a);
				f2.createNewFile();
				System.out.println("���ļ��ľ���·����" + f2.getAbsoluteFile());
				System.out.println("���ļ����ļ�����" + f2.getName());	
			}
			File[] list = f.listFiles();
			System.out.println("���ļ�Ŀ¼�����е�.txt�ļ�:");
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
