package day19.com.briup.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * ���ݲ�����
 * 	DataInputStream
 * 	DataOutputStream
 * 
 */
public class Test02_DataIO {
	public static void main(String[] args) throws Exception {
		
		//1.ͨ��Data�� �� �ļ���д��  int char double����
		OutputStream os = new FileOutputStream("src/a.txt");
		DataOutputStream dos = new DataOutputStream(os);
		
		//os.write(97);	1�ֽ�
		//ֱ��д ������
		dos.writeInt(97);	//4�ֽ�
		dos.writeDouble(1.3);//8�ֽ�
		dos.writeChar('t');	//2
		
		dos.close();
		
		//2.���ļ��д��ڵ����ݣ���ȡ����
		DataInputStream dis = 
				new DataInputStream(new FileInputStream("src/a.txt"));
		//��ȡ�Ĵ���  Ҫ�� д�����һ��
		int num = dis.readInt();
		double d = dis.readDouble();
		char c = dis.readChar();
		//char c2 = dis.readChar();
		
		System.out.println(num);
		System.out.println(d);
		System.out.println(c);
		
		dis.close();
	}
}	







