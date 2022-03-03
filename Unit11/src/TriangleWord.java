public class TriangleWord
{
	public static void printTriangle(String word)
	{
		for(int i = 0; i<word.length(); i++) {
			for(int j = 0; j<=i+1; j++){
				for(int k = 0; k<= i; k++) {
					System.out.print(word.charAt(k));
				}
			}
			System.out.println();
		}
	}
}