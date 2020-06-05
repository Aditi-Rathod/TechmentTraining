package assessment1;

public class PatternQues2 {

	public static void main(String[] args) {
	
         int i,j,n=5;
	    
	    for ( i = 0; i<n; i++) 
	    {
	    	for (j = 0; j<=n-1; j++) 
	    	{
	    		if (i==0 || i==n-1)
	    		{
	    			System.out.print("*");
	    		}
	    	    else if(j>0 && j<n-1)
	    	    {
	    	    	System.out.print(" ");
	    	    }
	    			   
	    	    else
	    	    	 System.out.print("*");
	    	}
	    System.out.println();
	    }

	}

}
