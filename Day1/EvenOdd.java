/**
 * 
 */
package day1;

/**
 * @author Aditi
 *
 */
import java.lang.*;
import java.util.*;


public class EvenOdd {
		
	public static void main(String[] args) {	
		
		//Input the date for which permission should be granted
		int date;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a date value: ");
		date = sc.nextInt();
		
		//compare the values to be assigned for the particular day
		if(date>1 && date<31)
		{
			if(date%2==0)
			{
				System.out.println("Even numbered vehicle is permitted on the road");
			}
			else
			{
				System.out.println("Odd numbered vehicle is permitted on the road");
			}
		}
		else
			System.out.println("Invalid input");

	}

}
