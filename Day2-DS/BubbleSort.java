package day2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],i,j,temp,elements;
		
		//Input the no.of elements 
		System.out.println("Enter the no.of elements to be added in the array: ");
		elements=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<elements;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Bubble Sort
		for(i=1;i<elements;i++)
		{
			for(j=0;j<(elements-i);j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		for(i=0;i<elements;i++)
		{
			System.out.print(array[i]+"  ");
		}
	}

}
