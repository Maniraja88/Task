package com.ove;

public class Overload {
	
	public void method1()
	{
		System.out.println("Manikandan");
	}

	public void method1(int a)
	{
		System.out.println("Alangudi");
	}
	public void method1(String b)
	{
		System.out.println("Chettividuthy");
	}
	public void method1(int c, int d)
	{
		System.out.println("Raja");
	}
	public static void main(String[] args) {
		
		Overload o = new Overload();
		o.method1();
		o.method1(1);
		o.method1("chuma");
		o.method1(2, 3);
	}
	
}
