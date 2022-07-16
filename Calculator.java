package com.java.basic;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Addition :"+add(10,20));
		System.out.println("Substraction :"+ sub(10,20));
		System.out.println("Multiplication :"+mul(10,20));

	}
	
	public static int add(int a, int b) {
		return a+b;
	}

	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
}
