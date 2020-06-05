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


public class GlassHouse {
    
	public static void main(String[] args) {
		//2-digit input
		//Temporary int variable to store int value
		int two_digit_num,sum=0,temp;
		Scanner sc= new Scanner(System.in);
		
     System.out.println("Enter a 2-digit number");
     two_digit_num=sc.nextInt();
     
     while(two_digit_num>0)
     {
    	  temp=two_digit_num%10;
    	  sum=sum+temp;
    	  two_digit_num=two_digit_num/10;
     }
     
     System.out.println("Prince must go in path  "+sum+" to go out of glass house");
     
    
	}

}
