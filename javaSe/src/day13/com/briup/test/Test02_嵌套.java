package day13.com.briup.test;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import day13.com.briup.bean.Student;

//静态导入： 直接导入 类中的static方法
//import static 类的全包名.static方法名;
import static java.util.Arrays.asList;

/*
 * 集合的嵌套
 */
public class Test02_嵌套 {
	public static void main(String[] args) {
		List<String> l = asList("hello","world","abc","nihao");
		int[] arr = {1, 3, 5, 8};
//		List<int[]> l = Arrays.asList(arr);
//		List<Integer> l2 = Arrays.asList(1, 3, 5, 8);
		
		//定义两个小组集合，用来存放学生
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student("zs",21,89.5));
		list1.add(new Student("ls",20,79.5));
		list1.add(new Student("ww",19,80.5));
		
		List<Student> list2 = new ArrayList<>();
		list2.add(new Student("tom",21,70.5));
		//往上|下复制一行 	ctrl+alt+上下键
		list2.add(new Student("lucy",18,85.5));
		list2.add(new Student("jack",19,78.5));
		
		//准备班级集合，添加 两个小组
		List<List<Student>> list3 = new ArrayList<>();
		list3.add(list1);
		list3.add(list2);
		
		for (List<Student> list : list3) {
			System.out.println(list);
		}
	}
}




