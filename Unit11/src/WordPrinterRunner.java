import java.util.Scanner;

public class WordPrinterRunner
{
	public static void main( String args[] )
	{
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			System.out.print("\nEnter the word to display :: ");
			String word = keyboard.next();
	
			System.out.print("Enter the times to display :: ");
 			int times = keyboard.nextInt();			
			
			//call the printWord method
 			
 			WordPrinter.printWord(word, times);
 			
			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}