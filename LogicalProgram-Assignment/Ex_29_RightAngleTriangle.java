package logic_assignment;

import java.util.Scanner;

public class Ex_29_RightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		//Input the sides of the triangle
		System.out.println("Enter the first side of the Triangle");
		a=sc.nextInt();
		System.out.println("Enter the second side of the Triangle");
		b=sc.nextInt();
		System.out.println("Enter the thrid side of the Triangle");
		c=sc.nextInt();
		
		//Logic to check Right angle by using Pythagoras' theorem
		
		//If side A is greater than side B and C
		if(a>b && a>c)
		{
			if((a*a)==((b*b)+(c*c)))
			{
				System.out.println("It is a right angle triangle");
			}
			else
			{
				System.out.println("It is not a right angle triangle");
			}
		}
		
		//If side B is greater than side A and C
		else if(b>a && b>c)
		{
			if((b*b)==((a*a)+(c*c)))
			{
				System.out.println("It is a right angle triangle");
			}
			else
			{
				System.out.println("It is not a right angle triangle");
			}
		}
		
		//If side C is greater than side A and B
		else if(c>a && c>b)
		{
			if((c*c)==((b*b)+(a*a)))
			{
				System.out.println("It is a right angle triangle");
			}
			else
			{
				System.out.println("It is not a right angle triangle");
			}
		}
	}

}
