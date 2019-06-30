package day14.com.briup.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import day14.com.briup.bean.Student2;

/*
 * ׼��5�� Student2 ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),
	�����ִܷӸߵ������������̨
 */
public class Test01_TreeSet {
	public static void main(String[] args) {
		//1.׼��5��ѧ��
		Student2 s1 = new Student2("zs", 56.7, 78.5, 80.4);
		Student2 s2 = new Student2("ls", 45.7, 71.5, 85.4);
		Student2 s3 = new Student2("ww", 55.7, 72.5, 82.4);
		Student2 s4 = new Student2("zl", 65.7, 74.5, 86.4);
		Student2 s5 = new Student2("jack", 67.7, 70.5, 89.4);
		
		//���ģ�׼��һ���Ƚ����������ܷ�ֵ���бȽ�
		//2.��ѧ����ӵ�TreeSet������
		Set<Student2> set = new TreeSet<>(new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				double sum1 = o1.getSumScore();
				double sum2 = o2.getSumScore();
				
				//�����ܷ�  ��������  
				if(sum1 > sum2)
					return -1;
				else if(sum1 < sum2) 
					return 1;
				else 
					return 0;
			}
			
		});
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		//3.�������ϣ������ִܷӸߵ������
		//	��ǿforѭ����������������
		//	������
		//	set.toArray()  Ȼ�����
		//		����ͨ��get set��������
		for (Student2 s : set) {
			System.out.println(s);
		}
	}
}






