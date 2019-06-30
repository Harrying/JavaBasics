package day14.com.briup.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day14.com.briup.bean.Student;

public class Test04_student {
	public static void main(String[] args) {
		Student s1 = new Student("tom", 88, 55, 88);
		Student s2 = new Student("lili", 88, 55, 88);
		Student s3 = new Student("zong", 88, 55, 88);
		Student s4 = new Student("ls", 88, 55, 88);
		Student s5 = new Student("zs", 88, 55, 88);
		
		Map<Student, String> map = new HashMap<Student, String>();
		map.put(s2, "山西省");
		map.put(s3, "大同市");
		map.put(s4, "朔州市");
		map.put(s1, "中北大学");
		map.put(s5, "二龙山");
		
		System.out.println("*******************************");
		for (Student ss : map.keySet()) {
			String str =map.get(ss);
			System.out.println(ss + " : " + str);
		}
		System.out.println("******************************");
		
		Set<Entry<Student, String>> entrySet = map.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			Student keyStudent = entry.getKey();
			String value = entry.getValue();
			System.out.println( keyStudent + ":" + value );
		}
		

	}
}
	