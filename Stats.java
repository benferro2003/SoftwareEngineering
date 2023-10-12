package c3654717;

import java.util.Arrays;

/**
 * Class that uses a random list of numbers to provide information to
 * the user about them(i.e. the maximum, average, minimum etc). <br><br>
 * 
 * @author BenFerro_c3654717
 *
 */
public class Stats {
	
	/**
	 * Numbers used to store a list of random integer values
	 */
	
	private int[] numbers;
	
	/**
	 * Count used to show index of the list of numbers
	 */
	private int count;

	
	/**
	 * Gives an integer value to the current index of the numbers array using the current count. 
	 * 
	 * @param value integer value showing current list index using the count attribute.
	 */
	
	
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * Returns how many items there are in the numbers list
	 * 
	 * @return returns the length of the list
	 */
	
	public int getCount() {
		return numbers.length;
	}

	/**
	 * returns to the user the maximum value of the numbers list.
	 * 
	 * @return Returns integer maximum value of the list numbers.
	 * 
	 *
	 */
	public int getMaximum() {

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * returns to the user the minimum value of the numbers list.
	 * 
	 * @return Returns integer minimum value of the list numbers.
	 * 
	 * 
	 */
	public int getMinimum() {
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}
	
	/**
	 * Uses a for loop and increments the count by one every iteration to
	 * add all numbers in the numbers array together and returns the total
	 * 
	 * @return Returns the value of all integers in the array added together
	 * 
	 */

	public int getTotal() {

		int total = 0;

		// total all values within the array
		for (int count = 0; count < numbers.length; count++) {
			total += numbers[count];
		}
		return total;
	}
	
	/**
	 * Calculates average of the array of numbers and will return this
	 * 
	 * @return Returns a double value named average which stores the average of the array.
	 */

	public double getAverage() {

		int total = 0;
		for (int count = 0; count < numbers.length; count++) {
			total += numbers[count];
		}

		double average = total / (double) numbers.length;

		return average;
	}

	/**
	 * Uses toString method to allow array to be displayed to user as a string
	 * 
	 * @return Returns the array as a string
	 */
	
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
	
	/**
	 * Creates an array of integers within the bounds of {link capacity}.
	 * 
	 * @param capacity Refers to the size of the array.
	 */

	
	public Stats(int capacity) {
		numbers = new int[capacity];
	}

}
