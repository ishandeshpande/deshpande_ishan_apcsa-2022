//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	double bill;
	
	public double getDiscountedBill(double bill)
	{
		if (bill > 2000) {
			bill = bill * 0.85;
		}
		return bill;
	}
}