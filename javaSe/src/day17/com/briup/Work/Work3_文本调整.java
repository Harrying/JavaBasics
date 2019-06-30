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
 * 作业3: 
现在有一个文件text.txt，其内容如下:
12.窗前明月光 
4.手可摘星辰
8.一行白鹭上青天
3.两只黄鹂鸣翠柳
2.一片一片又一片
9.人约黄昏后
7.人生若如初见
5.飞入芦花看不见

请按照文件左侧的行号，对文件内容的行调整次序，
最终 行号由小变大显示。
 */
public class Work3_文本调整 {
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
