package q18;

/**<h1>Assignment 7: Question 18 ~ PhoneBookEntry</h1>
 * PhoneBookEntry creates a PhoneBookEntry object that stores a persons name and phone number.
 * @author Adam McKinlay ~ c0656685
 * @since March 26, 2019
 * 
 *																							*/
public class PhoneBookEntry {
	/*Properities*/
	private String name;
	private String number;
	
	/*Constructor*/
	/**PhoneBookEntry constructs the object given a name and number.
	 * 
	 * @param name		Persons name.
	 * @param number	Persons number.
	 *															   */
	public PhoneBookEntry(String name, String number) {
		this.setName(name);
		this.setNumber(number);
	}//PhoneBookEntry

	/*Accessors*/
	/**getName returns a persons name.
	 * 
	 * @return	a persons name.
	 *								*/
	public String getName() {
		return name;
	}//getName
	
	/**getNumber returns a persons number.
	 * 
	 * @return	a phone number.
	 *									*/
	public String getNumber() {
		return number;
	}//getNumber

	/*Modifiers*/
	/**setName sets the PhoneBookEntry name.
	 * 
	 * @param name	name to set.
	 *									  */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	/**setNumber sets the PhoneBookEntry number.
	 * 
	 * @param number	number to set.
	 *										  */
	public void setNumber(String number) {
		this.number = number;
	}//setNumber
}//PhoneBookEntry
