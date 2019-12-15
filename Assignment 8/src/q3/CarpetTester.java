package q3;
import java.util.Scanner;

/**<h1>Assignment 8 - Q3: CarpetTester</h1>
 * CarpetTester uses RoomCarpet and RoomDimension objects to allow users to determine the cost to carpet a room that is user specified.
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *																				 	     										 	 */
public class CarpetTester {

	/**main prompts user for room dimensions and displays cost and area of a room.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare and Initialize Objects and Variables 
		Scanner in = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double costPerSqF = 0.0;
		double area = 0.0;
		double cost = 0.0;
		
		//Get length
		System.out.println("Welcome!");
		System.out.println("Please enter the lenght of the room in ft.");
		length = in.nextDouble();
		length = validateNum(length, in);
		
		//Get width
		System.out.println("Please enter the width of the room in ft.");
		width = in.nextDouble();
		width = validateNum(width, in);
		
		//Get cost
		System.out.println("What is the cost of the carpert per square foot?");
		costPerSqF = in.nextDouble();
		costPerSqF = validateNum(costPerSqF, in);
		
		//Declare and Initialize room size and cost
		RoomDimension rd = new RoomDimension(length, width);
		RoomCarpet rc = new RoomCarpet(rd, costPerSqF);
		
		area = rd.getArea();
		cost = rc.getTotalCost();
		
		//Display Output
		System.out.println("\n*****Summary*****");
		System.out.println(rd.toString());
		System.out.printf("The area of the room is %.2f.\n", area);
		System.out.println(rc.toString());
		System.out.printf("The total cost for new flooring is $%,.2f.", cost);

	}//main
	
	/**validateNum check to ensure valid entries are accepted.
	 *
	 * @param num	the number to be validated.
	 * @param in	the Scanner object.
	 * @return		The validated number.
	 */
	public static double validateNum(double num, Scanner in){
		while(num <= 0){
			System.out.println("Error: Please enter a number that is greater than 0");
			num = in.nextDouble();
		}
		return num;
	}//validateNum
}//CarpetTester
