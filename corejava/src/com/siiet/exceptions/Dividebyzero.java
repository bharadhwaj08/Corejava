package com.siiet.exceptions;

public class Dividebyzero {
public static void main(String[] args) {
	try {
		int data=50/0;
		System.out.println("data is"+ data);
	}catch(ArithmeticException r) {
		System.out.println("rest of the code");
	}
	
}
}
