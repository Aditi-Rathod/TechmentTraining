package logic_assignment;

import java.util.Scanner;

public class Ex_51_FancinatingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int number;
		
		//Input 3 digit number
        System.out.println("Please enter a 3 digit number: "); 
        number=sc.nextInt(); 
        
        //Check if number has 3 digit or not
        if (number<=100 || number>=999)
        { 
            System.out.println(number + " is not a valid 3 digit number.."); 
        } 
        else 
        { 
            if (isFascinatingNumber(number)) 
            { 
                System.out.println(number + " is a fascinating number.."); 
            } 
            else 
            { 
                System.out.println(number + " is not a fascinating number.."); 
            } 
        } 
    } 
    
    public static boolean isFascinatingNumber(int num) 
    {   int i,pos;
        String val= ""+num+(num*2)+(num*3); 
        
        //Check whether the number is fascinating
        for (i=1;i<=9;i++) 
        { 
            pos=val.indexOf(i+""); 
           
            if (pos<0) 
            { 
                return false; 
            } 
            else 
            {      
                if (val.substring(pos+1).indexOf(i +"") >= 0) 
                { 
                    return false; 
                } 
            } 
        } 
        System.out.println(val); 
        return true; 
	}
}
