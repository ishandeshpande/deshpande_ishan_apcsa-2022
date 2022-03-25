public class RecursionFunThree
{
	static int count = 0;

	public static int luckyThrees(long num)
	{
		if (num > 10) {
			if ((num % 10) == 3) count++;
			num = num / 10;
			luckyThrees(num);
		}

		return count;
	}
}