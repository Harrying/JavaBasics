package day17.com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

/*
 * 给你一个文件src/a.txt 
 * 统计每一个字符出现的次数
 * 
 * 使用TreeMap实现功能
 * 	
 */
public class Test05_统计 {
	public static void main(String[] args) throws Exception {
		
		//1.流打开文件
		Reader r = new FileReader("src/a.txt");
		
		//2.逐个字符读取文件内容
		Map<Character, Integer> map = new TreeMap<>();
		int ch;
		while((ch = r.read()) != -1) {
			//将字符以及其出现的次数添加到treeMap中
			char c = (char)ch;
			//如果当前字符 不存在 map中
			if(map.containsKey(c) == false) {
				map.put(c, 1);
			}else {
				//如果字符已经存在map中，其个数再加1
				Integer num = map.get(c);
				map.put(c, num+1);
			}
		}
		System.out.println("全部读取完成，map.size: " + map.size());
		
		//3.关闭流对象
		r.close();
		
		//4.遍历TreeMap，输出字符以及其出现的次数
		//	根据key遍历value   
		//	遍历entry键值对
		for(Entry<Character, Integer> entry : map.entrySet()) {
			char c = entry.getKey();
			int num = entry.getValue();
			if(c == '\r') {
				//	第一个\  作用是 屏蔽 第二个\的含义，屏蔽后系统认为 第二个\只是
				//	一个普通的字符 '\',不能再和'r'结合得到 转义字符'\r'
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



