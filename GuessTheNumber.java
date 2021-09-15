import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
	static int rn;
	 static void gen()// function to generate Random numbers
	{
	Random Ran = new Random();
		
		rn = Ran.nextInt(1000);
	}
	 
static void check()// function to check your answer
{
	
	Scanner obj = new Scanner(System.in);

	
	while(true)
	{
		int n = obj.nextInt();
		if (n<rn)
		{
			System.out.println("too less");
		}
	
		if (n>rn)
		{
			System.out.println("too large");
			
		}
		if(n==rn)
		{
			System.out.println("Great!");
			System.out.println("press 0 to continue");// prompt to restart, press anything except 0 to terminate
			int d = obj.nextInt();
			if (d==0) {
			gen();// to create a new random number
			
				continue;// restart the game
			}
			else
				break;// End the game
		}
	
	}
	
	
}

	public static void main(String[] args) {
	// calling all the methods
		Scanner obj = new Scanner(System.in);
		gen();
		System.out.println("Enter your number between 0 to 1000");
		check();
		
		
	}

}
