package q5;
import java.util.Scanner;

/**<h1>Assignment 8 - Q5: MonthTester</h1>
 * Creates Months in order to utilize methods associated with object.
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *	 	     										 			   */
public class MonthTester {

	/**main accepts arguments from the user to create Month object and display infromation.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare and Initialize variables and objects
		Scanner in = new Scanner(System.in);
		String wordMonth1 = "";
		String wordMonth2 = "";
		int month3 = 0;
		int month4 = 0;
		
		//Get first month.
		System.out.println("Welcome!");
		System.out.println("Please enter a month (words).");
		wordMonth1 = in.nextLine();
		
		//Get second month.
		System.out.println("Please enter another month (words).");
		wordMonth2 = in.nextLine();
		
		//Get third month.
		System.out.println("Please enter a month (number).");
		month3 = in.nextInt();
		
		//Get forth month.
		System.out.println("Please enter a month (number).");
		month4 = in.nextInt();
		
		//Declare and Initialize objetcs
		Month m1 = new Month(wordMonth1);
		Month m2 = new Month(wordMonth2);
		Month m3 = new Month(month3);
		Month m4 = new Month();
		m4.setMonthNumber(month4);
		
		//Use getMonth
		System.out.println(wordMonth1 + " is month number " + m1.getMonthNumber());
		System.out.println(wordMonth2 + " is month number " + m2.getMonthNumber());
		System.out.println(month3 + " is also " + m3.getMonthName());
		System.out.println(month4 + " is also " + m4.getMonthName());
		
		//Use to string
		System.out.println();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		//Determine if are equal
		System.out.println();
		System.out.println("Are the first and second month equal?: " + m1.equals(m2));
		System.out.println("Are the third and fourth month equal?: " + m3.equals(m4));
		
		//Use greaterThan and lessThan.
		System.out.println();
		System.out.println("Is " + m1.getMonthName() + " greater than " + m2.getMonthName() + "?: " + m1.greaterThan(m2));
		System.out.println("Is " + m1.getMonthName() + " less than " + m2.getMonthName() + "?: " + m1.lessThan(m2));
		System.out.println("Is " + m3.getMonthNumber() + " greater than " + m4.getMonthNumber() + "?: " + m3.greaterThan(m4));
		System.out.println("Is " + m3.getMonthNumber() + " less than " + m4.getMonthNumber() + "?: " + m3.lessThan(m4));
	}//main
}//MonthTester
