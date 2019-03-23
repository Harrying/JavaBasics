package com.imooc.test;

public class HotelAgeException extends Exception {
	public HotelAgeException() {
		super("18岁以下80岁以上入住必须由亲友陪同");
	}

}
