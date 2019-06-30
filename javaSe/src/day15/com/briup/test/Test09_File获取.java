package day15.com.briup.test;

import java.io.File;
import java.util.Date;

/*
 * * public String getAbsolutePath()����ȡ����·��
	* public String getPath():��ȡ·�������췽���д����
	* public String getName():��ȡ����
	* public long length():��ȡ���ȡ��ֽ���
	* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
 */
public class Test09_File��ȡ {
	public static void main(String[] args) {
		File f = new File("src/a.txt");
		
		System.out.println("a.txt����: " + f.length());
		System.out.println("getName: " + f.getName());
		//getPath()��ȡ���� ���� �������д��ݵ�·����
		System.out.println("getPath: " + f.getPath());
		System.out.println("getAbsolutePath: " + f.getAbsolutePath());
		
		//��ȡ���һ�η���ʱ��
		long t = f.lastModified();
		Date date = new Date(t);
		System.out.println("���һ���޸�ʱ��: " + date);
		
		//��ȡĿ¼�����е��ļ�����ͨ�ļ�����Ŀ¼��
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







