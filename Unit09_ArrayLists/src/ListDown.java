//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{

	public static boolean go(List<Integer> numArray)
	{
		boolean rtr = true;
		
		for (int i = 0; i < numArray.size() - 1; i++) {
			if (!(numArray.get(i) < numArray.get(i+1))) {
				rtr = false;
			}
		}
		
		return rtr;
	}	
}