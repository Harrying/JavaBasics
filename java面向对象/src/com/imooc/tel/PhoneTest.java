package com.imooc.tel;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  FourthPhone phone= new FourthPhone();
  phone.cal();
  phone.message();
  phone.vedio();
  phone.music();
  phone.photo();
  phone.network();
  System.out.println("-----------------------");
  IPhoto ip = new FourthPhone();
  ip.photo();
  ip=new Camera();
  ip.photo();
  System.out.println("-------------------------");
  System.out.println(INet.TEMP);
	}

}
