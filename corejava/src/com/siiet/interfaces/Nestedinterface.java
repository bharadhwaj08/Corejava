package com.siiet.interfaces;

public class Nestedinterface implements Myinterface.Myinnerinterface {

	public void print() {
		// TODO Auto-generated method stub
	System.out.println("innner interfaces");	
	}
 public static void main(String[] args) {
	 Nestedinterface n=new Nestedinterface();
	n.print();
	System.out.println("id:\t"+ com.siiet.interfaces.Myinterface.Myinnerinterface.id);
}
}