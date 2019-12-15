package q5;

/**<h1>Assignment 8 - Q5: Month</h1>
 * Month creates a object that holds the month by its number.
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *	 	     										 	   */
public class Month {
	private int monthNumber;
	
	/**Create the Month object with default value.
	 * 
	 */
	public Month() {
		monthNumber = 1;
	}//Constructor
	
	/**Creates month object based on the months number.
	 * 
	 * @param monthNumber	The month of the year.
	 */
	public Month(int monthNumber) {
		if(monthNumber < 1 || monthNumber > 12) {
			this.monthNumber = 1;
		}else {
			this.monthNumber = monthNumber;
		}
	}//Constructor
	
	/**Creates a month object based on the months name.
	 * 
	 * @param month	The month's name.
	 */
	public Month(String month) {
		switch(month){
			case "January":
				monthNumber = 1;
				break;
			case "February":
				monthNumber = 2;
				break;
			case "March":
				monthNumber = 3;
				break;
			case "April":
				monthNumber = 4;
				break;
			case "May":
				monthNumber = 5;
				break;
			case "June":
				monthNumber = 6;
				break;
			case "July":
				monthNumber = 7;
				break;
			case "August":
				monthNumber = 8;
				break;
			case "September":
				monthNumber = 9;
				break;
			case "October":
				monthNumber = 10;
				break;
			case "November":
				monthNumber = 11;
				break;
			case "December":
				monthNumber = 12;
				break;
			default:
				monthNumber = 1;
				break;
		}
	}//Constructor
	
	/**getMonthNumber returns the months number.
	 * 
	 * @return The month's number.
	 */
	public int getMonthNumber() {
		return monthNumber;
	}//getMonthNumber

	/**setMonthNumber sets the month based on its integer representation.
	 * 
	 * @param monthNumber	The month's number.
	 */
	public void setMonthNumber(int monthNumber) {
		if(monthNumber < 1 || monthNumber > 12) {
			this.monthNumber = 1;
		}else {
			this.monthNumber = monthNumber;
		}
	}//setMonthNumber
	
	/**getMonthName returns the month's name.
	 * 
	 * @return	the month's name.
	 */
	public String getMonthName(){
		switch(monthNumber){
			case 1:
				return "January";
			case 2:
				return "February";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				return "January";
		}
	}//getMonthName
	
	@Override
	/**toString converts an object to string.
	 * 
	 */
	public String toString(){
		return "The month is " + this.getMonthName();
	}//toString
	
	/**equals determines if two months objects contents are equal.
	 * 
	 * @param m	The comparing month.
	 * @return	Evaluated expression.
	 */
	public boolean equals(Month m){
		return this.monthNumber == m.getMonthNumber();
	}//equals
	
	/**greaterThan determines if one month is greater than another month.
	 * 
	 * @param m	The comparing month.
	 * @return	Evaluated expression.
	 */
	public boolean greaterThan (Month m){
		return m.getMonthNumber() > this.monthNumber;
	}//greaterThan
	
	/**lessThan determines if one month is less than another month.
	 * 
	 * @param m	The comparing month.
	 * @return	Evaluated expression.
	 */
	public boolean lessThan(Month m){
		return m.getMonthNumber() < this.monthNumber;
	}//lessThan
}//Month