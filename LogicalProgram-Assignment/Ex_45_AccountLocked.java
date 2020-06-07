package logic_assignment;

import java.util.Scanner;

public class Ex_45_AccountLocked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 12345,x=0,input;

		System.out.println("Welcome to the bank of Manipal");
		System.out.println("Enter your pin:");
		input=sc.nextInt();
		x++;

		while(input!=pin && x<3)
		{
		System.out.println("\nIncorrect Pin!! try Again...");
		System.out.println("Again enter your pin:");
		input=sc.nextInt();
		x++;
		}

		if (input==pin)
		System.out.println("\nPin Accepted..You can access your account");
		else if (x>= 3)
		System.out.println("\nYou have run out off tries..Your account is locked!!");


	}

}
