//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class GridRunner
{
	public static void main( String args[] )
	{
		String[] values = {"x", "y"};
		Grid grid = new Grid(10, 10, values);
		System.out.println(grid);
		System.out.println(grid.findMax(values));
	}
}