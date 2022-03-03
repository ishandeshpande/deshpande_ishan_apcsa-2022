public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy input = new Toy("sorrry"); //prints 1 since we set count to 1
		System.out.println(input);
		
		input = new Toy("hi ishan");
		input.setCount(5);			//prints 5 since set count to 5
		System.out.println(input);
	}
}