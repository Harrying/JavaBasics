package day14.com.briup.test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import day14.com.briup.bean.Student2;

/*
 * TreeMap����
 */
public class Test08_TreeMap {
	public static void main(String[] args) {
		//	name   student
		//��map����ӵ�ʱ�򣬰��� �����������
		//	���� ���ݱȽ������� ʵ�� �µ������㷨
		Map<String, Student2> map = new TreeMap<>(new Comparator<String>() {
			//�Ȱ������ֵĳ������򡾳��ķ�ǰ�桿, �ٰ�����Ȼ��������
			@Override
			public int compare(String o1, String o2) {
				int num = o2.length() - o1.length();
				
				if(num == 0) {
					num = o2.compareTo(o1);
				}
				
				return num;
			}
		});
		
		map.put("tom", new Student2("tom",23.4,56.2,34.5));
		map.put("jack", new Student2("jack",42.4,69.2,24.5));
		map.put("lucy", new Student2("lucy",73.4,62.2,54.5));
		map.put("zs", new Student2("zs",23.4,51.2,39.5));
		map.put("tom", new Student2("Tom",23.4,65.2,34.5));
		
		System.out.println("size: " + map.size());
		
		for (String key : map.keySet()) {
			Student2 value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
	
	public static void main2(String[] args) {
		//	name   student
		Map<String, Student2> map = new TreeMap<>();
		//��map����ӵ�ʱ�򣬰��� �����������
		//	ͨ��String��дComparable�������ԣ���ΪString����JDK�ṩ�ģ��������޸�
		//	������ ���ݱȽ������� ʵ�� �µ������㷨
		
		map.put("tom", new Student2("tom",23.4,56.2,34.5));
		map.put("jack", new Student2("jack",42.4,69.2,24.5));
		map.put("lucy", new Student2("lucy",73.4,62.2,54.5));
		map.put("zs", new Student2("zs",23.4,51.2,39.5));
		map.put("tom", new Student2("Tom",23.4,65.2,34.5));
		
		System.out.println("size: " + map.size());
		
		for (String key : map.keySet()) {
			Student2 value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
	
	public static void main1(String[] args) {
		//�ײ��� key���ж���������
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(10, "tom");
		map.put(5, "jack");
		map.put(1, "ww");
		map.put(3, "ls");
		map.put(7, "zs");
		map.put(5, "tom");
		
		System.out.println("size: " + map.size());
		System.out.println(map);
	}
}








