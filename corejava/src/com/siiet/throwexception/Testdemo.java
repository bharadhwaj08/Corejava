package com.siiet.throwexception;
import java.util.Scanner;

public class Testdemo {
	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		int rollno=sc.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("should not be less than zero");
		}
		else {
			System.out.println("valid");
		}
		
		
	}

}
