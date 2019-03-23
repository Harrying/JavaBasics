package com.imooc.poly;

public class Test {

	public static void main(String[] args) {
//		Animal one =new Animal();//1
//		/**向上转型，隐式转型，自动转型  
//		 * -->父类引用指向子类实例,可以调用子类重写父类的方法以及父类派生的方法，
//		 * -->子类特有的方法不能直接使用
//		 * 注意：父类重点静态方法无法被子类重写，所以向上转型之后只能调用父类原有的静态方法
//		 * 小类转型为大类
//		 */
//		Animal two= new Cat();
//		Animal three= new Dog();
//		
//		one.eat();
//		two.eat();
//		two.setMonth(2);
//		three.eat();
//		
//		System.out.println("----------------------------");
//		/*向下转型，及强制类型转换
//		 * 子类的引用指向父类对象，此处必须进行强转可以调用子类特有的方法
//		 * 必须满足转换条件才能进行强转
//		 * instanceof运算符：返回true/false
//		 */
//		if(two instanceof Cat) {
//		Cat temp =(Cat)two;
//		temp.eat();
//		temp.run();
//		temp.getMonth();
//		System.out.println("two可以转换为Cat类型");
//		}
//		
//		if(two instanceof Dog) {
//			Dog temp2=(Dog)two;
//			temp2.eat();
//			System.out.println("two可以转换为Dog类型");
//		}
//		
//		if(two instanceof Animal) {
//			System.out.println("Animal");
//		}
//		if(two instanceof Object) {
//			System.out.println("Object");
//		}
//
	}
}
