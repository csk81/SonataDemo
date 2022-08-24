package com.sonata.two;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		System.out.println(c1.add(10, 10));
		System.out.println(c1.div(2, 4));
	}

}
