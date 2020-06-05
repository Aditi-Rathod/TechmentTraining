package assessment1;

import java.util.Scanner;

public class PairOfSumQues4_ii {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],sum,i,j,elements;
		
		//Input the no.of elements 
		System.out.println("Enter the no.of elements to be added in the array: ");
		elements=sc.nextInt();
				
	    //Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<elements;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Input the value for Sum
		System.out.println("Enter the value of sum: ");
		sum=sc.nextInt();
		
		//Process of Pairing the sum elements
		for(i=0;i<elements;i++)
		{
			for(j=0;j<elements;j++)
			{
				if((array[i]+array[j])==sum)
				{
					System.out.println("( "+array[i]+","+array[j]+" )");
				}
			}
		}
		
	}

}
