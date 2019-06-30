package day14.com.briup.test;

import java.util.HashMap;
import java.util.Map;

/*
 * Map���ϻ���ʹ��
 * 	˫�м��ϣ���� ��ֵ��  key-value
 * 	V put(K key,V value);	//����֮ǰkey��Ӧ��ֵ
 *  V remove(Object key);
 */
public class Test02_Map {
	public static void main(String[] args) {
		//HashMap�ײ� ԭ�� �� HashSetһ��
		Map<String, Integer> map = new HashMap<>();
		
		//����       ����
		//��map�����з��벻���ڵ�key-value���򷵻�null
		Integer v1 = map.put("zs", 20);
		Integer v2 = map.put("ls", 21);
		Integer v3 = map.put("ww", 19);
		Integer v4 = map.put("tom", 22);
		//��map�з��� �Ѿ����ڵ�keyֵ����ֵ�滻��ֵ��������ֵ
		Integer v5 = map.put("zs", 24);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println("v5: " + v5);
		
		//ɾ�� "zs"�ļ�ֵ��
		Integer v = map.remove("zs");
		System.out.println("remove zs: " + v);
		
		//��ռ���
		map.clear();
		System.out.println(map.isEmpty());
		System.out.println("size: " + map.size());
		
		System.out.println(map);
		
	}
}








