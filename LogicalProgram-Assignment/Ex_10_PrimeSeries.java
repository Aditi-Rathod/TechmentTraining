package logic_assignment;

import java.util.Scanner;

public class Ex_10_PrimeSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,count,limit;
		
		//Input the number till where the series will be displayed 
		System.out.println("Enter number till where you want to see the prime series:");
		limit=sc.nextInt();
		
		for(i=1;i<=limit;i++)
		{
			count=0;
			for(j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;

				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
			
		

	}

}
