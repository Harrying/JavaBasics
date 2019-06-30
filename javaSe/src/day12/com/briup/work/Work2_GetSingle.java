package day12.com.briup.work;

import java.util.ArrayList;

public class Work2_GetSingle {
	ArrayList<String> list = new ArrayList<String>();
	public void getSingle(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
	}
	/*ArrayList newarr = new ArrayList();
	Iterator it = arr.iterator();
	while (it.hasNext()) {
		String s = (String) it.next();
		if (!newarr.contains(s)) {
			newarr.add(s);
		}
	
	}
	for (int i = 0; i < newarr.size(); i++) {
		String s = (String) newarr.get(i);
		System.out.println(s);
	}*/

}
