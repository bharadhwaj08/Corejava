package com.siiet.inheritance;

public class Student extends Citizen {
	private int rollno;
	private String colgname;

	public Student(String name, long adharno, String address, long phno, int rollno, String colgname) {
		super(name,adharno,address,phno);
		this.rollno = rollno;
		this.colgname = colgname;
	}

	

	public Student(String name, long adharno, String address, long phno) {
		super(name, adharno, address, phno);
		// TODO Auto-generated constructor stub
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getColgname() {
		return colgname;
	}

	public void setColgname(String colgname) {
		this.colgname = colgname;
	}

	public String toString() {
		return super.toString()+"Student [rollno=" + rollno + ", colgname=" + colgname + "]";
	}

}

