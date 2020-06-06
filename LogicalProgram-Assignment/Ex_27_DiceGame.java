package logic_assignment;

import java.util.Random;

public class Ex_27_DiceGame {

	public static void main(String[] args) {
		Random r=new Random();
		int num1,num2;
		
		//Assign upto 6 Random values using object of Random Class because dice consist of 6 numbers
		
		System.out.println("Roll the dice");
		num1=r.nextInt(6);
		System.out.println("The number is:"+num1);
		
		System.out.println("Roll the dice again");
		num2=r.nextInt(6);
		System.out.println("The number is:"+num2);
		
		
		//Logic to check whether the numbers are even or not and performing the operation accordingly
		if((num1%2==0) && (num2%2==0))
		{
			System.out.println("Sum of the numbers is: "+(num1+num2));
		}
		else if(num1>num2)
		{
			System.out.println("Difference of numbers is: "+(num1-num2));
		}
		else
		{
			System.out.println("Difference of numbers is: "+(num2-num1));
		}
		
	}

}
