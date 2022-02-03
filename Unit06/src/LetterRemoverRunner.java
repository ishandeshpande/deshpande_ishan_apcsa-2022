//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover runner = new LetterRemover(" ");
		runner.setRemover("I am Sam I am", 'a');
		runner.removeLetters();
		System.out.println(runner);
		
		runner.setRemover("ssssssssxssssesssssesss", 's');
		runner.removeLetters();
		System.out.println(runner);

		runner.setRemover("qwertyqwertyqwerty", 'a');
		runner.removeLetters();
		System.out.println(runner);

		runner.setRemover("abababababa", 'b');
		runner.removeLetters();
		System.out.println(runner);
		
		runner.setRemover("abaababababa", 'x');
		runner.removeLetters();
		System.out.println(runner);
	}
}