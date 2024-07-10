package com.siiet.interfaces;

public class Demo implements Child {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("print");
		
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.show();
	}
}
