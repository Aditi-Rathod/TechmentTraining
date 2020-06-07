package logic_assignment;

import java.util.Scanner;

public class Ex_44_HeronsFormula {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double s,herons;
		
		//Input the sides of the triangle
		System.out.println("Enter the first side of the Triangle:");
		a=sc.nextInt();
		System.out.println("Enter the second side of the Triangle:");
		b=sc.nextInt();
		System.out.println("Enter the thrid side of the Triangle:");
		c=sc.nextInt();

		//Logic for heron's formula
		s = (a+b+c) / 2;
		herons = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("Area of Tringle is: "+herons);

	}

}
