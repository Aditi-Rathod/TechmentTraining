package logic_assignment;

import java.util.Scanner;

public class Ex_14_SuperMarket_Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],i,element,sum;
		
		//Input the element to be entered in array
		System.out.println("Enter the no of elements: ");
		element=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<element;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Logic to find sum of all element in the array
		sum=0;
		for(i=0;i<=element;i++)
		{
			   sum=sum+array[i];
				
		}
		System.out.println("The sum of all the elements in the array is: "+sum);

	}

}
