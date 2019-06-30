package day17.com.briup.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/*
 * ��һ���ı��ĵ��ϵ��ı���ת,
 * ��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
 * 
 * �ѵ㣺��ȡһ��  BufferedReader readLine()
 * '\r\n'
 */
public class Test04_��ת {
	public static void main(String[] args) throws Exception {
		
		//1.
		Reader fr = new FileReader("src/a.txt"); 
		BufferedReader br = new BufferedReader(fr);
		
		//2.���ж�ȡ�ļ����ݣ������浽list������
		List<String> list = new ArrayList<>();
		String line;
		while((line = br.readLine()) != null) {
			//��һ������д��list
			list.add(line);
		}
		
		//3.�ر�������
		br.close();
		
		//4.������������ļ�
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter("src/a.txt"));
		
		//5.����list,����д�롾����
		for(int i = list.size() - 1; i >= 0; i--) {
			//ֱ��д    write(String)   ע����� ���з�
			bw.write(list.get(i));
			if(i != 0) {
				//���е�ƽ̨�����붼û������
				bw.newLine();
				
				//windowsר��
				//bw.write("\r\n");
			}
		}
		
		//6.�ر���
		bw.close();
	}
}






