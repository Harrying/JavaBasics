package day22.com.briup.test;

/*
 * Lambda±í´ïÊ½
 */
public class Test13_Lambda {
	public static void main(String[] args) {
		Arith a1 = new Arith() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		Arith a2 = (x,y)->{return x + y;};
		
		Arith a3 = (x,y)->x + y;
		
		int s = a3.add(2, 3);
		System.out.println(s);
	}
}

interface Arith {
	public abstract int add(int x,int y);
}

