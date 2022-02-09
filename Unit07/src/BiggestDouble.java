//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	private double greatest;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		if (one > two && one > three && one > four) greatest = one;
		if (two > one && two > three && two > four) greatest = two;
		if (three > one && three > two && three > four) greatest = three;
		if (four > one && four > two && four > three) greatest = four;
		return greatest;
	}

	public String toString()
	{
	   return "";
	}
}