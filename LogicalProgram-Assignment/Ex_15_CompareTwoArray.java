package logic_assignment;

import java.util.Scanner;

public class Ex_15_CompareTwoArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array1[]=new int[10],array2[]=new int[10],i,element;
		
		//Input the elements to be entered in array
		System.out.println("Enter the no of elements: ");
		element=sc.nextInt();
		
		//Input elements in first array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<element;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		//Input elements in second array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<element;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		//Logic to check whether both array are same or different
		int count=1;
		for(i=0;i<element;i++)
		{
			if(array1[i]!=array2[i])
			{
				System.out.println("Both the arrays are Different");
				break;
			}
			else
			{
				count++;
			}
			
		}
		
		if(count==element)
		{
			System.out.println("Both the arrays are Same");
		}
		
	}

}
