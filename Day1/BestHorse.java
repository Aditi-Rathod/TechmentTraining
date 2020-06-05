/**
 * 
 */
package day1;

import java.lang.*;
import java.util.*;


public class BestHorse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//Declaring array which contains the value of number of horses
		int array_of_Horse[] = new int[3], i=0, max;
		
		//Taking input in the array
		for(i=1;i<=3;i++)
		{
			System.out.println("Weight of first horse "+i+":");
			array_of_Horse[i-1] = sc.nextInt();
		}
		
		//Initialize maximum element
		max=array_of_Horse[0];
		
		//Traversing the array to find the best Horse 
		for(i=1;i<3;i++)
		{
			if(array_of_Horse[i]>max)
			{	
				max=array_of_Horse[i];
			}
		}
		
		System.out.println("The Best horse is:"+max);
	}

}
