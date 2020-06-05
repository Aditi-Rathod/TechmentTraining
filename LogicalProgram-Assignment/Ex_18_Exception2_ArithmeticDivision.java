package logic_assignment;

import java.util.Scanner;

public class Ex_18_Exception2_ArithmeticDivision {

	public static void main(String[] args) {
		     
		    Scanner sc=new Scanner(System.in);
		    int num1,num2;
		    
		    //Input two number from user
			System.out.println("Enter two numbers: ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			try
			{
            if(num2==0)
			throw new ArithmeticException();
			else
			System.out.println("The result of division is: "+(num1/num2));
			}
			
			catch(ArithmeticException e)
			{
			System.out.println("Divide by zero exception caught");
			}
			
	}

}
