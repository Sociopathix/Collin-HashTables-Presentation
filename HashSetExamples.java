// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Import the util package.
import java.util.*;

public class HashSetExamples
{
	/** Creates a HashSet object called attendees and adds four items to it using the add() method. */
	public static void codeExample1()
	{
		// Create the HashSet object.
		Set<String> attendees = new HashSet<>();
	
		// Adding items.
		attendees.add("Angel");
		attendees.add("Alice");
		attendees.add("Bob");
		attendees.add("Alice");
	
	  	// Output the results.
		System.out.println(attendees);
	}
	
	/** Creates a List object called attendees and uses it to initialize the values of the 
	 *  HashSet uniqueAttendees.
	 */
	public static void codeExample2()
	{
		// Create the list of items.
		List<String> attendees = Arrays.asList("Angel", "Alice", "Bob", "Alice");
		// Use the list to initialize the HashSet object.
		Set<String> uniqueAttendees = new HashSet<>(attendees);
	
		// Ouput the results.
		System.out.println("Original: \t" + attendees);
		System.out.println("Unique: \t" + uniqueAttendees);
	}
	
	/** Shows examples of the most common helper methods of the HashSet class. */
	public static void codeExample3()
	{
		// Create the list of items.
		List<String> attendees = Arrays.asList("Angel", "Alice", "Bob", "Alice");
		// Use the list to initialize the HashSet object.
		Set<String> uniqueAttendees = new HashSet<>(attendees);
		System.out.println("Initial Set: " + uniqueAttendees);
	
		// Adds item to the set.
		uniqueAttendees.add("Derek");
		System.out.println("add(\"Derek\"): " + uniqueAttendees);
	
		// Sets variable to true if the item is in in the set.
		boolean containsAngel = uniqueAttendees.contains("Angel");
		System.out.println("uniqueAttendees contains \"Angel\": " + containsAngel);
	
		// Removes the specified item by value.
		uniqueAttendees.remove("Bob");
		System.out.println("remove(\"Bob\"): " + uniqueAttendees);
	
		// Sets the variable to the number of items in the set.
		int numAttendees = uniqueAttendees.size();
		System.out.println("Number of Attendees: " + numAttendees);
	}
	
	public static void main(String[] args)
	{
		// Uncomment each method call one at a time to run the examples.
		// codeExample1();
		// codeExample2();
		// codeExample3();
	}
}
