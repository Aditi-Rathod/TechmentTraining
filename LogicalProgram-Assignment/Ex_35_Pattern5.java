package logic_assignment;

import java.util.Scanner;

public class Ex_35_Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,j,k,count,r;
		//Input the number of lines you lines you want to display above and below in your pattern
	    System.out.println("Enter number of lines you want to display above and below in your pattern: ");
	    num=sc.nextInt();
	    count=0;
	    k=2;
	    while(k>0)
	    {
	        if(count==0)
	        {
	        	for(i=1;i<=num;i++)
	            {
	            	for(j=1;j<=i;j++)
	            	{
	            		System.out.print(j);
		            }
		            System.out.println(); 
	            }
	            count++;
	         } 
	        
	        else
	        {
	            for(i=1,r=num-1;i<=num-1;i++,r--)
	            {
	            	for(j=1;j<=r;j++)
		            {
		            	System.out.print(j);  
		            }
		            System.out.println();
	            }
	        }
	        k--;
	      }

	}

}
