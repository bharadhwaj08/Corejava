package com.siiet.practice;
import java.util.Scanner;
public class EvenOrOdd {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int num = scanner.nextInt();

	    if (num % 2 == 0) {
	      System.out.println(num + " is even.");
	    } else {
	      System.out.println(num + " is odd.");
	    }
	  }
	}
