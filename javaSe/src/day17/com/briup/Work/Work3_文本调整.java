package day17.com.briup.Work;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * ��ҵ3: 
������һ���ļ�text.txt������������:
12.��ǰ���¹� 
4.�ֿ�ժ�ǳ�
8.һ�а���������
3.��ֻ���������
2.һƬһƬ��һƬ
9.��Լ�ƻ��
7.�����������
5.����«��������

�밴���ļ������кţ����ļ����ݵ��е�������
���� �к���С�����ʾ��
 */
public class Work3_�ı����� {
	public static void main(String[] args) {
		
		try (
			BufferedReader bf = new BufferedReader(new FileReader("src\\day17\\com\\briup\\3.txt"));
			
			//Reader r = InputStreamReader(new FileInputStream("src\\day17\\com\\briup\\3.txt"));	
				){
			String str;
			Map<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					int num = o1 - o2;
					return num;
				}
			});
			while((str=bf.readLine()) != null) {
				String[] st = str.split("\\.");
				int key = Integer.parseInt(st[0]);
				map.put(key, st[1]);	
			}
			
			for (Entry<Integer, String> it : map.entrySet()) {
				int key = it.getKey();
				String value = it.getValue();
				System.out.println(key + " : " + value);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static Reader InputStreamReader(FileInputStream fileInputStream) {
		// TODO Auto-generated method stub
		return null;
	}
}
