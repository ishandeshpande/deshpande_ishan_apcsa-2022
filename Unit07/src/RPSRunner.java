//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("type in your prompt [rock,paper,scissors] :: ");
	    String response = keyboard.nextLine();

	    RockPaperScissors game = new RockPaperScissors(response);
	    game.determineWinner();
	    System.out.println(game);
		
		//add in a do while loop after you get the basics up and running
				
	}
}



