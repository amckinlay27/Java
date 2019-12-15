package q17;
import java.util.Random;
import java.util.Scanner;

/**<h1>Assignment 7: Question 17 ~ ArrayOperationsTester</h1>
 * ArrayOperationsTester is a program that builds a 2D array and exmaines the data it contains.
 * @author Adam McKinlay ~ c0656685
 * @since March 26, 2019
 * 
 *																							  */
public class ArrayOperationsTester {
	
	/**main creates and fills elements in the 2D array and call methods to analyze the 2D array.
	 * 
	 * @param args Arguments.
	 *
	 *																						  */
	public static void main(String[] args) {
		//Declare and initialize variables and objects
		int[][] numbers = new int[20][5];
		Random ran = new Random();
		Scanner in = new Scanner(System.in);
		int row, col;
		int num;
		
		//Fill Values in 2D array
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				num = ran.nextInt(100) +1;
				numbers[i][j] = num;
			}
		}
		
		//Display table
		System.out.println("Table:");
		printTable(numbers);
		
		//Get row
		System.out.println("Please enter a row. 1-20");
		row = in.nextInt();
		
		//Validate row
		while(row < 0 || row > 20) {
			System.out.println("Error: Please enter a number from 1-20.");
			row = in.nextInt();
		}
		
		//Get column
		System.out.println("Please enter a column. 1-5");
		col = in.nextInt();

		//Validate column
		while(col < 0 || col > 5) {
			System.out.println("Error: Please enter a number from 1-20.");
			col = in.nextInt();
		}
		
		//Display 2D array information
		System.out.println("\n\n*********Table Information*********\n");
		System.out.println("The total of all values is: " + getTotal(numbers));
		System.out.println("The average of all values is: "+ getAverage(numbers));
		System.out.println("The total for row " + row + " is: " + getRowTotal(numbers, row-1));
		System.out.println("The total for column " + col + " is: " + getColumnTotal(numbers, col-1));
		System.out.println("The highest value in row " + row + " is: " + getHighestInRow(numbers, row-1));
		System.out.println("The lowest value in row " + row + " is: " + getLowestInRow(numbers, row-1));
	}//main
	
	/**getTotal returns the total sum of all elements in the 2D array. 
	 * 
	 * @param numbers	2D array.
	 * @return			the sum of the row.
	 *																*/
	public static int getTotal(int[][] numbers){
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum += numbers[i][j];
			}
		}
		return sum;
	}//getTotal
	
	/**getAverage returns the total average of all elements in the 2D array. 
	 * 
	 * @param numbers	2D array.
	 * @return			the average of the row.
	 *														 			  */
	public static double getAverage(int[][] numbers) {
		int sum = 0;
		int counter = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum += numbers[i][j];
				counter++;
			}
		}
		return sum/(double)counter;
	}//getAverage
	
	/**getRowTotal returns the total sum of a user defined row.
	 * 
	 * @param numbers	2D array.
	 * @param row		user defined row.
	 * @return			the sum of the row.
	 *														 */
	public static int getRowTotal(int[][] numbers, int row) {
		int rowTotal = 0;
		
		for(int i=0; i<numbers[row].length; i++) {
			rowTotal += numbers[row][i];
		}
		return rowTotal;
	}//getRowTotal
	
	/**getColumnTotal returns the total sum of a user defined column.
	 * 
	 * @param numbers	2D array.
	 * @param col		user defined column.
	 * @return			the sum of the column.
	 *															   */
	public static int getColumnTotal(int[][] numbers, int col) {
		int colTotal = 0;
		
		for(int i=0; i<numbers.length; i++) {
			colTotal += numbers[i][col];
		}
		return colTotal;
	}//getColumnTotal
	
	/**getHighestInRow returns the highest number in a user specified row.
	 * 
	 * @param numbers	the 2D array.
	 * @param row		the user defined row.
	 * @return			the highest number.
	 *																 */
	public static int getHighestInRow(int[][] numbers, int row) {
		int highest = 0;
		
		for(int i=0; i<numbers[row].length; i++) {
			if(numbers[row][i] > highest) {
				highest = numbers[row][i];
			}
		}
		return highest;
	}//getHighestInRow
	
	/**getLowestInRow returns the lowest number in a user specified row.
	 * 
	 * @param numbers	the 2D array.
	 * @param row		the user defined row.
	 * @return			the lowest number.
	 *																 */
	public static int getLowestInRow(int[][] numbers, int row) {
		int lowest = 101;
		
		for(int i=0; i<numbers[row].length; i++) {
			if(numbers[row][i] < lowest) {
				lowest = numbers[row][i];
			}
		}
		return lowest;
	}//getLowestInRow
	
	/**printTable displays a 2D array to the console.
	 * 
	 * @param table	2D array.
	 *											   */
	public static void printTable(int[][] table) {
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}//printTable
}//ArrayOperationsTester
