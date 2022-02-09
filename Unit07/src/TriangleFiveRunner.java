//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;


public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive triangle = new TriangleFive();
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("enter an character :: ");
	   char mychar = keyboard.next().charAt(0);
	   System.out.println("enter an integer :: ");
	   int myint = keyboard.nextInt();
	   triangle.setLetter(mychar);
	   triangle.setAmount(myint);
	   System.out.println(triangle);
	}
}