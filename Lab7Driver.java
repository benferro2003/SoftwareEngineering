package c3654717;

/**
 * Driver class used to create instances of {link Person.java} class and {link Census.java} class ,  <br>
 * allowing the driver to pass new values to methods in the previous class. <br>
 *
 * @author c3654717
 *
 */
public interface LabSevenDriver {
	/**
	 * Provides  values to {link Person.java} class to be given to {link Census.java} class
	 * allowing methods to be tested including sorting by age and gender for the list of people<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Census census = new Census();
		Person p1 = new Person(160, 20, true);
		Person p2 = new Person(200, 26, false);
		Person p3 = new Person(120, 10, false);
		Person p4 = new Person(190, 70, true);
		
		census.addPerson(p1);
		census.addPerson(p2);
		census.addPerson(p3);
		census.addPerson(p4);
		System.out.println("People: ");
		System.out.println(census.toString());
		census.removePerson(p4);
		System.out.println("People after removal: ");
		System.out.println(census.toString());
		
		System.out.println("number of people = " + census.countPeople());
		System.out.println("number of males = " + census.countMales());
		System.out.println("number of Females = " + census.countFemales());
		
		System.out.println("unsorted : " + census.toString());
		
		
		census.sortOnGender();
		System.out.println("sorted by Gender:");
		System.out.println(census.toString());
		
		census.sortOnAge();
		System.out.println("sorted by Age:");
		System.out.println(census.toString());
		
		census.sortOnHeight();
		System.out.println("sorted by Height:");
		System.out.println(census.toString());
		
		
		
		
		
		
		
		
		
	}
		

}
