package day13.com.briup.test;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import day13.com.briup.bean.Student;

//��̬���룺 ֱ�ӵ��� ���е�static����
//import static ���ȫ����.static������;
import static java.util.Arrays.asList;

/*
 * ���ϵ�Ƕ��
 */
public class Test02_Ƕ�� {
	public static void main(String[] args) {
		List<String> l = asList("hello","world","abc","nihao");
		int[] arr = {1, 3, 5, 8};
//		List<int[]> l = Arrays.asList(arr);
//		List<Integer> l2 = Arrays.asList(1, 3, 5, 8);
		
		//��������С�鼯�ϣ��������ѧ��
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student("zs",21,89.5));
		list1.add(new Student("ls",20,79.5));
		list1.add(new Student("ww",19,80.5));
		
		List<Student> list2 = new ArrayList<>();
		list2.add(new Student("tom",21,70.5));
		//����|�¸���һ�� 	ctrl+alt+���¼�
		list2.add(new Student("lucy",18,85.5));
		list2.add(new Student("jack",19,78.5));
		
		//׼���༶���ϣ���� ����С��
		List<List<Student>> list3 = new ArrayList<>();
		list3.add(list1);
		list3.add(list2);
		
		for (List<Student> list : list3) {
			System.out.println(list);
		}
	}
}




