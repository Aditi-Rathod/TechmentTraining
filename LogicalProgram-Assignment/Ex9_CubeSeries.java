package logic_assignment;

import java.util.Scanner;

public class Ex9_CubeSeries {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int cube;
			
			//Input the no.of terms to be present in the series 
			System.out.println("Enter no of terms:");
			int num=sc.nextInt();
			cube=1;
			
			//Cube series
			for(int i=1;i<=num;i++)
			{
			cube=i*i*i;
			System.out.print(cube+" ");

			}
	}
}


