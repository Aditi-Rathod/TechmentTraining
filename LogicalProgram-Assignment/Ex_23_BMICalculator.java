package logic_assignment;

import java.util.Scanner;

public class Ex_23_BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float weight,height,bmi;
		
		//Input your weight and height
		System.out.println("Please enter your weight in kg: ");
        weight = sc.nextFloat();
        System.out.println("Please enter your height in cm: ");
        height = sc.nextFloat();
        
        // multiplication by 10000 for cm to m conversion
        bmi = (10000*weight)/(height*height);

        
        System.out.println("Your BMI is: "+bmi);
        if(bmi<18.5) 
        {
            System.out.println("You are underweight");
        }
        else if (bmi<25) 
        {
            System.out.println("You are normal");
        }
        else if (bmi<30) 
        {
            System.out.println("You are overweight");
        }
        else 
        {
            System.out.println("You are obese");
        }
	}

}
