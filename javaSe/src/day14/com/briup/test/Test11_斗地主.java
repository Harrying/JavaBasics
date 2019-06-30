package day14.com.briup.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * ���򶷵���
 */
public class Test11_������ {
	public static void main(String[] args) {
		String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] color = {"����", "÷��", "����", "����"};
		
		//1.׼�������е��ƣ���ӵ�TreeMap����
		Map<Integer, String> map = new TreeMap<>();
		//Ƕ�ױ������õ����е��� ��ӵ� List������
		int i = 0;
		for(String n : num) {
			for (String c : color) {
				String str = c + n;
				//��ӵ�list
				map.put(i,str);
				i++;
			}
		}
		
		
		map.put(i,"С��");
		i++;
		map.put(i,"����");
		
		//2.��ȡ���е�key: �Ƶ����б��
		//Set<Integer> keySet = map.keySet();
		List<Integer> list = new ArrayList<>();
		list.addAll(map.keySet());
		
		//3.ϴ��
		Collections.shuffle(list);
		
		//4.���ơ��Զ�����
		Set<Integer> gaojin = new TreeSet<>();
		Set<Integer> longwu = new TreeSet<>();
		Set<Integer> you = new TreeSet<>();
		Set<Integer> dipai = new TreeSet<>();
		
		for(i = 0; i < list.size(); i++) {
			//��ȡ��ǰ������
			Integer n = list.get(i);
			
			if(i >= list.size() - 3) {
				dipai.add(n);
			}else if(i % 3 == 0) {
				gaojin.add(n);
			}else if(i % 3 == 1) {
				longwu.add(n);
			}else {
				you.add(n);
			}
		}
		System.out.println("��������");
		//5.����   (����,��ż���,˫�м���(��ţ�����ֵ));
		showPai("����",gaojin,map);
		showPai("��ǿ",longwu,map);
		showPai("����",you,map);
		showPai("����",dipai,map);
		
		
	}

	private static void showPai(String name, Set<Integer> set, Map<Integer, String> map) {
		System.out.print(name + "����: ");
		for (Integer key : set) {
			String value = map.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}













