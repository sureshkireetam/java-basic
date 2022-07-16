package com.java.basic;

public class BasicJava {

	String name = "India"; // instance Variable
	int number = 10; // instance Variable
	static String collegeName = "CV raman college"; // static variable

	public static void main(String[] args) {

		int var = 200; // Local Variable

		BasicJava obj = new BasicJava();

		System.out.println(var);
		System.out.println(obj.name);
		System.out.println(obj.number);
		System.out.println(collegeName);

		System.out.println("==============");

		obj.getDetails();

	}

	public void getDetails() {

		System.out.println(name);
		System.out.println(number);
		System.out.println(collegeName);
	}

}
