package logic_assignment;

import java.util.Scanner;

public class Ex_12_Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int rows;
		
        //Input the no.of rows in the pattern
        System.out.println("Enter no of rows you want in the pattern:");
		rows = sc.nextInt();

		System.out.println("The Pattern is:");

		for (int i=rows; i>=1; i--)
		{
			   for (int j=1; j<=i*2; j++)
			   {
				   System.out.print(" ");
			   }
		
		

		       for (int j=i; j<=rows; j++) 
		       {
		    	   System.out.print(j+" ");
		       }

		
		       for (int j=rows-1; j>=i; j--)
		       {
		    	   System.out.print(j+" "); 
		       }
		       System.out.println();

		      
		}

	}

}
