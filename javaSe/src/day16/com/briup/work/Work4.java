package day16.com.briup.work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ��ǰ׼��һ���ļ�a.txt�����������£�
Jack-21-67 Tom-20-86 Lucy-19-81 Jack-21-67
��ȡ�ļ����ݣ���ֵõ���ӦStudent����
Ȼ�󽫶�����ӵ������У�ע�⼯���в��ܴ����ͬ����
�Ұ��շ����Ӹߵ������У�
�����������г�Ա����֤
 */
public class Work4 {
	public static void main(String[] args) throws Exception {
		//1.ȫ����ȡ�ļ�����
		File file = new File("src\\day16\\com\\briup\\work\\a.txt");
		InputStream is = new BufferedInputStream(new FileInputStream(file));
		
		//1.1һ��ȫ����ȡ�ļ���������  ����byte[]
		int size = is.available();
		byte[] arr = new byte[size];
		int len = is.read(arr);
		
		//1.2��byte[] ת���ַ�����Ȼ���һ�����
		String str = new String(arr,0,len);
	//	System.out.println("str: " + str);
		is.close();
		
		//2.��ֵõ�ѧ������
		//2.1 ��׼����TreeSet<Student>,�����洢ѧ��
		Set<Student> set = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num;
				if(o1.getScore() > o2.getScore()) {
					num =  1;
				}else if(o1.getScore() < o2.getScore()) {
					num =  -1;
				}else {
					num =  0;
				}
				
				if(num != 0) {
					return num;		
				}
				
				num = o2.getName().compareTo(o1.getName());
				return num;
			}
		});
		
		
		//2.2 ��" "�ָ��ַ������õ���ÿһ�����һ��ѧ��
		String[] array = str.split(" ");
		/*for (String string : array) {
			System.out.println(string);
		}*/
		for (int i = 0; i < array.length; i++) {
			//��ֵõ�ÿһ��ѧ������ 
			//"Jack-21-67"
			String s = array[i];
			String[] arr2 = s.split("-");
			
			String name = arr2[0];
			int age = Integer.parseInt(arr2[1]);
			double score = Double.parseDouble(arr2[2]);
			
			Student stu = new Student(name,age,score);
			//System.out.println("�� " + i + " ��ѧ��: " + stu);
			//3.��ӵ�TreeSet������
			set.add(stu);
		}
		
		//4.��������
		for (Student s : set) {
			System.out.println(s);
		}
	}
}





