package day2;

import java.lang.*;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],i,searched_element;
		
		//Input the element to be searched
		System.out.println("Enter the elements to be searched: ");
		searched_element=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<6;i++)
		{
			array[i]=sc.nextInt();
		}
		
		// Searching for the element in the array
		for(i=0;i<6;i++)
		{
			if(array[i]==searched_element)
			{
				System.out.println("Found the element at:"+(i+1)+" position");
				break;
			}
		}
		

	}

}
