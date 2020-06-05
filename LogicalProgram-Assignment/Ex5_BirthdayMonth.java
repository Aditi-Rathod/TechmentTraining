package logic_assignment;

import java.util.Scanner;

public class Ex5_BirthdayMonth {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int month;
		
		//Input your Birthday Month in number
		System.out.println("Enter your Birth Month: ");
		month=sc.nextInt();
		
		//To convert Number into its corresponding Month 
		switch(month)
		{
		case 1: System.out.println("Your Birthday is in January");
		        break;
		case 2: System.out.println("Your Birthday is in February");
                break;
		case 3: System.out.println("Your Birthday is in March");
		        break;
		case 4: System.out.println("Your Birthday is in April");
                break;
		case 5: System.out.println("Your Birthday is in May");
                break;
		case 6: System.out.println("Your Birthday is in June");
                break;
		case 7: System.out.println("Your Birthday is in July");
                break;
		case 8: System.out.println("Your Birthday is in August");
                break;
		case 9: System.out.println("Your Birthday is in September");
                break;
		case 10: System.out.println("Your Birthday is in October");
                break;
		case 11: System.out.println("Your Birthday is in November");
                break;
		case 12: System.out.println("Your Birthday is in December");
                 break;
		default: System.out.println("Invalid Birthday Month");
		}
	}

}
