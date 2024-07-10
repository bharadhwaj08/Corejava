package com.siiet.exceptions;

public class Nestedtrycatch {
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("string length"+str.length());
		String anotherstring=null;
		int a=0;
		try {
			try {
				System.out.println("str.charAt(a)");
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("index out of bound");
			}
		System.out.println("string length"+anotherstring);
		}
		catch("NullPointerException npe") {
			
		}
		
	}

}
