package logic_assignment;

import java.util.Scanner;

public class Ex6_Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2,result;
		char operator;
		
		//Input first number
		System.out.println("Enter First Number: ");
		num1=sc.nextInt();
		
		//Input the Operation to be done
		System.out.println("Enter operation to be done: ");
		operator=sc.next().charAt(0);
		
		//Input second number
		System.out.println("Enter Second Number: ");
		num2=sc.nextInt();
		
		//Processing different Operation
		switch(operator)
		{
		case '+': 
		{
			result=num1+num2;
			System.out.println("The sum of two numbers: "+result);
			break;
		}
		case '-': 
		{
			result=num1-num2;
			System.out.println("The difference of two numbers: "+result);
			break;
		}
		case '*': 
		{
			result=num1*num2;
			System.out.println("The multiplication of two numbers: "+result);
			break;
		}
		case '/': 
		{
			result=num1/num2;
			System.out.println("The division of two numbers: "+result);
			break;
		}
		case '%': 
		{
			result=num1%num2;
			System.out.println("The modulus of two numbers: "+result);
			break;
		}
		default: System.out.println("Invalid operator");
		}

	}

}
