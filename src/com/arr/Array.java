package com.arr;

public class Array {
	
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,8,9,1};
		int j=0;
	    int k=0;
		for(int i=0;i<a.length;i++)
		{
			j=j+a[i];
			k=j/a.length;
		}
		System.out.println(j);
		System.out.println(k);
		
	}

}
