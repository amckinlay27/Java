package q6_q7;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**<h1>Assignment 8 - Q6-q7: RetailTester</h1>
 * RetailTester simulates a customer making purchases.
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *	 	     										 			   */
public class RetailTester {
	
	/**main prompts the user for their purchase information to provide sale Receipt.
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//Declare and Initialize Variables and Objects
		Scanner in = new Scanner(System.in);
		PrintWriter pf = new PrintWriter("salesReceipt.txt");
		Retail_Item item1 = new Retail_Item("Jacket", 12, 59.95);
		Retail_Item item2 = new Retail_Item("Designer Jeans", 40, 34.95);
		Retail_Item item3 = new Retail_Item("Shirt", 20, 24.95);
		Retail_Item item4 = new Retail_Item("Other", 50, 39.99);
		CashRegister cr;
		String purchaseItem;
		int quant;
		
		//Get item.
		System.out.println("What would you like to purchase?");
		purchaseItem = in.nextLine();
		
		//Get quantity
		System.out.println("Enter the quantity of the purchase.");
		quant = in.nextInt();
		
		//Determine purchase information
		if(purchaseItem.equalsIgnoreCase("Jacket")){
			cr = new CashRegister(item1, quant);
			
			pf.println("***Sale Receipt***");
			pf.println("Unit price: $" + item1.getPrice());
			pf.println("Quantity: " +  quant);
			pf.printf("Subtotal: $%,.2f\n", cr.getSubTotal());
			pf.printf("Tax: $%,.2f\n", cr.getTax());
			pf.printf("Total: $%,.2f\n", cr.getTotal());
			
		} else if(purchaseItem.equalsIgnoreCase("Designer Jeans")) {
			cr = new CashRegister(item2, quant);
			
			pf.println("***Sale Receipt***");
			pf.println("Unit price: $" + item2.getPrice());
			pf.println("Quantity: " +  quant);
			pf.printf("Subtotal: $%,.2f\n", cr.getSubTotal());
			pf.printf("Tax: $%,.2f\n", cr.getTax());
			pf.printf("Total: $%,.2f\n", cr.getTotal());
			
		}else if(purchaseItem.equalsIgnoreCase("Shirt")){
			cr = new CashRegister(item3, quant);
			
			pf.println("***Sale Receipt***");
			pf.println("Unit price: $" + item3.getPrice());
			pf.println("Quantity: " +  quant);
			pf.printf("Subtotal: $%,.2f\n", cr.getSubTotal());
			pf.printf("Tax: $%,.2f\n", cr.getTax());
			pf.printf("Total: $%,.2f\n", cr.getTotal());
			
		}else {
			cr = new CashRegister(item4, quant);
			
			pf.println("***Sale Receipt***");
			pf.println("Unit price: $" + item4.getPrice());
			pf.println("Quantity: " +  quant);
			pf.printf("Subtotal: $%,.2f\n", cr.getSubTotal());
			pf.printf("Tax: $%,.2f\n", cr.getTax());
			pf.printf("Total: $%,.2f\n", cr.getTotal());
		}
		//Flush to file and close
		pf.flush();
		pf.close();
		
		//Display sales receipt
		System.out.println("***Sale Receipt***");
		System.out.printf("Subtotal: $%,.2f\n", cr.getSubTotal());
		System.out.printf("Tax: $%,.2f\n", cr.getTax());
		System.out.printf("Total: $%,.2f\n", cr.getTotal());
	}//main
}//RetailTester
