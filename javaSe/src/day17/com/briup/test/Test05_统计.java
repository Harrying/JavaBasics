package day17.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

/*
 * ����һ���ļ�src/a.txt 
 * ͳ��ÿһ���ַ����ֵĴ���
 * 
 * ʹ��TreeMapʵ�ֹ���
 * 	
 */
public class Test05_ͳ�� {
	public static void main(String[] args) throws Exception {
		
		//1.�����ļ�
		Reader r = new FileReader("src/a.txt");
		
		//2.����ַ���ȡ�ļ�����
		Map<Character, Integer> map = new TreeMap<>();
		int ch;
		while((ch = r.read()) != -1) {
			//���ַ��Լ�����ֵĴ�����ӵ�treeMap��
			char c = (char)ch;
			//�����ǰ�ַ� ������ map��
			if(map.containsKey(c) == false) {
				map.put(c, 1);
			}else {
				//����ַ��Ѿ�����map�У�������ټ�1
				Integer num = map.get(c);
				map.put(c, num+1);
			}
		}
		System.out.println("ȫ����ȡ��ɣ�map.size: " + map.size());
		
		//3.�ر�������
		r.close();
		
		//4.����TreeMap������ַ��Լ�����ֵĴ���
		//	����key����value   
		//	����entry��ֵ��
		for(Entry<Character, Integer> entry : map.entrySet()) {
			char c = entry.getKey();
			int num = entry.getValue();
			if(c == '\r') {
				//	��һ��\  ������ ���� �ڶ���\�ĺ��壬���κ�ϵͳ��Ϊ �ڶ���\ֻ��
				//	һ����ͨ���ַ� '\',�����ٺ�'r'��ϵõ� ת���ַ�'\r'
				System.out.print("\\r");
			}else if(c == '\n') {
				System.out.print("\\n");
			}else {
				System.out.print(c);
			}
			System.out.println(": " + num);
		}
	}
}



