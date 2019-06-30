package day18.com.briup.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import day18.com.briup.bean.Student;

/*
 * 1.ͨ��������������ѧ��������� д���ļ�c.txt
 * 2.�ڴ�c.txt��ȡ���϶���Ȼ���� ���ÿһ��ѧ������
 */
public class Test05_ListObject {
	//��c.txt��ȡlist
	public static void main(String[] args) throws Exception {
		//1.����������
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("src/c.txt"));
		
		//2.��ȡ
		List<Student> list = (List<Student>) ois.readObject();
		//�������ϣ��������ѧ����Ϣ
		for (Student s : list) {
			System.out.println(s);
		}
		
		//3.�ر���
		ois.close();
	}
	
	//��c.txtд�� list
	public static void main1(String[] args) throws Exception {
		//1.�������������ļ�
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/c.txt"));
		
		//2.׼�����ѧ������ӵ�list��
		List<Student> list = new ArrayList<>();
		list.add(new Student("zs",21));
		list.add(new Student("ls",20));
		list.add(new Student("jack",19));
		list.add(new Student("lucy",11));
		
		//�����Ķ��� ����ʵ�����л��ӿ�
		oos.writeObject(list);
		
		//3.�ر���
		oos.close();
	}
}
