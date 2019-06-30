package day13.com.briup.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import day13.com.briup.bean.Teacher;

/*
 * ʹ�������ڲ��� ��ȡ  �Ƚ�������
 * 	��ʽ:
 * 		[�ӿ�|���� ���� =] 
 * 		new �ӿ�|����(����ʵ��) {
 * 			��д���г��󷽷�
 * 		};
 */
public class Test11_�����ڲ��� {
	public static void main(String[] args) {
		//�Ȱ������������ٰ��չ��������ٰ�����������
		//ͨ���Ƚ��� ʵ�ֹ���
		Set<Teacher> set = new TreeSet<>(
				new Comparator<Teacher>() {
					@Override
					public int compare(Teacher t1, Teacher t2) {
						//������������
						int num = t1.getAge() - t2.getAge();
						if(num != 0)
							return num;
						
						//���� ��������
						if(t1.getSalary() > t2.getSalary())
							return 1;
						else if(t1.getSalary() < t2.getSalary())
							return -1;

						//���� ��������
						num = t1.getName().compareTo(t2.getName());
						
						//��֤�ظ��� ����  Ҳ������ӳɹ�
						//if(num == 0)
							//return 1;
						
						return num;
					}
				});
		
		set.add(new Teacher("Jack",27,4567.8));
		set.add(new Teacher("Jack",27,4567.8));
		set.add(new Teacher("Larry",28,467.8));
		set.add(new Teacher("Tom",28,4672.8));
		set.add(new Teacher("Lucy",28,467.8));
		set.add(new Teacher("Kevin",30,6567.8));
		
		System.out.println(set.size());
		
		for (Teacher t : set) {
			System.out.println(t);
		}
	}
}







