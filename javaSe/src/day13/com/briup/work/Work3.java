package day13.com.briup.work;


import java.util.Set;
import java.util.TreeSet;


public class Work3{
		public static void main(String[] args) {
			int[] stu = new int[10];
			for (int i = 0; i < 10; i++) {
				stu[i]= (int) (Math.random() * 40 +60);
				System.out.println(stu[i]);
			}
			Set<Student> set = new TreeSet<Student>();
 			Student s1 = new Student("aa", 20070301, stu[0]);
			Student s2 = new Student("bb", 20070302, stu[1]);
			Student s3 = new Student("cc", 20070303, stu[2]);
			Student s4 = new Student("dd", 20070304, stu[3]);
			Student s5 = new Student("ee", 20070305, stu[4]);
			Student s6 = new Student("ff", 20070306, stu[5]);
			Student s7 = new Student("gg", 20070307, stu[6]);
			Student s8 = new Student("hh", 20070308, stu[7]);
			Student s9 = new Student("ii", 20070309, stu[8]);
			Student s10 = new Student("jj", 20070310, stu[9]);
			
			set.add(s10);
			set.add(s9);
			set.add(s8);
			set.add(s7);
			set.add(s6);
			set.add(s5);
			set.add(s4);
			set.add(s3);
			set.add(s2);
			set.add(s1);
			for (Student ss : set) {
				System.out.println(ss);
			}
			
			
		}
}


