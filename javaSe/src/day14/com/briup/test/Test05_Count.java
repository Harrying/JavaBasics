package day14.com.briup.test;

import java.util.HashMap;
import java.util.Map;

/*
 * ͳ���ַ�����ÿ���ַ����ֵĴ���
	String str = "aaaabbbccccchelloddccccc";
 */
public class Test05_Count {
	public static void main(String[] args) {
		//1.����һ��map����  
		Map<Character, Integer> map = new HashMap<>();
		
		//2.�ַ���ת�� ��  char[]  Ȼ��������飬���Ԫ����ӵ�map
		String str = "aaaabbbccccchelloddccccc";
		char[] array = str.toCharArray();
		for (char c : array) {
			//	�жϸ��ַ��Ƿ� �Ѿ�������map�У���������ڣ�put(char,1);
			if(map.containsKey(c) == false) {
				map.put(c, 1);
			}else {
				//	����ַ��Ѿ����ڣ���ȡ��Ӧ��put(char,value+1);
				int v = map.get(c);
				map.put(c, v + 1);
			}
		}
		
		//3.�������
		for (Character key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
	}
}







