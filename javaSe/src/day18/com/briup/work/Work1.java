package day18.com.briup.work;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		List<Student> list = new ArrayList<Student>();
		System.out.println("������ѧ����Ϣ����ʽΪzs:5:19��");
		String bs = null;
		while(true) {
			
			bs = sc.nextLine();
			//�ж�������������
			if(bs.equals("quit")) {
				break;
			}
			String[] split = bs.split(":");
			double id = Double.parseDouble(split[1]);
			int age = Integer.parseInt(split[2]);
			
			list.add(new Student(split[0], id, age));
			
			
		}
		
		oos.writeObject(list);
		
		oos.close();
		
		byte[] b = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		
		List<Student> list2 = (List<Student>) ois.readObject();
		System.out.println("ѧ����ϢΪ��");
		for (Student s : list2) {
			System.out.println(s);
		}
		
		ois.close();
		
	}

}
