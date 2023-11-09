package c3654717;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	/**
	 * Maps words to their occurrence count.
	 */
	private final Map <String, Integer> wordMap = new HashMap <String, Integer>();
	
	/**
	 * Adds string value word to map and checks occurrence of the word
	 * 
	 * @param word string value representing word to add to Map
	 */
	void addWord(String word)
	{
		
		if (wordMap.containsKey(word)) 
		{
			wordMap.put(word, wordMap.get(word) + 1);
			
		}else {wordMap.put(word, 1);}
	}
	
	/**
	 * Splits sentence into words and adds each word to map calling
	 * method addWord.
	 * 
	 * @param Sentence
	 */
	void addSentence(String Sentence)
	{
		String[] words = Sentence.split(" ");
		for (String word : words ) {
			addWord(word);
		}
	}
	
	/**
	 * Method iterates map and displays each word in sentence with occurrence.
	 */
	void outputResults()
	{
		for (String word : wordMap.keySet()) {
			System.out.println(word + wordMap.get(word));
			
			
		}
	}
	

}
