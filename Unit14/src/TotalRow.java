import java.util.ArrayList;
import java.util.List;

public class TotalRow
{
    public static List<Integer> getRowTotals(int[][] m)
    {
    	ArrayList<Integer> total = new ArrayList<Integer>();
    	
    	for (int i = 0; i < m.length; i++) {
			int sum = 0; 
    		for (int k = 0; k < m[i].length; k++) {
    			sum += m[i][k];
    		}
    		
    		total.add(sum);
    	}
    	
		return total;
    }
}
