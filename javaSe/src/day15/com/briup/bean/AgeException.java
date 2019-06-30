package day15.com.briup.bean;

//自定义编译时异常
public class AgeException extends Exception {

	public AgeException() {
		super();
	}

	public AgeException(String message) {
		super(message);
	}
	
}
