package day17.com.briup.test;

import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * С���鿽��  ���ı��ļ�
 * ʹ��jdk1.6�Ժ� �µ��쳣����
 */
public class Test03_Buff {
	public static void main(String[] args) {
		
		//����������¸�ʽ���쳣������ϵͳ�Զ����ö����close����
		try(
			//1.������ ���ļ� ����
			Reader r = new FileReader("src/a.txt");
			Writer w = new FileWriter("src/b.txt");
			DemoClose demo1 = new DemoClose("��һ��demo");
			DemoClose demo2 = new DemoClose("�ڶ���demo");
		) {
			demo1.show();
			demo2.show();
			
			//2.���������
			char[] buff = new char[8];
			int len;
			int count = 0;
			while((len = r.read(buff)) != -1) {
				//Ҫע�⣬д���ַ��ĸ���
				w.write(buff, 0, len);
				count++;
			}
			System.out.println("һ������: " + count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

//����� ʵ����Closeable�ӿڣ�
//��ͨ�������try-catch��ϵͳ���Զ�������close����
//�����֮ǰ���룬ʡȥfinally���룬����
class DemoClose implements Closeable {
	
	private String name;
	
	public DemoClose(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("in DemoClose show() ...");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println(name + " close������������...");
	}
}








