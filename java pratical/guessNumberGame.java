importjava.util.*;
class guessNumberGame
{
		public static void main(String args[])
		{
			int no,guess;
			Scanner sc=new Scanner(Syatem.in);
			no=(int)(Math.random()*100)+1;
	do
		{
			System.out.println("Enter no between 1 to 100");
			guess=sc.nextint();
			
			if(guess==no)
			{
			System.out.println("You guess the correct no");
			}
			else if(guess<no)
			{
			System.out.println("You guess THE LOWER THAN no");
			}
			else
			{
			System.out.println("You guess the higher than no")
			}
		}
		while(guess !=no);

		}
