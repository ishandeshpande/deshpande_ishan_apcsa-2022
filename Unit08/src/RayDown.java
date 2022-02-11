import java.util.Arrays;

public class RayDown
{
	public static boolean go(int[] numArray)
	{
		for (int num = 0; (num < numArray.length && num+1< numArray.length); num ++)
			if (numArray[num] > numArray[num+1])
				return true;
			else 
				return false;
		return false;
	}	
	
}