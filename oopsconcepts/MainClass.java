package com.digiair.training.oopsconcepts;

public class MainClass {
	static Samsung sam = new Samsung();
	static Iphone i = new Iphone();
	public static void main(String[] args) {
		Samsung.display();
		sam.wiFi();
		Iphone.display2();
		System.out.println(i.message());

	}

}
