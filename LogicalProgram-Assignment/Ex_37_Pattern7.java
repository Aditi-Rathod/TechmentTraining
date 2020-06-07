package logic_assignment;

import java.util.Scanner;

public class Ex_37_Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,j,k,l;
		
		//Input the number for the pattern 
	    System.out.println("Enter number for the pattern:");
	    num = sc.nextInt();
	    //logic to display the upper triangle
        for(i=1;i<=num;i++)
        {
        	for(j=1; j<num-(i-1);j++)
            {
            	System.out.print(" ");  
            }
        	
            for(k=i;k>=1;k--)
            {
            	System.out.print(k);
            }
            for(l=2;l<=i;l++)
            {
            	System.out.print(l);    
            }
            System.out.println();
        }
	    
        //logic to display the upper triangle
	            for(i=1;i<=num-1;i++)
	            {
	            	for(j=i;j>=1;j--)
	                {
	                	System.out.print(" ");
	                }
	                for(k=num-i;k>=1;k--)
	                {
	                	System.out.print(k); 
	                }
	                for(l=2;l<=num-i;l++)
	                {
	                	 System.out.print(l);    
	                }
	                System.out.println();    
	            }

	}

}
