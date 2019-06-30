package day23.com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("src/a.txt"));
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		String line;
		while((line = br.readLine()) != null) {
			String[] spl = line.split(" ");
			for (int i = 0; i < spl.length; i++) {
				if(map.containsKey(spl[i]) == false) {
					map.put(spl[i], 1);
				}else {
					Integer num = map.get(spl[i]);
					map.put(spl[i], num+1);
				}
			}
		}
		br.close();
		Set<Entry<String, Integer>> entry = map.entrySet();
		for (Entry<String, Integer> e : entry) {
			System.out.println("字符串" + e.getKey() + " " + "出现次数：" + e.getValue());
		}
	}

}
