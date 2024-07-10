package com.siiet.finallyblock;

public class Test {
public static void main(String[] args) {
	try {
		System.out.println("welcome");
	}
	
	catch(Exception e)
	{
		System.out.println("");
	}
	finally{
		System.out.println("hello");
	}
}

}
