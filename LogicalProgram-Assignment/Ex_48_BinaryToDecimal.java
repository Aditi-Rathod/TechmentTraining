package logic_assignment;

import java.util.Scanner;

public class Ex_48_BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dec=0,bin,temp,pow=0;
		
		//Input the number in binary form
        System.out.println("Enter the Binary number:");
        bin=sc.nextInt();
        
      //Logic to convert binary into decimal
        while(true)
        {
            if(bin==0)
            {
                break;
            } 
            else 
            {
                temp = bin%10;
                dec += temp*Math.pow(2, pow);
                bin = bin/10;
                pow++;
            }
        }
        System.out.println("Decimal equivalent of given binarty number is:\n"+dec);
      
	}

}
