package com.java.basic;

public class CalculatorExample {

	public static void main(String[] args) {

		sum(100, 200);
		sub(300, 200);
		mul(100, 200);
		div(600, 200);

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void mul(int a, int b) {
		System.out.println(a * b);
	}

	public static void div(int a, int b) {
		System.out.println(a / b);
	}

}
