package day19.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * ��׼�������������
 *   ��׼����   ��׼���  ��׼����
 *   
 */
public class Test01_SystemIo {
	public static void main(String[] args) throws Exception  {
		
		
		System.out.println("world");
		//1.�޸�ϵͳ�ı�׼����
		System.setOut(new PrintStream("src/a.txt"));
		
		//2 �������
		System.out.println("hello");
		
		//ע��:��׼���������  ����ر�  ϵͳ���Զ�����
		
		
		
	}
}
