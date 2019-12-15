package q6_q7;

/**<h1>Assignment 8 - Q6: CashRegister</h1>
 * CashRegister creates a object that holds a Reail_Item, tax rate, and quantity.
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *	 	     										 	  					   */
public class CashRegister {
	private static final double TAX = 0.06;
	private Retail_Item item;
	private int quantity;
	
	/**Constructor accepts a Retail_Item and purchase quantity to initialize the object.
	 * 
	 * @param item		The Retial_Item being purchased.
	 * @param quantity	The quantity of Retail_Item purchased.
	 */
	public CashRegister(Retail_Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}//Constructor
	
	/**getSubTotal returns the purchase subtotal.
	 * 
	 * @return	The purchase subtotal.
	 */
	public double getSubTotal() {
		return quantity * item.getPrice();
	}//getSubTotal
	
	/**getTax returns the tax of the sale.
	 * 
	 * @return	The tax of the sale.
	 */
	public double getTax() {
		return ((this.getSubTotal())* TAX);
	}//getTax
	
	/**getTotal	returns the total cost of a purchase.
	 * 
	 * @return	The total cost of a purchase.
	 */
	public double getTotal() {
		return this.getSubTotal() + this.getTax();
	}//getTotal
}//CashRegister
