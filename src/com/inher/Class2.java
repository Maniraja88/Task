package com.inher;

public class Class2 extends Class1 {
	
	public void method3()
	{
		System.out.println("789");
	}

	public static void main(String[] args) {
		Class2 c = new Class2();
		c.method1();
		c.method2();
		c.method3();
		
	}
}
