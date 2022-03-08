import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class WordRunner {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit12/src/words.dat"));
		
		Word[] words = new Word[file.nextInt()];

		for (int i = 0; i < words.length; i++) {
			words[i] = new Word(file.nextLine());
		}
		
		Word temp;
		
		for (int k = 0; k < words.length; k++) {
			
			
			for (int j = 0; j < words.length - k - 1; j++) {
				if (words[j].compareTo(words[j+1]) > 0) {
					temp = words[j];
					words[j] = words[j+1];
					words[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(words));
		
		}
	}