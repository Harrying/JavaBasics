package day14.com.briup.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 使用ArrayList集合模拟斗地主洗牌和发牌，牌没有排序
 */
public class Test10_斗地主 {
	public static void main(String[] args) {
		//1-13  13*4 = 52
		//	大小王    2   		52+2 == 54
		String[] color = {"方块", "梅花", "红桃", "黑桃"};
		String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		
		//1.准备好所有的牌，添加到list集合中
		List<String> list = new ArrayList<>();
		//嵌套遍历，得到所有的牌 添加到 List集合中
		for (String c : color) {
			for(String n : num) {
				String str = c + n;
				//添加到list
				list.add(str);
			}
		}
		
		list.add("小王");
		list.add("大王");
		
		//2.洗牌  次序打乱
		Collections.shuffle(list);
		
		//3.发牌 给三个人，还有留3张底牌
		List<String> gaojin = new ArrayList<>();
		List<String> longwu = new ArrayList<>();
		List<String> you = new ArrayList<>();
		List<String> dipai = new ArrayList<>();
		
		//遍历54张牌
		for(int i = 0; i < list.size(); i++) {
			//获取当前那张牌
			String s = list.get(i);
			//	51 52 53
			//		 51
			if(i >= list.size() - 3) {
				dipai.add(s);
			}else if(i % 3 == 0) {
				gaojin.add(s);
			}else if(i % 3 == 1) {
				longwu.add(s);
			}else {
				you.add(s);
			}
		}
		
		//4.输出牌面值
		System.out.println("高进: " + gaojin);
		System.out.println("龙五: " + longwu);
		System.out.println("自己: " + you);
		System.out.println("底牌: " + dipai);
		
	}
}
