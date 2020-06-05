package logic_assignment;

import java.util.Scanner;

public class Ex8_ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//num to store the value of number excepted from user
		//temp is to store the value of num for performing operation
		//sum to store the sum of the values
		//rem to store the remainder value 
		int num,temp,sum=0,rem;
		
		//Input the number to be checked
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		//Process for checking whether the number is Armstrong or not 
		temp=num;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		
		if(num==sum)
		{
			System.out.println("The number is Armstrong");
		}
		else
		{
			System.out.println("The number is not Armstrong");
		}

	}

}
