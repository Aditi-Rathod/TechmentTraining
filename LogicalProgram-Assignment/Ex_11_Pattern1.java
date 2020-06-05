package logic_assignment;

import java.util.Scanner;

public class Ex_11_Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		 
		System.out.println("Given Pattern is:");
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		    
			System.out.println();
		}
		
	}

}
