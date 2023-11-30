import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;

import json.JSONException;
import json.JSONFactory;
import json.JSONObject;
import json.JSONParser;
import json.JSONValue;
/**
 * Driver class to test JSON files can be
 * parsed, programmed and added to.
 * 
 * 
 * @author c3654717
 *
 */
public class Driver {

	/**
	 * Prints details about a student, by extracting the property members from a given {@link JSONObject}.
	 * 
	 * @param id the ID of the student
	 * @param properties the {@link JSONObject} containing the properties of the student
	 * @throws JSONException if the given JSON object does not contain the expected property member.
	 */
	private static void printStudentDetails(String id, JSONObject properties) throws JSONException {
		
		System.out.println("\n--------------");
		System.out.println("ID : " + id +"\n");
		
		String name = properties.getMember("name").asString();
		String course = properties.getMember("course").asString();
		int year = properties.getMember("year").asInteger();
		double average = properties.getMember("average").asDouble();
		String university = properties.getMember("university").asString();
		
		System.out.println("The student name is " + name + ", and they are studying " + course + " at " + university);
		System.out.println("They are currently studying year " + year);
		System.out.println("The average mark is " + average);
		
		if ( properties.getMember("enrolled").asBoolean() == false ) {
			System.out.println("NOTE: THEY ARE NOT CURRENTLY ENROLLED");
		}
		
		if (properties.hasMember("suspended") && properties.getMember("suspended").asBoolean() == true ) {
			System.out.println("WARNING: THIS STUDENT HAS BEEN SUSPENDED");
		}
	}
	
	
	/**
	 * Prints details about the module
	 * @param id used to display module id
	 * @param properties  {@link JSONObject} containing the properties of the module
	 * @throws JSONException if the given JSON object does not contain the expected property member.
	 */
	private static void printModuleDetails(String id, JSONObject properties) throws JSONException {
		
		System.out.println("\n--------------");
		System.out.println("Module ID : " + id +"\n");
		
		String name = properties.getMember("moduleName").asString();
		String tutor = properties.getMember("moduleTutor").asString();
		int level = properties.getMember("level").asInteger();
		
		
		System.out.println("The module name is " + name);
		System.out.println("The module is being run by " + tutor + " at level " + level);
		
		if (properties.hasMember("count")) {
			int count = properties.getMember("count").asInteger();
			System.out.println("The number of students is " + count);
		}else {System.out.println("student count = null");}
		
		if ( properties.getMember("running").asBoolean() == false ) {
			System.out.println("NOTE: THIS MODULE ISNT CURRENTLY RUNNING");
		}
		
		
	}
	
	/////////////////////////////////////////////
	/**
	 * Used to generate JSON files and create JSON objects
	 * for books.
	 * 
	 * @throws FileNotFoundException if file isn't in path
	 */
	private static void generateJSON() throws FileNotFoundException {
		
		JSONObject rootObj = JSONFactory.createObject();// create the root object
		JSONObject book = JSONFactory.createObject(); // create a new book object
		rootObj.addMember("0 7506 5545 3", book);// add the book to the root object
		book.addMember("title", "Electronics : A first Course");
		book.addMember("author", "Owen Bishop");
		book.addMember("year", 2002);
		book.addMember("in print", false);
		book.addMember("Publisher", "penguin");
		book.addMember("Edition", 23286);
		
		JSONObject book2 = JSONFactory.createObject(); // create a new book object
		rootObj.addMember("0 7506 5535 7", book2);// add the book to the root object
		book2.addMember("title", "Comp-Sci : A first Course");
		book2.addMember("author", "Alexe Bishop");
		book2.addMember("year", 2003);
		book2.addMember("in print", false);
		book2.addMember("Publisher", "dunder mifflin");
		book2.addMember("Edition", 2998);
		
		
		JSONObject book3 = JSONFactory.createObject(); // create a new book object
		rootObj.addMember("0 4896 5435 8", book3);// add the book to the root object
		book3.addMember("title", "Mechanics : A second Course");
		book3.addMember("author", "Axe Usopp");
		book3.addMember("year", 2009);
		book3.addMember("in print", false);
		book3.addMember("Publisher", "rocket books");
		book3.addMember("Edition", 1986);
		
		
		
		// write the JSON to a file
		
		
		
		PrintWriter writer = new PrintWriter("books.json");
		writer.print(rootObj);
		writer.close();
		
		
		

	}
	
	/////////////////////////////////////////////
	/**
	 * Main method used to parse JSON files
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// parse the JSON file, this returns a JSONValue object which represents an internal representation of the parsed data
			JSONValue value = JSONParser.parseFile("student_info.json");

			// get the JSON value, converted to a JSONObject, allowing extraction of the properties
			JSONObject rootObj = value.asObject();

			// loop over each JSONObject available
			for (Entry<String, JSONValue> next : rootObj) {

				// print the student details present in the next JSON object
				printStudentDetails(next.getKey(), next.getValue().asObject());
			}

			////////////////////////////////////////////////////////

			// Add code for Task 3 here (parsing module_info.json file).
			
			////////////////////////////////////////////////////////
			
			
			
			// parse the JSON file, this returns a JSONValue object which represents an internal representation of the parsed data
			JSONValue value2 = JSONParser.parseFile("module_info.json");

			// get the JSON value, converted to a JSONObject, allowing extraction of the properties
			JSONObject rootObj2 = value2.asObject();

			// loop over each JSONObject available
			for (Entry<String, JSONValue> next : rootObj2) {

				// print the student details present in the next JSON object
				printModuleDetails(next.getKey(), next.getValue().asObject());
			}
			
			
			generateJSON();	// do not remove: Used for Task 4
			
		} catch (IOException e) {

			System.err.println("I/O Error : " + e.getMessage());
			
		} catch (JSONException e) {

			System.err.println("Parse Error : " + e.getMessage());
		}

	}

}
