package day13.com.briup.work;

public class Comp implements Comparable<String>{

	public int compare(Object a,Object b) {
		String strA,strB;
		strA = (String) a;
		strB = (String) b;
		return strB.compareTo(strA);
	}
	

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
