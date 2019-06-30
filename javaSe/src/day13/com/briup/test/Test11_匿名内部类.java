package day13.com.briup.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import day13.com.briup.bean.Teacher;

/*
 * 使用匿名内部类 获取  比较器对象
 * 	格式:
 * 		[接口|父类 引用 =] 
 * 		new 接口|父类(构造实参) {
 * 			重写所有抽象方法
 * 		};
 */
public class Test11_匿名内部类 {
	public static void main(String[] args) {
		//先按照年龄排序，再按照工资排序，再按照名字排序
		//通过比较器 实现功能
		Set<Teacher> set = new TreeSet<>(
				new Comparator<Teacher>() {
					@Override
					public int compare(Teacher t1, Teacher t2) {
						//按照年龄排序
						int num = t1.getAge() - t2.getAge();
						if(num != 0)
							return num;
						
						//按照 工资排序
						if(t1.getSalary() > t2.getSalary())
							return 1;
						else if(t1.getSalary() < t2.getSalary())
							return -1;

						//按照 姓名排序
						num = t1.getName().compareTo(t2.getName());
						
						//保证重复的 对象  也可以添加成功
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







