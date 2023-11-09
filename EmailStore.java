package c3654717;

import java.util.HashSet;
import java.util.Set;

/**
 * EmailStore class provides method for Storing email addresses
 * by providing methods to add to, check and display a set of emai
 * addresses.
 * 
 * 
 * @author c3654717
 *
 */




public class EmailStore {
	
	Set <String> emailAdresses = new HashSet <String>();
	
	/**
	 * method to add String email to emailAddresses set
	 * checks for duplicate values 
	 * 
	 * @param email represents a string email value
	 * @return  returns boolean value false if email is duplicate
	 */
	
	public boolean addEmail(String email) 
	{
		if (emailAdresses.contains(email)) 
		{
			return false;
			
		}else {
			return (emailAdresses.add(email));
			
		}
		
	}
	
	/**
	 * Method to check EmailAddresses set for email provided
	 * by user and will return boolean values depending
	 * on presence of value detected
	 * 
	 * @param email string value to represent an email
	 * @return boolean value true if email is present
	 * and false if email not in set
	 */
	public boolean hasEmail(String email) 
	{
		if (emailAdresses.contains(email)) 
		{
			return true;
			
		}
		return false;
		
	}
	/**
	 * Void method iterating through emailAddresses set and displays
	 * email values in the set
	 */
	public  void displayEmails() 
	{
		System.out.println("Emails: ");
		for (String email : emailAdresses) {
			System.out.println(email);
		}
		
	}
	
	
}
