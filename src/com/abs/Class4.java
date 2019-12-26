package com.abs;

public class Class4 implements Class3 {

	@Override
	public void method1() {
		System.out.println("Mani");
	}

	@Override
	public void method2() {
		System.out.println("Mani");
	}

	@Override
	public void method3() {
		System.out.println("Mani");
	}
public static void main(String[] args) {
	Class4 a = new Class4();
	a.method1();
	a.method2();
	a.method3();
}
}
