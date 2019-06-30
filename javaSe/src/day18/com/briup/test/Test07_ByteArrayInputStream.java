package day18.com.briup.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import day18.com.briup.bean.Student;

/*
 * ʹ���ڴ��� ��������
 */
public class Test07_ByteArrayInputStream {
	public static void main(String[] args) throws Exception {
		//1.ʵ�������������  �ڴ������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		//2.�����������ѧ������Ȼ�� �����϶���д�� ����
		List<Student> list = new ArrayList<>();
		list.add(new Student("zs",21));
		list.add(new Student("jack",20));
		list.add(new Student("lily",19));
		
		oos.writeObject(list);
		
		//3.�ر���
		oos.close();
		
		//4.׼�� �ڴ�������  ����������
		//��ȡ �ֽ����飬������list����
		byte[] buf = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(buf);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		//5.��ȡlist����
		List<Student> list2 = (List<Student>) ois.readObject();
		
		//��������
		for (Student s : list2) {
			System.out.println(s);
		}
		
		//6.�ر�������
		ois.close();
	}
}










