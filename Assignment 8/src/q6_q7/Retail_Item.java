package q6_q7;

/**<h1>Assignment 8 - Q6: Retail_Item</h1>
 * Retail_Item creates a object that holds a product description, number on hand, and the price per unit.
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *	 	     										 	   											   */
public class Retail_Item {
	private String description;
	private int unitsOnHand;
	private double price;
	
	/**Constructor accepts a description, number on hand, and the price of a item to intial the object.
	 * 
	 * @param des		Product description.
	 * @param onHand	Quantity on hand.
	 * @param price		Cost per unit.
	 */
	public Retail_Item(String des, int onHand, double price) {
		setDescription(des);
		setUnitsOnHand(onHand);
		this.setPrice(price);
	}//Constructor

	/**getDescription returns products description.
	 * 
	 * @return	The product description.
	 */
	public String getDescription() {
		return description;
	}//getDescription
	
	/**getUnitsOnHand returns the quantity on hand.
	 * 
	 * @return	The quanity on hand.
	 */
	public int getUnitsOnHand() {
		return unitsOnHand;
	}//getUnitsOnHand
	
	/**getPrice returns the price of a item.
	 * 
	 * @return	Price of an item.
	 */
	public double getPrice() {
		return price;
	}//getPrice

	/**setDescription sets the products description.
	 * 
	 * @param description	The description for the product.
	 */
	public void setDescription(String description) {
		this.description = description;
	}//setDescription

	/**setUnitsOnHand sets the quantity on hand.
	 * 
	 * @param unitsOnHand	The quantity on hand for the product.
	 */
	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}//setUnitsOnHand

	/**setPrice sets the price of an item.
	 * 
	 * @param price	The price for an item.
	 */
	public void setPrice(double price) {
		this.price = price;
	}//setPrice
}//Retail_Item
