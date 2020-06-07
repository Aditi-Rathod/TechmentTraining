package logic_assignment;

import java.util.Scanner;

public class Ex_40_MirrorMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array1[][]=new int[10][10], array2[][]=new int[10][10],i,j,size,count;
		
		//Input the no.of elements 
		System.out.println("Enter the size of the matrix: ");
		size=sc.nextInt();
		
		//Input the array
		System.out.println("Enter the elements in the matrix: ");
		for(i=0;i<size;i++)
		{ for(j=0;j<size;j++)
			{
			array1[i][j]=sc.nextInt();
			}
		  System.out.println();
		}
		
		//Logic to make mirror image of the matrix
		for(i=0;i<size;i++)
		{
		count=0;
		for(j=size-1;j>=0;j--)
		{
		array2[i][count]=array1[i][j];
		count++;
		}
		}
		
		//Output the mirror image of the matrix
		System.out.println("Mirror image of the given matrix is:");
		for(i=0;i<size;i++)
		{ for(j=0;j<size;j++)
			{
			System.out.print(array2[i][j]+" ");;
			}
		 System.out.println();
		}
	}

}
