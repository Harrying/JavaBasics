package day13.com.briup.test;

import java.util.HashSet;
import java.util.Set;

/*
 * 				Math类    Random类   			HashSet
 * 编写一个程序，获取10个[1,20]的随机数，要求随机数不能重复。
 * 并把最终的随机数输出到控制台。
 */
public class Test05_Random {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		int n;
		//定义计数器
		int count = 0;
		while(true) {
			//[0,1.0) -->  [0.0,20.0) --> [1,20]
			//强制类型转换() 优先级 高于 运算符
			//n = ((int)Math.random() * 20 + 1);

			n = ((int)(Math.random() * 20) + 1);
			count++;
			set.add(n);
			
			//通过集合的元素个数  保证 获取10个随机数
			if(set.size() == 10)
				break;
		}//使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
		
		System.out.println("一共生成随机数个数: " + count);
		
		for (Integer i : set) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
