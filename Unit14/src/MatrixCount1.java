public class MatrixCount1
{
    private int[][] m = {{ 1, 2, 3, 4, 5}, { 6, 7, 8, 9, 0}, { 6, 7, 1, 2, 5}, { 6, 7, 8, 9, 0}, { 5, 4, 3, 2, 1}};

    public int count(int val)
    {
    	int count = 0;
    	
		for (int i = 0; i < m.length; i++) {
			
			for (int k = 0; k < m[0].length; k++) {
				if (val == m[i][k]) count++;
			}
		}
		
		return count;
    }
}
