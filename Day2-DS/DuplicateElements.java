package day2;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],i,new_index,elements,count_duplicates=0;
		
		//Input the no.of elements 
		System.out.println("Enter the no.of elements to be added in the array: ");
		elements=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<elements;i++)
		{
			array[i]=sc.nextInt();
		}
       
		//Remove and count the Duplicate elements int the array
		
		
		//To store the position of the next unique elements
		new_index=0;
		for(i=0;i<(elements-1);i++)
		{
			if(array[i]!=array[i+1])
			{
				array[new_index++]=array[i];
			}
			else
			{
				count_duplicates++;
			}
			
		}
		array[new_index++]=array[elements-1];
		
		//Display the Array with unique elements
		System.out.println("Array with Unique elements is: ");
		for(i=0;i<new_index;i++)
		{
			System.out.print(array[i]+"  ");
		}
		
		//Display the no.of duplicates which were present
		System.out.println("\nNo.of duplicates which were present in the array: "+count_duplicates);
	}

}
