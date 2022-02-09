//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;
   private int ASC; 
   private String ret = "";
   
	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		ASC = (int)letter;
		int rows = amount;
		int blocks = amount;
		int abcde = amount;
		
		for (int i = 0; i < rows; i++) {
			for (int ii = 0; ii < blocks; ii++) {
				for (int iii = 0; iii < abcde; iii++) {
					ret = ret + (char)ASC;
				}
				
				if (ASC == 90) ASC = 65;
				else if (ASC == 122) ASC = 97;
				else ASC++;
				abcde--;
				ret = ret + " ";
			}
			abcde = amount;
			blocks--;
			ASC=(int)letter;
			ret += "\n";
		}
		return ret;
}}