package day12.com.briup.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import day12.com.briup.bean.Teacher;

public class Test02_HomeWork {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("zs",23,4.5);
		Teacher t2 = new Teacher("ls",23,4.5);
		Teacher t3 = new Teacher("ww",23,4.5);
		Teacher t4 = new Teacher("ww",22,4.5);
		
		List<Teacher> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		//�������ϣ��������"ls"��Ա���������ʦ
		//������������������г��ֲ��������쳣���� ʹ��ListIterator���
		/*Iterator<Teacher> it = list.iterator();
		while(it.hasNext()) {
			Teacher t = it.next();
			String name = t.getName();
			if("ls".equals(name)) {
				//it.remove();
				//�����ʦ  ���ֲ��������쳣
				list.add(new Teacher());
			}
		}*/
		ListIterator<Teacher> it2 = list.listIterator();
		/*while(it2.hasNext()) {
			String name = it2.next().getName();
			if("ls".equals(name)) {
				it2.add(new Teacher());
			}
		}*/
		
		//��ͨ��next��ת�� ���
		while(it2.hasNext()) {
			it2.next();
		}
		
		//�Ӻ���ǰ����
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
		}
		
		System.out.println("size: " + list.size());
	}
	
	public static void main1(String[] args) {
		Teacher t1 = new Teacher("zs",23,4.5);
		Teacher t2 = new Teacher("ls",23,4.5);
		Teacher t3 = new Teacher("ww",23,4.5);
		Teacher t4 = new Teacher("ww",22,4.5);
		
		List<Teacher> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			Teacher t = list.get(i);
			if("ls".equals(t.getName())) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("δ�ҵ�ls����");
			return;
		}
		
		int index2 = index;
		
		//�Ӽ��̻�ȡ����ֵ������set
		System.out.println("��¼�� ��Ϣ: "); 
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		//zhao6.27.234.5
		index = line.indexOf(".");
		String name = line.substring(0, index);
		System.out.println("name: " + name);
		
		line = line.substring(index + 1);
		index = line.indexOf(".");
		String ageStr = line.substring(0, index);
		int age = Integer.parseInt(ageStr);
		System.out.println("age: " + age);
		
		line = line.substring(index + 1);
		double salary = Double.parseDouble(line);
		System.out.println("salary: " + salary);
		
		Teacher t5 = new Teacher(name,age,salary);
		
		list.add(index2, t5);
		
		System.out.println("list.size: " + list.size());
		
		//����������
		Iterator<Teacher> it = list.iterator();
		while(it.hasNext()) {
			Teacher t = it.next();
			if("ww".equals(t.getName())) {
				it.remove();//ͨ������������ɾ����û����
				//list.remove(t);//������������ͨ��listɾ�����������
			}
			//System.out.println(it.next());
		}
		
		System.out.println("after remove .size: " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}






