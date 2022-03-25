public class RecursionFunOne
{
	static int count = 0; 

	public static int countOddDigits(int num)
	{
		if (num > 10) {
			if (((num % 10) % 2) != 0) count++;
			num = num / 10;
			countOddDigits(num);
		}

		return count;
	}
}