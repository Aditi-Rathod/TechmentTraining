package logic_assignment;

import java.util.Scanner;

public class Ex_19_Pattern3_ReversePyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int rows,rcount;
		
        //Input the no.of rows in the pattern
        System.out.println("Enter no of rows you want in the pattern:");
		rows = sc.nextInt();

		rcount=rows;
		
		System.out.println("The Pattern is:");
		
		for (int i=1;i<=rows; i++)
		{
			   for (int j=1; j<=i*2; j++)
			   {
				   System.out.print(" ");
			   }
		
		

		       for (int j=1; j<=rcount; j++) 
		       {
		    	   System.out.print(j+" ");
		       }

		
		       for (int j=rcount-1; j>=1; j--)
		       {
		    	   System.out.print(j+" "); 
		       }
		       System.out.println();
		       rcount--;
		      
		}

	}

}
