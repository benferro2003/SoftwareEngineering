package c3654717;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class used to represent name Array list and uses methods to create, add to, remove from <br>
 * and print values from the array.
 * 
 * 
 * 
 * @author c3654717
 *
 */

public class NameManager 
{
	List<String> names = new ArrayList<String>(); //create String Array list for names
	
	/**
	 * This method allows String names to be added to the names array list
	 * 
	 * @param name String name to be stored in array
	 */
	public void addName(String name) {names.add(name);}
	
	
	/**
	 * Iterates over names array list and prints each item in the array <br>
	 * using a for loop.
	 * 
	 */
	public void printNames() 
	{
	
		for (String name : names) 
		{
			System.out.println("Name - " + name);
		}
		
		
	}
	
	
	/**
	 * Uses an iterator class to gain methods that allow to remove particular items <br>
	 * from names array list and to iterate over the array list, removing names with a length<br>
	 * greater than 15 characters
	 */
	
	public void removeLongNames()
	{
		Iterator<String> iter = names.iterator();
		while (iter.hasNext() ) 
		{
			String name = iter.next();
			if (name.length() > 15)
			{
				iter.remove();
			}
			
		}
	}

	
}
