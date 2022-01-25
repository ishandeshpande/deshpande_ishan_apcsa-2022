//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number to see whether it's even or odd :: ");
		
		int nbr = keyboard.nextInt();
		
		System.out.println("Your number is odd :: " + NumberVerify.isOdd(nbr));	
		System.out.println("Your number is even :: " + NumberVerify.isEven(nbr));

	}
}