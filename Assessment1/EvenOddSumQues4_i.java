package assessment1;

import java.util.Scanner;

public class EvenOddSumQues4_i {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10],even=0,odd=0,i,elements;
		
		//Input the no.of elements 
		System.out.println("Enter the no.of elements to be added in the array: ");
		elements=sc.nextInt();
				
	    //Input the array
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<elements;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Process foe Even Odd addition
		for(i=0;i<elements;i++)
		{
			if(array[i]%2==0)
			{
				even=even+array[i];
			}
			else
			{
				odd=odd+array[i];
			}
		}
		
		System.out.println("Addition of Even elements is: "+even);
		System.out.println("Addition of Odd elements is: "+odd);

	}

}
