package c3654717;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * class used to create an Array list of people to provide methods
 * to add and remove from the list and counting/sorting various aspects
 * such as counting males and sorting by age 
 * @author c3654717
 *
 */
public class Census {
	
	private List <Person> people = new ArrayList<Person>();
	/**
	 * Adds person to census
	 * 
	 * @param person to be added
	 */
	void addPerson(Person person)
	{
		people.add(person);
	}
	
	
	/**
	 * removes person from census
	 * 
	 * @param person to be removed
	 * @return true or false for if this can be removed
 	 */
	boolean removePerson(Person person)
	{
		return people.remove(person);
		
	}
	/**
	 * counts people in census
	 * 
	 * @return count of people
	 */
	int countPeople() {return people.size();}
	/**
	 * counts number of males in census if, gender is true then
	 * the person must be a male
	 * @return count of males
	 */
	int countMales()
	{
		int count = 0;
		for (Person person : people) {
			if (person.getGender() == true) {count ++;}
		}
		return count;
	}
	
	/**
	 * counts number of Females in census if, gender is false then
	 * the person must be a female
	 * @return count of females
	 */
	int countFemales()
	{
		int count = 0;
		for (Person person : people) {
			if (person.getGender() == false) {count ++;}
		}
		return count;
	}
	
	/**
	 * Sorts by age using comparator and returns the sorted values
	 */
	void sortOnAge() {
		Collections.sort(people, new Comparator<Person>() 
		{
			public int compare (Person p1, Person p2) {
				return Integer.compare(p1.getAge(), p2.getAge());
			}
		});
	}
	
	
	/**
	 * Sorts by height using comparator and returns the sorted values
	 */
	void sortOnHeight() {
		Collections.sort(people, new Comparator<Person>() 
		{
			public int compare (Person p1, Person p2) {
				return Integer.compare(p1.getHeight(), p2.getHeight());
			}
		});
	}
	
	/**
	 * 
	 * Sorts by Gender using comparator and returns the sorted values
	 *
	 */
	void sortOnGender() {
		Collections.sort(people, new Comparator<Person>() 
		{
			public int compare (Person p1, Person p2) {
				return Boolean.compare(p1.getGender(), p2.getGender());
			}
		});
	}
	
	/**
	 * To string method overridden to allow people to be displayed with
	 * related attributes
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder('\n'); 
		for (Person person : people) 
		{
			result.append(person.toString()).append('\n');
			
		}
		return result.toString();
		
	}
	
	

}
