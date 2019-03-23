package com.imooc.tel;
//接口的访问修饰符：public 默认
public interface INet {
	/**接口中抽象方法可以不写abstract关键字，
	 * 访问修饰符默认：public
	 * 当类实现接口的时候，需要实现接口中的所有抽象方法，否则需要将该类设置为抽象类
	 */
    void netework();
    
    //接口中可以包含常量，默认为public static final
    int TEMP=20;
    //default :默认方法 可以带方法体    jdk1.8后新增
    //可以在实现类中重写
    //其他类调用接口中的默认方法需要：接口.super.方法名
    default void connection() {
    	System.out.println("我是接口中的默认链接");
    }
    //static:静态方法 可以带方法体  需要 接口.方法名  调用
    //不可以在实现类中重写，可以通过接口名调用
    static void stop() {
    	System.out.println("我是接口中的静态方法");
    }
}
