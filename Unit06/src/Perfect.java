//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() {
	   setNums(0);
   }
  

public void setNums(int num) {
		number = num;

	}

	public boolean isPerfect()
	{
		int sum = 0;
		int i = 1;
		
		while (i < number/2) {
			if (number % i ==0) {
				sum += i;
			}
			i++;
		}
		if (sum==number) return true;
		else return false;
	}

	public String toString() {
		if (isPerfect()) return "is perfect";
		else return "not perfect";
	}
	
}