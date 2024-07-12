package com.siiet.practice;

import java.util.Scanner;

public class Checkzero {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int num = scanner.nextInt();

	    if (num == 0) {
	      System.out.println("The number is zero.");
	    } else {
	      System.out.println("The number is not zero.");
	    }
	  }


}
