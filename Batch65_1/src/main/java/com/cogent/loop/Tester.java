package com.cogent.loop;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canteen canteen = new Canteen();
		// rule but 5 time you cant take any More
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.println("food has been taken " + i);
				canteen.needMorefood();
			}
		}

	}

}

