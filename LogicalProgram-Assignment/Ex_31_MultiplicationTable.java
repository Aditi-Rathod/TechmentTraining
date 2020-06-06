package logic_assignment;

import java.util.Scanner;

public class Ex_31_MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,i;
		
		//input the number whose table you want to display
		System.out.println("Enter a number for multiplication of the table: ");
		num=sc.nextInt();
		
		//Logic to display multiplication table of the number
		System.out.println("Table of the given number is:");
		for(i=0;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}

}
