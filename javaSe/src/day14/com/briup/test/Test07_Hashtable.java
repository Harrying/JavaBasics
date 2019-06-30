package day14.com.briup.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * ���� HashMap  ��    Hashtable
 * 	���Դ��null      ���ܴ��null��  nullֵ
 */
public class Test07_Hashtable {
	public static void main(String[] args) {
		//HashMap�ǿ��Դ��null��  nullֵ��   Ч�ʸ�
		Map<String, String> map = new HashMap<>();
		
		map.put("zs", "001");
		map.put("ls", null);
		map.put(null, "005");
		map.put(null, "006");	//���ǡ�005��
		
		System.out.println(map);
		
		//Hashtable�����Դ��null��  nullֵ��     �������̰߳�ȫ��Ч�ʵ�
		Map<String, String> map2 = new Hashtable<>();
		map2.put("tom", "010");
		map2.put("jack", null);
		map2.put(null, "012");
		
		System.out.println(map2);
		
	}
}






