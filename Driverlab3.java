package c3654717;

import java.util.Random;

/**
 * Driver class used to give values to {link Stats.java} class so the code can be run
 * 
 * @author BenFerro_c3654717
 *
 */
public class DriverLab3 {
	
	/**
	 * Provides random integer values to {link Stats.java} class to test the methods
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final int VALUES = 10;

		Stats stats = new Stats(VALUES);

		Random random = new Random();

		for (int i = 0; i < VALUES; i++) {

			stats.addValue(random.nextInt(100));
		}

		System.out.println("Numbers stored : ");
		System.out.println(stats);

		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMinimum());
		System.out.println("Maximum value = " + stats.getMaximum());
	}
}
