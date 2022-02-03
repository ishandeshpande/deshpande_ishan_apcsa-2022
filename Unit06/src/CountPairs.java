//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		
		if(str.length() <= 2)
	        return 0;
		
		int pairsCount = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
			      pairsCount ++;
		}
	}
	return pairsCount;
}}