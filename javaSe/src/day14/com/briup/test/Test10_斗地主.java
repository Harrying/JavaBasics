package day14.com.briup.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ʹ��ArrayList����ģ�⶷����ϴ�ƺͷ��ƣ���û������
 */
public class Test10_������ {
	public static void main(String[] args) {
		//1-13  13*4 = 52
		//	��С��    2   		52+2 == 54
		String[] color = {"����", "÷��", "����", "����"};
		String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		
		//1.׼�������е��ƣ���ӵ�list������
		List<String> list = new ArrayList<>();
		//Ƕ�ױ������õ����е��� ��ӵ� List������
		for (String c : color) {
			for(String n : num) {
				String str = c + n;
				//��ӵ�list
				list.add(str);
			}
		}
		
		list.add("С��");
		list.add("����");
		
		//2.ϴ��  �������
		Collections.shuffle(list);
		
		//3.���� �������ˣ�������3�ŵ���
		List<String> gaojin = new ArrayList<>();
		List<String> longwu = new ArrayList<>();
		List<String> you = new ArrayList<>();
		List<String> dipai = new ArrayList<>();
		
		//����54����
		for(int i = 0; i < list.size(); i++) {
			//��ȡ��ǰ������
			String s = list.get(i);
			//	51 52 53
			//		 51
			if(i >= list.size() - 3) {
				dipai.add(s);
			}else if(i % 3 == 0) {
				gaojin.add(s);
			}else if(i % 3 == 1) {
				longwu.add(s);
			}else {
				you.add(s);
			}
		}
		
		//4.�������ֵ
		System.out.println("�߽�: " + gaojin);
		System.out.println("����: " + longwu);
		System.out.println("�Լ�: " + you);
		System.out.println("����: " + dipai);
		
	}
}
