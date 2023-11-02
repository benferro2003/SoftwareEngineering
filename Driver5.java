package c3654717;


/**
 * Driver class used to create instances of {link NameManager.java} class,  <br>
 * allowing the driver to pass new values to methods in the previous class. <br>
 *
 * @author c3654717
 *
 */


public class Driver5 {
	
	/**
	 * Provides String values to {link NameManager.java} names array <br>
	 * Also allows methods such as printNames and removing names from the array to be tested.<br>
	 * 
	 * @param args
	 */

	public static void main(String[] args) 
	{
		NameManager manager = new NameManager(); //create instance of NameManager class
		manager.addName("M.Mickleson");
		manager.addName("Johnua Taylor Biggs");
		manager.addName("P.Smith");
		manager.addName("Peter Jonathan Smythton");
		manager.addName("P.Thompson");
		
		manager.printNames();
		manager.removeLongNames();
		manager.printNames();
		

	}

}
