package com.siiet.Staticexample;

public class Student {
	int rollno;
	static String name;
	static String college ="sri indu";// static 
	static void change() {
		college="IIT";
	}
Student (int r, String n){
	rollno=r;
	name=n;
	
}
void display()
{
	System.out.println(rollno + "\t" + name + "\t" + college);
}
}
