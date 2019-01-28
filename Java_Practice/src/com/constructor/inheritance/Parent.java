package com.constructor.inheritance;

//https://beginnersbook.com/2013/03/inheritance-in-java/

// here checking the constrcutore with callin default parameter concept

public class Parent {

	public Parent(int a) {
		System.out.println("Parent Class Constructor : " + a);
	}

	public Parent() {
		System.out.println("Parent Class DEFAULT Constructor : ");
	}

	private Parent(int a, int b) {
		System.out.println("Parent Class Constructor : " + a + "          " + b);
	}

	private Parent(String a) {
		System.out.println("Parent Class DEFAULT Constructor String : " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// the below only call the private controctor becuase they are in the same class. However it won't 
		// call the private constructor in some other class.
		new Parent(100, 20);

		new Parent("500");
	}
}
