package day2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],i,search_element,mid,start,end;
		
		//Input the element to be searched
		System.out.println("Enter the elements to be searched: ");
		search_element=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<6;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Binary Search
		start=0;
		end=array.length-1;
		
		while(start<=end)
		{
			mid=start+(end-1)/2;
		
		//Check if search element is present at middle of the array
		
		if(array[mid]==search_element)
		{
			System.out.println("Element found at:"+(mid+1)+" position");
			break;
		}
		//Check if element is greater, then ignore left part of the array
		else if(array[mid]<search_element)
		{
			start=mid+1;
			continue;
		}
		//Else ignore right part of the array
		else if(array[mid]>search_element)
		{
			end=mid-1;
			continue;
		}
		//If the element is not present in the array
		else
		{
			System.out.println("Element is not present in the array");
			break;
		}
		
		}
		
	}
		

}
