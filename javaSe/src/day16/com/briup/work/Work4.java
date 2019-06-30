package day16.com.briup.work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 提前准备一个文件a.txt，其内容如下：
Jack-21-67 Tom-20-86 Lucy-19-81 Jack-21-67
读取文件内容，拆分得到相应Student对象，
然后将对象添加到集合中，注意集合中不能存放相同对象，
且按照分数从高到底排列；
最后遍历集合中成员，验证
 */
public class Work4 {
	public static void main(String[] args) throws Exception {
		//1.全部读取文件内容
		File file = new File("src\\day16\\com\\briup\\work\\a.txt");
		InputStream is = new BufferedInputStream(new FileInputStream(file));
		
		//1.1一次全部读取文件所有内容  放入byte[]
		int size = is.available();
		byte[] arr = new byte[size];
		int len = is.read(arr);
		
		//1.2将byte[] 转换字符串，然后进一步拆分
		String str = new String(arr,0,len);
	//	System.out.println("str: " + str);
		is.close();
		
		//2.拆分得到学生对象
		//2.1 先准备好TreeSet<Student>,用来存储学生
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
		
		
		//2.2 以" "分割字符串，得到的每一项，都是一个学生
		String[] array = str.split(" ");
		/*for (String string : array) {
			System.out.println(string);
		}*/
		for (int i = 0; i < array.length; i++) {
			//拆分得到每一个学生对象 
			//"Jack-21-67"
			String s = array[i];
			String[] arr2 = s.split("-");
			
			String name = arr2[0];
			int age = Integer.parseInt(arr2[1]);
			double score = Double.parseDouble(arr2[2]);
			
			Student stu = new Student(name,age,score);
			//System.out.println("第 " + i + " 个学生: " + stu);
			//3.添加到TreeSet集合中
			set.add(stu);
		}
		
		//4.遍历集合
		for (Student s : set) {
			System.out.println(s);
		}
	}
}





