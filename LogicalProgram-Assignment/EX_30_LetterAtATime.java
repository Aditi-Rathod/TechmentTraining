package logic_assignment;

import java.util.Scanner;

public class EX_30_LetterAtATime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg;
		char ch;
		int count,lpos,i;
		
		//Input the message from the user
		System.out.println("Enter your message:");
		msg = sc.nextLine();
        
		//Logic to display no of characters in the message
		System.out.println("Your message is " + msg.length() + " characters long");
		
		//To display the first character of the message
		System.out.println("The first character is at position 0 and is '" + msg.charAt(0) + "'");
		
		//To display the last character of the message
		lpos= msg.length()-1;
		System.out.println("The last character is at position " +lpos + " and is '" + msg.charAt(lpos) + "'");
		
		//To display all the characters of the message at a time
		System.out.println("Here are all the characters, one at a time:");

		for (i=0;i<msg.length();i++)
		{
		System.out.println(i + " - '" + msg.charAt(i) + "'");
		}

		//Count the no of appearance of letter "A/a" in the message
		count = 0;
		for (i=0;i<msg.length();i++)
		{
		ch=msg.charAt(i);
		if (ch=='A'|| ch=='a')
		{
	      count++;
		}
		}

		System.out.println("The letter 'a' appeared " + count + " times in the message");


	}

}
