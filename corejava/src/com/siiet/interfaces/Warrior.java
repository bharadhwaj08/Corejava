package com.siiet.interfaces;

public class Warrior  implements Character,Weapon{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("attack");
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.use();
		
		w.attack();
	}

}
