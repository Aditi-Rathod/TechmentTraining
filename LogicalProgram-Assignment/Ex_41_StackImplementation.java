package logic_assignment;

import java.util.Scanner;

public class Ex_41_StackImplementation {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      int cap=5,top=-1,item,i;
      int array[] = new int[cap];      
	  
      //To push/add the elements in the stack
      System.out.println("Add 5 elements into stack:");
      for(i=0;i<5;i++)
      {
    	  item=sc.nextInt();
          if (top<(cap-1)) 
          {   
        	   top++;   
        	   array[top]=item;      	   
          } 
          else 
          {   
        	 System.out.println("Stack Overflow...");   
          }  
      }
      
      //To display the elements present in the stack
      if (top >= 0)
      {   
    	   System.out.println("Elements in stack is:");   
    	   for (i = 0; i <= top; i++) 
    	   {   
    	    System.out.println(array[i]);   
    	   }   
      }   
 
      //To pop the elements from the stack
      for(i=0;i<5;i++)
      {
    	  if (top >= 0) 
    	  {
    		  System.out.println("Item popped is:"+array[top]);  
    		  top--;      		      
    	  } 
    	  else 
    	  {   
    		  System.out.println("Stack Underflow...");   
    	  }   
      }
  
	}

}
