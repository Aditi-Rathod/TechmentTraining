package logic_assignment;

import java.util.Scanner;

public class Ex_36_Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,l,num;
		
		//Enter the number for the pattern
		System.out.println("Enter number for the pattern:");
		num=sc.nextInt();
		
		for(i=1,k=num;i<=num;i++,k--)
		{
			for(j=1;j<=k;j++)
			{
				System.out.print(j);
			}
		
		 if(k!=num)
		 {
			 System.out.print(" ");
		 }
		 for(l=k;l>=1;l--)
		 {
			 System.out.print(l);
		 }
		 System.out.println();
	   }

	}

}
