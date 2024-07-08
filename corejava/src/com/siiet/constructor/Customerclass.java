package com.siiet.constructor;
import java.util.Scanner;
public class Customerclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name");
		String name = sc.nextLine();
		System.out.println("id");
		int id = sc.nextInt();
		System.out.println("address");

		String address = sc.nextLine();

		Customer c = new Customer();
		c.setCname(name);
		c.setCid(id);
		c.setCaddress(address);
		System.out.println(c);
		boolean out = c instanceof Customer;
		System.out.println("outim");
	}
		// TODO Auto-generated method stub

	}


