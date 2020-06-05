package day2;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],i,j,temp,elements,no_of_rotation;
		
		//Input the no.of elements 
		System.out.println("Enter the no.of elements to be added in the array: ");
		elements=sc.nextInt();
		
		//Input how many the rotation will take place
		System.out.println("Enter the no.of rotations to done in the array: ");
		no_of_rotation=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<elements;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Array Rotation
		for(i=0;i<no_of_rotation;i++)
		{
			temp = array[0];
			for(j=0;j<elements-1;j++)
			{
				array[j]=array[j+1];
				
			}
			array[j]=temp;
			
		}
		
		//Display the Rotated array
		System.out.println("The Rotated Array is: ");
		for(i=0;i<elements;i++)
		{
			System.out.print(array[i]+"  ");
		}
	}

}
