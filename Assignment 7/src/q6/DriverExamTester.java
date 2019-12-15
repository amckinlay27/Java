package q6;
import java.util.Scanner;

/**<h1>Assignment 7: Question 6 ~ Tester</h1>
 * DriverExamTester is a program that test users for a driving test and provides instant feedback.
 * @author Adam McKinlay ~ c0656685
 * @since March 26, 2019
 * 
 *																								*/
public class DriverExamTester {

	/**main gets a users answers and displays the results of the test.
	 * 
	 * @param args	Arguments
	 *																*/
	public static void main(String[] args) {
		//Declare and initialize variables and objects
		Scanner in = new Scanner(System.in);
		String[] answers = new String[20];
		int[] wrongQs;
		String letter;
		
		//Get students answers
		System.out.println("Welcome! The test will now begin.");
		for(int i=0; i<answers.length; i++) {
			System.out.print("Q" + (i+1) +": ");
			letter = in.next();
			letter = validateInput(letter, in);
			answers[i] = letter;
			System.out.println();
		}
		//Create DriverExam object
		DriverExam test = new DriverExam(answers);
		
		//Determined if passed
		if(test.passed() == true) {
			System.out.println("You Passed!");
		}else {
			System.out.println("You Failed!");
		}
		
		//Display test score and information
		System.out.println("You had " + test.totalCorrect() + " correct answers and " + test.totalIncorrect() + " incorrect answers.");
		System.out.println("These are the questions you missed.");
		
		//Get array of wrong questions
		wrongQs = test.questionsMissed();
		if(test.totalIncorrect() > 0) {
			System.out.print("Q" + (wrongQs[0]+1)); //Formating Output
			for(int i=1; i<wrongQs.length; i++) {
				System.out.print(", ");
				System.out.print("Q" + (wrongQs[i]+1));
			}
		}else {
			System.out.println("You did not have any incorrect answers.");
		}
	}//main
	
	/**validateInput ensures user input is in correct format.
	 * 
	 * @param letter	input to be validated.
	 * @param in		Scanner object.
	 * @return			Validated input.
	 *													   */
	public static String validateInput(String letter, Scanner in) {
		while(!letter.equals("A") && !letter.equals("B") && !letter.equals("C") && !letter.equals("D")) {
			System.out.println("Error: Please enter A, B, C, or D");
			letter = in.next();
		}
		return letter;
	}//validateInput
}//DriverExamTester
