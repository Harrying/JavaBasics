package day14.com.briup.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * 排序斗地主
 */
public class Test11_斗地主 {
	public static void main(String[] args) {
		String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] color = {"方块", "梅花", "红桃", "黑桃"};
		
		//1.准备好所有的牌，添加到TreeMap集合
		Map<Integer, String> map = new TreeMap<>();
		//嵌套遍历，得到所有的牌 添加到 List集合中
		int i = 0;
		for(String n : num) {
			for (String c : color) {
				String str = c + n;
				//添加到list
				map.put(i,str);
				i++;
			}
		}
		
		
		map.put(i,"小王");
		i++;
		map.put(i,"大王");
		
		//2.获取所有的key: 牌的所有编号
		//Set<Integer> keySet = map.keySet();
		List<Integer> list = new ArrayList<>();
		list.addAll(map.keySet());
		
		//3.洗牌
		Collections.shuffle(list);
		
		//4.发牌【自动排序】
		Set<Integer> gaojin = new TreeSet<>();
		Set<Integer> longwu = new TreeSet<>();
		Set<Integer> you = new TreeSet<>();
		Set<Integer> dipai = new TreeSet<>();
		
		for(i = 0; i < list.size(); i++) {
			//获取当前那张牌
			Integer n = list.get(i);
			
			if(i >= list.size() - 3) {
				dipai.add(n);
			}else if(i % 3 == 0) {
				gaojin.add(n);
			}else if(i % 3 == 1) {
				longwu.add(n);
			}else {
				you.add(n);
			}
		}
		System.out.println("斗地主：");
		//5.看牌   (姓名,编号集合,双列集合(编号，牌面值));
		showPai("发哥",gaojin,map);
		showPai("向华强",longwu,map);
		showPai("华仔",you,map);
		showPai("底牌",dipai,map);
		
		
	}

	private static void showPai(String name, Set<Integer> set, Map<Integer, String> map) {
		System.out.print(name + "的牌: ");
		for (Integer key : set) {
			String value = map.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}













