package day3;

public class Alphabetpattern {

	public static void main(String[] args) {
		 int i,j,alpha=65;
		 for(i=3;i>=0;i--)
		 {
			 for(j=0;j<=i;j++)
			 {
				 System.out.print((char)(alpha+j)+" ");
				 
			 }
			 alpha++;
			 System.out.println();
		 }
		 

	}

}
