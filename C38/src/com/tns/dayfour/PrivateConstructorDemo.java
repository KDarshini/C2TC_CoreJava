package com.tns.dayfour;

public class PrivateConstructorDemo {
	public static void main(String s[]) {
		// Can't create object with privateconstructor
		// MyClass m1=new MyClass();
		MyClass m=MyClass.getObject();
		m.setId(10);
		MyClass m1=MyClass.getObject();
		System.out.println(m);
		System.out.println(m1);
		}

}
