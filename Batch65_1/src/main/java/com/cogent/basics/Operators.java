package com.cogent.basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8 operators from of different type
		eight();
		

	}
	static void eight() {
		int a = 0 ;
		a++;
		a=a+1;
		int b = 3;
		int y = a>b?a:b;
		b = b<<1;
		int z = a&b;
		if (a>0&&b>0) {
			System.out.println("a>0&&b>0");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(y);
		System.out.println(z);
	}
	

}
