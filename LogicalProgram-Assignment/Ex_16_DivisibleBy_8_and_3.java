package logic_assignment;

import java.util.Scanner;

public class Ex_16_DivisibleBy_8_and_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		
		//Input the number which you want to be checked
		System.out.println("Enter the number: ");
		num=sc.nextInt();
       
		//Logic to check whether the number is divisible by both 8 and 3
		if((num%8==0) && (num%3==0))
		{
			System.out.println("Number is divisible by both 8 and 3");
		}
		else
		{
			System.out.println("Number is not divisible by both 8 and 3");
		}
	}

}
