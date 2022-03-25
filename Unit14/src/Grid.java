public class Grid
{

	private String[][] array;
	public Grid(int rows, int cols, String[] vals)
	{
		array = new String[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				array[i][k] = vals[(int) Math.round(Math.random()*(vals.length-1))];
				
			}
		}
		
	}

	public String findMax(String[] vals)
	{
	
		String max = vals[0];
		int maxCount = 0;
		
		for (int i = 0; i < vals.length; i++) {
			if (countVals(vals[i]) > maxCount) {
				max = vals[i];
				maxCount = countVals(vals[i]);
			}
		}
		
		return "The most common value is " + max + ".";
	}

	private int countVals( String val )
	{
		int count = 0; 
		
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[0].length; k++) {
				if (array[i][k].equals(val)) count++;
			}
		}
		
		return count;
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				output += array[i][j] + " "; 
			}
			
			output += "\n";
		}
		
		return output;
	}
	
}