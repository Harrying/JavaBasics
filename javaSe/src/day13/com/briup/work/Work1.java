package day13.com.briup.work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����ѧ����Ϣ����ʽΪ:����-ѧ�š��ɼ�");
		List<Student> list = new ArrayList<Student>();
		Set<Student> set = new HashSet<Student>();
		while (true) {
			String str = sc.nextLine();
			if(str.contains("quit")) {
				break;
			}
			Student s = new Student();
			String[] stu = str.split("-");
			String name = stu[0];
			int id = Integer.parseInt(stu[1]);
			double score = Double.parseDouble(stu[2]);
			s.setName(name);
			s.setId(id);
			s.setScore(score);
			list.add(s);
			//list.add(new Student(name, id, score));

			set.addAll(list);
		}
		System.out.println("���������ʾѧ����Ϣ��");
		for (Student sss : list) {
			System.out.println(sss);
		}
		
		System.out.println("ȥ���ظ���");
		
		for (Student ss : set) {
			System.out.println(ss);
		}
		
		List<Student> list2 = new ArrayList<Student>();
		
		list2.addAll(set);
		double count = 0;
		int i =0;
		Iterator<Student> it = list2.iterator();
		while(it.hasNext()) {
			
			count = count + list2.get(i).getScore();
			i++;
			if(i == list2.size()) {
				break;
			}
			
		}
		
		System.out.println("ƽ���ɼ�Ϊ��" + (count/(list2.size())));
		
		
		
		
	}
}
