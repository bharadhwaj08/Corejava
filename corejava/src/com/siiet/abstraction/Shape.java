package com.siiet.abstraction;

public abstract class Shape {
	protected float area;
	// abstract method
	abstract void calarea();
// concrete method
	void show()
	{
	System.out.println("area of shape" +area);	
	}
}


