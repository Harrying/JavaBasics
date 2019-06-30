package day14.com.briup.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import day14.com.briup.bean.Student2;

/*
 * 准备5个 Student2 学生信息(姓名,语文成绩,数学成绩,英语成绩),
	按照总分从高到低输出到控制台
 */
public class Test01_TreeSet {
	public static void main(String[] args) {
		//1.准备5个学生
		Student2 s1 = new Student2("zs", 56.7, 78.5, 80.4);
		Student2 s2 = new Student2("ls", 45.7, 71.5, 85.4);
		Student2 s3 = new Student2("ww", 55.7, 72.5, 82.4);
		Student2 s4 = new Student2("zl", 65.7, 74.5, 86.4);
		Student2 s5 = new Student2("jack", 67.7, 70.5, 89.4);
		
		//核心，准备一个比较器，按照总分值进行比较
		//2.将学生添加到TreeSet集合中
		Set<Student2> set = new TreeSet<>(new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				double sum1 = o1.getSumScore();
				double sum2 = o2.getSumScore();
				
				//按照总分  逆序排列  
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
		
		//3.遍历集合，按照总分从高到低输出
		//	增强for循环【借助迭代器】
		//	迭代器
		//	set.toArray()  然后遍历
		//		不能通过get set方法遍历
		for (Student2 s : set) {
			System.out.println(s);
		}
	}
}






