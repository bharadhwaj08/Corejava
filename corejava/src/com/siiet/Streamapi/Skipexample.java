package com.siiet.Streamapi;

import java.util.stream.Stream;

public class Skipexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(1,2,3,4,5,6,7,8,9,10).
		filter(num->num%2==0)
		.skip(2)
		.limit(2)
		.forEach(num->System.out.println(num +" "));
		

	}

}
