package logic_assignment;

import java.util.Random;

public class Ex_26_CompareTwoRandomNumbers {

	public static void main(String[] args) {
		Random r=new Random();
		int num1,num2;
		
		//Assign upto 10 Random values using object of Random Class
		num1=r.nextInt(10);
		num2=r.nextInt(10);
		
		System.out.println(num1+"\n"+num2);
		
		//Logic to compare two Random numbers
		if(num1==num2)
		{
			System.out.println("Numbers are same");
		}
		else
		{
			System.out.println("Numbers are different");
		}
	}

}
