//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Triples triple = new Triples();
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("enter an integer :: ");
	   int myInt = keyboard.nextInt();
	   triple.setNum(myInt);
	   out.print(triple.greatestCommonFactor(myInt));
	}
}