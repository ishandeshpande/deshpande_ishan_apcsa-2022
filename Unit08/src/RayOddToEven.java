//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd = 0; 
		int even = 0;
		int distance = 0;
		
		for (int num = 0; num < ray.length; num++)
		{
			if ((ray[num] % 2) != 0)
			{
				odd = num;
				
				for (int numm = num; numm < ray.length; numm ++)
				{
				if (ray[numm] % 2 == 0)
				{	even = numm;
					break;
				}	
				else
					distance = 0;
				}
				
				distance = even - odd;
				break;
			}
		}
		if (distance == 0)
				distance = -1;
		return distance;
	}
}