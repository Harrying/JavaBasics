package day11.com.briup.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import day10.com.briup.work.Teacher;

public class List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Teacher> li = new ArrayList<>();
		//.����list����
		Teacher a1 = new Teacher("zhang3", 18, 3000);
		Teacher a2 = new Teacher("wang5", 10, 2300);
		Teacher a3 = new Teacher("li4", 25, 3500);
		Teacher a4 = new Teacher("wang5", 22, 3200);
		//����ĸ���ʦ
		li.add(a1);
		li.add(a2);
		li.add(a3);
		li.add(a4);
		//1.��ȡli4������
		int li4 = li.indexOf(a4);
		//2.���̻�ȡ��Ϣ  ����Ա������
		System.out.println("��������ʦzhao4����Ϣ��");
		String str = sc.nextLine();
		String[] sss = str.split("\\.",3);
		String name = sss[0];
		
		int age = Integer.parseInt(sss[1]);
		
		double salary = Double.parseDouble(sss[2]);
		Teacher a5 = new Teacher(name, age, salary);
		li.add(li4-1, a5);
		//3.�����ǰ���˵�����
		int count = li.size();
		System.out.println("��ǰ�����У�" + count +"��");
		//4.ʹ�����ַ�ʽ���������е���Ϣ
		System.out.println("********1.�������*********");
		
		Object[] array = li.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]: " + array[i]);
		}
		
		System.out.println("********2.��������*********");
		Iterator<Teacher> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("********3.get����*********");
		for(int index=0;index<li.size();index++) {
			System.out.println(li.get(index));
		    }
		
		//5.ɾ����������Ϊawng5����ʦ
		int[] shuzu = new int[count];
		int y = 0;
		for(int index=0;index<li.size();index++) {
			String ss =li.get(index).toString();
			 if(ss.contains("wang5")) {
				 li.remove(index);
				 y++;
			 }
		    }
		System.out.println("ɾ�������Ľ����");
		Iterator<Teacher> it2 = li.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
	}
}
