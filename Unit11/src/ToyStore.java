import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for (String name : toys.split(" ")) {
			Toy tempToy = getThatToy(name);
			if(tempToy == null)
			{
				toyList.add(new Toy(name));
			}
			else
			{
				tempToy.setCount(tempToy.getCount() + 1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++) {
  			if (toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int count = toyList.get(0).getCount();
  		String toyName = toyList.get(0).getName();
  		
  		for (int i = 1; i < toyList.size(); i++) {
  			if (toyList.get(i).getCount() > count) {
  				count = toyList.get(i).getCount();
  				toyName = toyList.get(i).getName();
  			}
  		}
  		return toyName;
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sortList = new ArrayList<Toy>();
  		
  		int index = 0;
  		for (int i = toyList.size(); i > 0; i--) {
  			sortList.add(new Toy(getMostFrequentToy()));
  			sortList.get(index).setCount((getThatToy(getMostFrequentToy()).getCount()));
  			toyList.remove(getThatToy(getMostFrequentToy()));
  			index++;
  		}
  		
  		toyList = sortList;
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}