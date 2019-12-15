package q16;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**<h1>Assignment 7: Question 16 ~ WorldSeriesChamps</h1>
 * WorldSeriesChamps is a program that determines how many times a team has won the World Series.
 * @author Adam McKinlay ~ c0656685
 * @since March 26, 2019
 * 
 *																							    */
public class WorldSeriesChamps {

	/**main reads a file to build an ArrayList of all winners in order to determine how times a team has won.
	 * 
	 * @param args						Arguments.
	 * @throws FileNotFoundException	Does not find file.
	 *																									   */
	public static void main(String[] args) throws FileNotFoundException {
		//Declare and initialize variables and objects
		File f = new File("WorldSeriesWinners.txt");
		ArrayList<String> winners = new ArrayList<String>();
		Scanner readFile = new Scanner(f);
		Scanner in = new Scanner(System.in);
		String team;
		int occurrences = 0;

		//Read in data
		while(readFile.hasNext()) {
			winners.add(readFile.nextLine());
		}
		readFile.close();
		
		//Get team name from user
		System.out.println("Enter a team.");
		team = in.nextLine();
		
		//Find number of occurrences 
		for(int i=0; i<winners.size(); i++) {
			if(winners.get(i).equalsIgnoreCase(team)) {
				occurrences +=1;
			}
		}
		
		//Display and format output
		if(occurrences > 1 || occurrences == 0) {
			System.out.println("The " + team + " have won the world series " + occurrences + " times.");
		}else {
			System.out.println("The " + team + " have won the world series " + occurrences + " time.");
		}
	}//main
}//WorldSeriesChamps
