package com.siiet.finallyblock;

public class Test2 {
	public static void main(String[] args) {
		try {
			int data=25/0;
			System.out.println("welcome");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
	System.out.println("finally block executed");
		}
	}
}
