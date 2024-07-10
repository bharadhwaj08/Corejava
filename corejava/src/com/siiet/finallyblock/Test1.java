package com.siiet.finallyblock;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(100 / 0);

		} catch (ArithmeticException e) {
			System.out.println("exception caught" + e.getMessage());
		} finally {
			System.out.println("finally");
		}
	}

}

