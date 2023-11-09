package c3654717;

/**
 * Driver class used to create instances of EmailStore class to allow methods to be tested
 * 
 * @author c3654717
 *
 */
public class EmailDriver {

	
	/**
	 * creates instances of EmailStore class and WordCounter class, testing methods using different string email/words.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EmailStore email = new EmailStore();
		email.addEmail("paul@gmail.com");
		email.addEmail("ben@gmail.com");
		email.addEmail("steve@gmail.com");
		email.hasEmail("gandaldTheGray@gmail.com");
		email.hasEmail("ben@gmail.com");
		email.displayEmails();
		
		
		
		
		
		WordCounter counter = new WordCounter();
		counter.addSentence("This sentence has the word has in it twice");
		counter.outputResults();

		
		
	}
	
	

}
