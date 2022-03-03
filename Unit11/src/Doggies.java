import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{	
		pups = new Dog[size];		
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);	
	}

	public String getNameOfOldest()
	{
		int oldest = 0; 
		int oIndex = 0; 
		
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > oldest) {
				oldest = pups[i].getAge();
				oIndex = i;
			}
		}
		
		return pups[oIndex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngest = 0; 
		int yIndex = 0; 
		
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > youngest) {
				youngest = pups[i].getAge();
				yIndex = i;
			}
		}
		
		return pups[yIndex].getName();
	}

	public String toString()
	{
		return "" + Arrays.toString(pups);
	}
}