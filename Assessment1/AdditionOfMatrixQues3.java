package assessment1;

import java.util.Scanner;

public class AdditionOfMatrixQues3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array1[][]=new int[10][10], array2[][]=new int[10][10], array3[][]=new int[10][10],i,j,size;
		
		//Input the no.of elements 
		System.out.println("Enter the size of the matrix: ");
		size=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the matrix1: ");
		for(i=0;i<size;i++)
		{ for(j=0;j<size;j++)
			{
			array1[i][j]=sc.nextInt();
			}
		  System.out.println();
		}
		
		System.out.println("Enter the elements in the matrix2: ");
		for(i=0;i<size;i++)
		{ for(j=0;j<size;j++)
			{
			array2[i][j]=sc.nextInt();
			}
		 System.out.println();
		}
		
		//Addition of Matrix
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				array3[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		//Display the Resultant Matrix
		System.out.println("The resultant matrix is: ");
		for(i=0;i<size;i++)
		{ for(j=0;j<size;j++)
			{
			System.out.print(array3[i][j]+" ");;
			}
		 System.out.println();
		}
	}
}
