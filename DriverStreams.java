package c3654717;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * 
 * @author c3654717
 *
 *Driver class used to add values to students Array list
 *and allows streams to be applied to code to test cases.
 *
 */
public class DriverStreams {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));

		
		// create your Stream solutions here
		students.stream().forEach(System.out::println);
		System.out.println("");
		students.stream().filter(student -> student.getGrade() > 70).forEach(System.out::println);
		Object [] studentArray = students.stream().map(student -> student.getName().toUpperCase()).sorted().toArray();
		System.out.println("");
		System.out.println(Arrays.toString(studentArray));
		
		Double aveGrade = students.stream().mapToDouble(Student::getGrade).average().getAsDouble();
		System.out.println(""); 
		System.out.println(aveGrade); 
		
		System.out.println(""); 
		IntStream.range(90,100).map(n -> n * n * n).forEach(System.out::println);
		System.out.println("");
		List<Integer> numList = Stream.generate(Math::random).map(n -> (int)(n*5+1)).limit(10).distinct().collect(Collectors.toList());
		for(int next:numList) 
		{
			System.out.println("Next value is : " + next);
		}
		
	}
}
