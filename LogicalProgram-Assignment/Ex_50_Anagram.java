package logic_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_50_Anagram {
	    static Scanner sc = new Scanner(System.in);
		static boolean areAnagram (char[] str1, char[] str2)
		{
		  int len1,len2,i;
		  //Calculate the length of the strings
		  len1 = str1.length;
		  len2 = str2.length;
		  
		  //If length is not same then the strings cannot be anagram
		  if(len1!=len2)
		  {
			  return false;
		  }
		  
		  //If length is same the sort the string
		  Arrays.sort(str1);
		  Arrays.sort(str2);
		  
		  //check whether the strings are anagram
		  for(i=0;i<len1;i++)
		  {
			  if(str1[i]!=str2[i])
			  {
				  return false;
			  }
		  }
		  return true;
		}
		
		public static void main(String[] args) {
			 char str1[]=new char[10],str2[]=new char[10];
			 int i;
			 //Input first string
			 System.out.println("Enter first string:");
		     str1=sc.next().toCharArray();
		     
		     //Input second string
			 System.out.println("Enter second string:");
			 str2=sc.next().toCharArray();	
			 
			 //check whether two strings are anagram
			 if(areAnagram(str1,str2))
			 {
				 System.out.println("The two strings are anagram of each other");
			 }
			 else
			 {
				 System.out.println("The two strings are not anagram of each other");
			 }
	   }
	}

