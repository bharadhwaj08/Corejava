package com.siiet.Staticexample;

public class Employee {
	int eid;
	String name;
	static String company = "TNS";

	Employee(int r, String n) {
		eid = r;
		name = n;
	}

	void dispalyy() {
		System.out.println(eid +"\t"+ name +"\t" + company);

	}

	

}
