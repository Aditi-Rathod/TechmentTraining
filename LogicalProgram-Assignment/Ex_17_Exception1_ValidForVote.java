package logic_assignment;

import java.util.*;

class InvalidAgeException extends Exception
{

}
public class Ex_17_Exception1_ValidForVote {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		try
		{
		int age=sc.nextInt();
		if(age>=18)
		System.out.println("Age is valid to give vote");
		else
		throw new InvalidAgeException();
		}
		catch(InvalidAgeException e)
		{
		System.out.println("Exception Occurred :"+e+": Age not valid to give vote");
		}

	}

}
