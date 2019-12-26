package com.ove;

public class Override extends Overload {
	
	//@Override
	
	public void method1() {
		System.out.println("Mani");
	}
	
	//@Override
	
	public void method1(int a) {
		System.out.println("Kandan");
	}
	
	
	//@Override
	
	public void method1(int c, int d) {
		System.out.println("Raja");
	}
	
	//@Override
	
	public void method1(String b) {
		System.out.println("Lakshmi");
	}
	
	public static void main(String[] args) {
		Override q = new Override();
		q.method1();
		q.method1(1);
		q.method1(1, 2);
		q.method1("mani");
	}

}
