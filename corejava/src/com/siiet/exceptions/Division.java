package com.siiet.exceptions;

import java.util.InputMismatchException;

public class Division {

	public static void divide() {
		// TODO Auto-generated method stub
int a=6,b=0,c;
try 
{
	c=a/b;
	System.out.println("division"+c);
}
catch(InputMismatchException e) 
{
	System.out.println("execption caught" +e.getMessage());
}
catch(ArithmeticException e) 
{
System.out.println("exeception caught"+e.getMessage());	
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("exception caught"+e.getMessage());
}
	}

}
