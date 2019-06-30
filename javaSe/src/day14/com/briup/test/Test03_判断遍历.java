package day14.com.briup.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ���� Map���ж�  ��������
 */
public class Test03_�жϱ��� {
	public static void main(String[] args) {
		//�ڶ��ֱ�����ʽ: ��ȡ���е�key-value����ֵ�ԡ���Ȼ��������
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "tom");
		map.put(5, "lily");
		map.put(3, "jack");
		map.put(4, "rose");
		map.put(2, "jack");
		map.put(4, "rose");
		
		//��ȡ���еļ�ֵ�� 
		//Set<Entry<Integer, String>> set = map.entrySet();
		for (Entry<Integer, String> entry : map.entrySet()) {
			//Integer key = entry.getKey();
			//String value = entry.getValue();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	public static void main2(String[] args) {
		//���ϵı�������1: �Ȼ�ȡ���е�key,����key,����key��ȡvalue
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "tom");
		map.put(5, "lily");
		map.put(3, "jack");
		map.put(4, "rose");
		map.put(2, "jack");
		map.put(4, "rose");
		
		//��������1: �Ȼ�ȡ���е�key,����key,����key��ȡvalue
		/*Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			
			System.out.println("key: " + key + " value: " + value);
		}*/
		
		for (Integer key : map.keySet()) {
			//String value = map.get(key);
			System.out.println(key + ": " + map.get(key));
		}
		
		
		
		
	}
	
	public static void main1(String[] args) {
		//    ѧ��     ����   
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "tom");
		map.put(5, "lily");
		map.put(3, "jack");
		map.put(4, "rose");
		map.put(2, "jack");
		map.put(4, "rose");
		
		//�ж��Ƿ� ����  key�� 4
		boolean b1 = map.containsKey(4);
		//�ж��Ƿ� ���� value: lucy
		boolean b2 = map.containsValue("lucy");
		
		System.out.println(b1);
		System.out.println(b2);
		
		//��ȡ���ܣ����ݼ� ��ȡֵ
		String value = map.get(10);
		System.out.println("10: " + value);
		
		//��ȡ���еļ�  �õ�set����
		Set<Integer> set = map.keySet();
		System.out.println("keySet: " + set);
		
		//��ȡ���е�ֵ
		Collection<String> coll = map.values();
		System.out.println("values: " + coll);
		
	}
}








