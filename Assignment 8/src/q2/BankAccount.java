package q2;

/** <h1>Assignment 8 - Q2: BankAccount</h1>
   The BankAccount class simulates a bank account.
*/
public class BankAccount{
   private double balance;      // Account balance

   /**
      This constructor sets the starting balance
      at 0.0.
   */
   public BankAccount(){
      balance = 0.0;
   }//BankAccount
   
   /**
      This constructor sets the starting balance
      to the value passed as an argument.
      @param startBalance The starting balance.
   */
   public BankAccount(double startBalance){
      balance = startBalance;
   }//BankAccount

   /**
      This constructor sets the starting balance
      to the value in the String argument.
      @param str The starting balance, as a String.
   */
   public BankAccount(String str){
      balance = Double.parseDouble(str);
   }//BankAccount
   
   /**BankAccount creates a copy of a BankAccount and its balance.
    * 
    * @param accountToCopy	The account to copy
    *															*/
   public BankAccount(BankAccount accountToCopy){
	   balance = accountToCopy.getBalance();
   }//BankAccount

   /**
      The deposit method makes a deposit into
      the account.
      @param amount The amount to add to the
      balance field.
   */
   public void deposit(double amount){
      balance += amount;
   }//deposit

   /**
      The deposit method makes a deposit into
      the account.
      @param str The amount to add to the
      balance field, as a String.
   */
   public void deposit(String str){
      balance += Double.parseDouble(str);
   }//deposit

   /**
      The withdraw method withdraws an amount
      from the account.
      @param amount The amount to subtract from
      the balance field.
   */
   public void withdraw(double amount){
      balance -= amount;
   }//withdraw

   /**
      The withdraw method withdraws an amount
      from the account.
      @param str The amount to subtract from
      the balance field, as a String.
   */
   public void withdraw(String str){
      balance -= Double.parseDouble(str);
   }//withdraw

   /**
      The setBalance method sets the account balance.
      @param b The value to store in the balance field.
   */
   public void setBalance(double b){
      balance = b;
   }//setBalance

   /**
      The setBalance method sets the account balance.
      @param str The value, as a String, to store in
      the balance field.
   */
   public void setBalance(String str){
      balance = Double.parseDouble(str);
   }//setBalance
   
   /**
      The getBalance method returns the
      account balance.
      @return The value in the balance field.
   */
   public double getBalance(){
      return balance;
   }//getBalance
}//BankAccount
