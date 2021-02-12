/*
 * Christy Pavlik
 * December 5, 2020
 * Final Project
 * Java 2212.502
 * Start time: 4:55
 */
package finalProject;

public class DemoFinalProject {
	public static void main(String[] args) {
	
	Publication first = new Publication("Oliver Twist", "Penguin Books", 1837, 554);
	Magazine second = new Magazine("Rolling Stone", "Wenner Media", 1967, 80, "biweekly", true);
	ConsumerMagazine third = new ConsumerMagazine("Consumer Reports", "Consumers Union", 1936, 112, "monthly", true, 
			"Review Consumer Products & Services", 21.95);

	Object fourth = new Publication("Surely You're Joking, Mr. Feynman!", "W. W. Norton & Co", 1985, 350);
	Object fifth = new ConsumerMagazine("Travel Weekly", "Northstar Travel Media", 1958, 72, "weekly", true, "For Travel Agencies", 149.95);
	System.out.println(first.toString());
	System.out.println(second.toString());
	System.out.println(third.toString());
	System.out.println(fourth.toString());
	System.out.println(fifth.toString());
}
}
