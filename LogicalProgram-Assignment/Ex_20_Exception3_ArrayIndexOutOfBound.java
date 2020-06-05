package logic_assignment;

import java.util.Scanner;

public class Ex_20_Exception3_ArrayIndexOutOfBound {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index,size,i;
		
		//Input the size of array, elements in array
		try
		{
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter elements in the array ");
		for(i=0;i<size;i++)
	    {
	    arr[i]=sc.nextInt();
	    
	    }
		
		System.out.println("Enter the index from array whose value you want to display");
	    index=sc.nextInt();
	    
	    System.out.println("The array element at "+index+" is: "+arr[index]+"\n");
	    System.out.println("The array element successfully accessed");
	    
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);
		}


	}

}
