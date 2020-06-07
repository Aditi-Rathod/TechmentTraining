package logic_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_43_SortWordsOfSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Input in the sentence from user
	    System.out.println("Enter a sentence:");
	    String str=sc.nextLine();
	    
	    //Split the sentence after each space
	    String words[]=str.split(" ");
	    
	    //Sort the words using sort method
	    Arrays.sort(words);
	    
	    //To display the sorted words
	    System.out.println("\nThe sorted words of given sentence are:");
	    for(int i=0;i<words.length;i++)
	    {
	    System.out.println(words[i]);
	    }
	}

}
