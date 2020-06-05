package logic_assignment;

import java.util.Scanner;

public class Ex7_NumbersInBetween {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2,result,i;
		
		//Input first number
		System.out.println("Enter First Number: ");
		num1=sc.nextInt();
		
		//Input second number
		System.out.println("Enter Second Number: ");
		num2=sc.nextInt();
		
		//Person who all are going for battle
		System.out.println("People who are going for battle");
		for(i=num1;i<=num2;i++)
		{
			System.out.println(i);
		}

	}

}
