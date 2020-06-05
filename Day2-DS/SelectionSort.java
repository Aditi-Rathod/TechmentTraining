package day2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	int array[]=new int[10],i,j,small,temp,position,elements;
	
	//Input the no.of elements 
	System.out.println("Enter the no.of elements to be added in the array: ");
	elements=sc.nextInt();
	
	//Input the array
	System.out.println("Enter the elements in the array: ");
	for(i=0;i<elements;i++)
	{
		array[i]=sc.nextInt();
	}
	
    //Selection Sort
	for(i=0;i<(elements-1);i++)
	{
		small=array[i];position=i;
		for(j=i+1;j<elements;j++)
		{
			if(small>array[j])
			{
				small=array[j];
				position=j;
			}
		}
		   temp=array[position];
		   array[position]=array[i];
		   array[i]=temp;
	}
	
	for(i=0;i<elements;i++)
	{
		System.out.print(array[i]+"  ");
	}
	
	}

}
