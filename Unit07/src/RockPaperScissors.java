//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.lang.Math;   

import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private int rng;
	private String winner="";


	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		rng = (int)(Math.floor((Math.random()*3)))+1;
		
		if (rng == 1) compChoice = "rock";
		if (rng == 2) compChoice = "paper";
		if (rng == 3) compChoice = "scissors";
		
		if (compChoice.equals("rock")) {
			if (playChoice.equals("paper")) winner = "player";
			else if (playChoice.equals("scissors")) winner = "computer";
			else winner = "neither";
		}
		if (compChoice.equals("paper")) {
			if (playChoice.equals("rock")) winner = "computer";
			else if (playChoice.equals("scissors")) winner = "player";
			else winner = "neither";

		}

		if (compChoice.equals("scissors")) {
			if (playChoice.equals("paper")) winner = "computer";
			else if (playChoice.equals("rock")) winner = "player";
			else winner = "neither";
		}

			
		return winner;
	}

	public String toString()
	{
		return "Since the computer chose " + compChoice + " and you chose " + playChoice + ", the winner is " + winner  + ".";
	}
}