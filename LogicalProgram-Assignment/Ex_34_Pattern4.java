package logic_assignment;

import java.util.Scanner;

public class Ex_34_Pattern4 {

	public static void main(String[] args) {
		
		//Input the number of lines you want to display in your pattern
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines you want to display in your pattern:");
	    int num=sc.nextInt();
	    
	    //Logic to display the pattern
	    System.out.println("The Pattern is:");
	    for(int i=1;i<=num;i++)
	    {
	    	for(int j=num;j>=i;j--)
	    	{
	            System.out.print(j);  
	    	}
            System.out.println();
	    }
	            
	}

}
