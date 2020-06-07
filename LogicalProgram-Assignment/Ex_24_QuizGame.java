package logic_assignment;

import java.util.Scanner;

public class Ex_24_QuizGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		//Input the choice of the user
		System.out.println("Enter the Que of your choice(1-3):");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Who is father of nation?");
			System.out.println("Gandhi\nSubash Bosh\nTerressa\nModi");
			String ans=sc.next();
			String str="Gandhi";
			if(ans.equals(str))
			{
				System.out.println("Answer is Correct");
			}
			else
			{
				System.out.println("Answer is wrong\nCorrect answer is:"+"Gandhi");
			}
			break;
		}
		
		case 2:
		{
			System.out.println("Which is a vegetable?");
			System.out.println("Rose\nLili\nDhalia\nPotato");
			String ans=sc.next();
			String str="Potato";
			if(ans.equals(str))
			{
				System.out.println("Answer is Correct");
			}
			else
			{
				System.out.println("Answer is wrong\nCorrect answer is:"+"Potato");
			}
			break;
		}
		
		case 3:
		{
			System.out.println("Which is an animal?");
			System.out.println("Mango\nCat\nBanana\nBrinjal");
			String ans=sc.next();
			String str="Cat";
			if(ans.equals(str))
			{
				System.out.println("Answer is Correct");
			}
			else
			{
				System.out.println("Answer is wrong!!\nCorrect answer is:"+"Cat");
			}
			break;
		}

		default:
		{
		System.out.println("Invalid Choice");
		}
	}

	}

}
