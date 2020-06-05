/**
 * 
 */
package day1;

/**
 * @author Aditi
 *
 */
import java.lang.*;
import java.util.*;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array_of_subject[]=new int[6], pass_marks[]=new int[6], fail_marks[]=new int[6];
		int i, sum=0,max,min,count_pass_subject=0,count_fail_subject=0;
		
		//input subjects
		System.out.println("Enter the marks of each subject: ");
		for(i=0;i<6;i++)
		{ 
		
			array_of_subject[i] = sc.nextInt();
		}
		
		//Total marks
        for(i=0;i<6;i++)
        {
        	sum=array_of_subject[i]+sum;
        }
        System.out.println("Sum of marks of all the subjects: "+sum);
        
        //Maximum marks among all the subjects
        max=array_of_subject[0];
		
		for(i=1;i<6;i++)
		{
			if(array_of_subject[i]>max)
			{	
				max=array_of_subject[i];
			}
		}
		System.out.println("The Maximum marks among all the subjects is:"+max);
		
		//Minimum marks among all the subjects
		min=array_of_subject[0];
		
		for(i=1;i<6;i++)
		{
			if(array_of_subject[i]<min)
			{	
				min=array_of_subject[i];
			}
		}
		System.out.println("The Minimum marks among all the subjects is:"+min);   
		
		//Pass and Fail arrays
		for(i=0;i<6;i++)
		{
			if(array_of_subject[i]>=50)
			{ 
				count_pass_subject++;
				pass_marks[count_pass_subject]=array_of_subject[i];
				
			}
			else
			{
				count_fail_subject++;
				fail_marks[count_fail_subject]=array_of_subject[i];
				
			}
		}
		 
		//No.of subjects failed
		System.out.println("No.of subjects failed: "+count_fail_subject);
      
		//No.of subjects passed
		System.out.println("No.of subjects passed: "+count_pass_subject);
		 
		System.out.println("Pass Array\n");
		for(i=1;i<=count_pass_subject;i++)
		{
			System.out.print(pass_marks[i]+"  ");
		}
		
		System.out.println("\nFail Array \n");
		for(i=1;i<=count_fail_subject;i++)
		{
			System.out.print(fail_marks[i]+"  ");
		}
		
	}

}
