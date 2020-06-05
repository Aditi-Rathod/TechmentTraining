package logic_assignment;

import java.util.Scanner;

public class Ex4_LeapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int year;
		//Input the year
		System.out.println("Enter the Year: ");
		year=sc.nextInt();
		
		//Check various condition for Leap year
		if(year%400==0)
		{
			System.out.println(year+" is a Leap Year");
		}
		else if(year%100==0)
		{
			System.out.println(year+" is not a Leap Year");
		}
		else if(year%4==0)
		{
			System.out.println(year+" is a Leap Year");
		}
		else
		{
			System.out.println(year+" is not a Leap Year");
		}
	}

}
