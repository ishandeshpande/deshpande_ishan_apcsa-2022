//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;

public class ListOddToEven
{
	public static int go(List<Integer> ray )
	{
		int odd = -1;
		int even = -1;
				
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) % 2 == 1) {
				odd = i;
				break;
				
			}
		}
		
		
		for (int i = ray.size() - 1; i >= 0; i--) {
			if (ray.get(i) % 2 == 0) {
				even = i;
				break;
			}
		}
		

		if (odd == -1 || even == -1 || even-odd < 0) return -1;
		else return even - odd;
	}
}