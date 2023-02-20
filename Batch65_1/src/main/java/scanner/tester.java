package scanner;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter No1");
			n1= sc.nextFloat();
			System.out.println("Please enter No2");
			n2= sc.nextFloat();
			System.out.println("Please enter No3");
			n3= sc.nextFloat();
		}
		if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
	}

}
