package com.siiet.lambdaexpression;

public class Parameterdemo {
public static void main(String[] args) {
	Cube c=(a)->{return a*a*a;};
	System.out.println("enter a number"+c.calcluate(3));
	
}
}
