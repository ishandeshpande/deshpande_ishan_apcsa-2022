//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import static java.lang.Math;

public class Triples
{
   private int number;
   private int gcd;
   private boolean hi;
   private String rtr;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private String greatestCommonFactor(int myInt) {
		rtr = " ";
		for (int one = 0; one < number; one++) {
			for (int two = 0; two < number; two++) {
				for (int three = 0; three < number; three++) {
					if (Math.pow(one, 2) + Math.pow(two, 2) == Math.pow(three, 2)) {
						if ((one % 2 != 0 && two % 2 == 0) || (one % 2 == 0 && two % 2 != 0))  {
							if (three % 2 != 0) {
								for(int i = 1; i <= one && i <= two; i++)
						        {
						            if(one%i==0 && two%i==0)
						                gcd = i;	
						            if (gcd <= 1) {
						            	rtr = one + " " + two + " " + three;
						            }
						        }
							}
						}
					}
				}
			}
			
		}
		
		return rtr;
	}
	

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}