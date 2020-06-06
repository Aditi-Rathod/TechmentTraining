package logic_assignment;

import java.util.Scanner;

public class Ex_28_ValidPin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int entered_pin,pin;
		
		//Assigning some vale to pin
		pin=12345;
		
		System.out.println("Welcome to the bank of Mitchell");
		System.out.println("Enter the pin:");
		entered_pin=sc.nextInt();
		
		while(entered_pin!=pin)
		{
			System.out.println("Invalid pin, try again:");
			entered_pin=sc.nextInt();
		}
		
		System.out.println("Pin accepted. You can access your account");
	}

}
