//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover(String phrase)
	{
		sentence = phrase;
	}

	public LetterRemover(char delete)
	{
		lookFor = delete;
	}	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int indexxx = sentence.indexOf(lookFor);
		while (indexxx > 0) {
			cleaned = cleaned.substring(0,indexxx) + cleaned.substring(indexxx + 1);
			indexxx = cleaned.indexOf(lookFor);
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " " + removeLetters();
	}
}