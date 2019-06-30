package day15.com.briup.test;

import java.io.File;
import java.io.IOException;

/*
 * File��Ļ���ʹ��
 * 	
 */
public class Test08_File {
	public static void main(String[] args) {
		//���·�������˭?�� ��Ե�ǰ��Ŀ Ŀ¼
		File f1 = new File("src");
		//�ж��ļ��Ƿ����
		boolean b1 = f1.exists();
		
		//����·��
		File f2 = new File("E:/a/a.txt");
		boolean b2 = f2.exists();
		
		System.out.println(b1);
		System.out.println(b2);
		
		//�ж��Ƿ��� ��ͨ�ļ�
		b1 = f2.isFile();
		
		//�ж��Ƿ��� Ŀ¼�ļ�
		b2 = f1.isDirectory();
		
		System.out.println("isFile: " + b1);
		System.out.println("isDir: " + b2);
		
		//E:/a/a.txt �ж��Ƿ�ɶ� ��д �Ƿ�����
		System.out.println("�Ƿ�ɶ�: " + f2.canRead());
		System.out.println("�Ƿ��д: " + f2.canWrite());
		System.out.println("�Ƿ�����: " + f2.isHidden());
		
		//ɾ������: ���߻���վ��ֱ��ɾ����
		b1 = f2.delete();
		System.out.println("ɾ������: " + b1);
		
		//���´����ļ�
		try {
			b1 = f2.createNewFile();
			System.out.println("createFile: " + b1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//����Ŀ¼
		File f3 = new File("E:/a/dir","secDir");
		//mkdir: ����Ŀ¼ʱ�����뱣֤
		//	secDir���ڵ�E:/a/dir�������
		//mkdir�� �����༶Ŀ¼����Ŀ¼�����ڣ����ȴ�����Ŀ¼
		//	�ٴ���secDir��Ŀ¼
		b1 = f3.mkdirs();
		System.out.println("����dir: " + b1);
		
		//�޸��ļ���
		b1 = f3.renameTo(new File("E:/a/dir/thDir"));
		System.out.println("rename: " + b1);
		
		
	}
}







