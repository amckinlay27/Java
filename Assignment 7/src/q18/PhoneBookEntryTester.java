package q18;
import java.util.ArrayList;

/**<h1>Assignment 7: Question 18 ~ PhoneBookEntryTester</h1>
 * PhoneBookEntryTester creates PhoneBookEntry objects and users then methods to display them. 
 * @author Adam McKinlay ~ c0656685
 * @since March 26, 2019
 * 
 *																							*/
public class PhoneBookEntryTester {

	/**main creates 5 PhoneBookEntry objects and stores them in an ArrayList and displays them.
	 * 
	 * @param args Arguments
	 *																						 */
	public static void main(String[] args) {
		//Declare and initialize objects
		ArrayList<PhoneBookEntry> listings = new ArrayList<PhoneBookEntry>();
		PhoneBookEntry p1 = new PhoneBookEntry("Adam", "1618033398");
		PhoneBookEntry p2 = new PhoneBookEntry("Billy", "6626070041 ext1034");
		PhoneBookEntry p3 = new PhoneBookEntry("Sandy", "3141592653");
		PhoneBookEntry p4 = new PhoneBookEntry("Mandy", "0112358132");
		PhoneBookEntry p5 = new PhoneBookEntry("Dandy", "2718281828");
		
		//Add people
		listings.add(p1);
		listings.add(p2);
		listings.add(p3);
		listings.add(p4);
		listings.add(p5);

		//Display people
		System.out.println("Phone Listings:");
		for(int i=0; i<listings.size(); i++) {
			PhoneBookEntry person = listings.get(i);
			System.out.println("Name: "+ person.getName() + "\tNumber: " + person.getNumber());
		}
	}//main
}//PhoneBookEntryTester
