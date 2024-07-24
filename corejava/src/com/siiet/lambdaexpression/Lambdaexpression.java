package com.siiet.lambdaexpression;

import java.util.ArrayList;

public class Lambdaexpression {
public static void main(String[] args) {
	ArrayList<Integer>li=new ArrayList<>();
	li.add(1);
	li.add(4);
	li.add(6);
	li.add(9);
	li.add(8);
	li.forEach(ele->System.out.print(ele));
}
}
