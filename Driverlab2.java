package c3654717;

import java.util.Scanner;

public class Driverlab2 {

	public static void main(String[] args) 
	{
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a sentence -");
		String word = Scan.nextLine();
		
		
		
		WordProcessor Word = new WordProcessor();
		
		System.out.println("Word count:   " + Word.countWords(word));
		System.out.println("Letter count: " + Word.countLetters(word));
		System.out.println("Length:       " + Word.getLength(word));
		
		
		
	
		
	

	}

}
