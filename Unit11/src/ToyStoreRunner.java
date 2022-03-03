public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore b = new ToyStore();
		b.loadToys("ha hea hah");
		System.out.println(b);
		System.out.println("max == " + b.getMostFrequentToy());
	}
}