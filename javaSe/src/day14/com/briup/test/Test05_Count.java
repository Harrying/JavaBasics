package day14.com.briup.test;

import java.util.HashMap;
import java.util.Map;

/*
 * 统计字符串中每个字符出现的次数
	String str = "aaaabbbccccchelloddccccc";
 */
public class Test05_Count {
	public static void main(String[] args) {
		//1.定义一个map集合  
		Map<Character, Integer> map = new HashMap<>();
		
		//2.字符串转换 成  char[]  然后遍历数组，逐个元素添加到map
		String str = "aaaabbbccccchelloddccccc";
		char[] array = str.toCharArray();
		for (char c : array) {
			//	判断该字符是否 已经存在于map中，如果不存在，put(char,1);
			if(map.containsKey(c) == false) {
				map.put(c, 1);
			}else {
				//	如果字符已经存在，获取对应的put(char,value+1);
				int v = map.get(c);
				map.put(c, v + 1);
			}
		}
		
		//3.遍历输出
		for (Character key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
	}
}







