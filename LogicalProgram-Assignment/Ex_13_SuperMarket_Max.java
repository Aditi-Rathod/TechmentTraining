package logic_assignment;

import java.util.Scanner;

public class Ex_13_SuperMarket_Max {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],i,element,max;
		
		//Input the element to be entered in array
		System.out.println("Enter the no of elements: ");
		element=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<element;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Logic to find maximum element in the array
		max=array[0];
		for(i=0;i<=element;i++)
		{
			    if(array[i]>max)
				max=array[i];
				
		}
		System.out.println(max+" is the maximum element in the array");

	}

}
