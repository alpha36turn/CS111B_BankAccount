// Cheuk Tam and Angel Conoz
// The Bank class simulates a bank account

public class Bank  {

// Instance Data Variables
   private String name;
   private String id;
   private double balance;
   private double interest;
   
// Constructor
   public Bank(String initialName, String initialId, double initialBalance, double initialInterest) {
      name = initialName;
      id = initialId; 
      if (initialBalance > 0.0) { //ensures the balance is positive to begin with
         balance = initialBalance;
         }
      if (initialInterest > 0.0) { //ensures the interest rate is positive
         interest = initialInterest;
         } 
   }
//Getters
  public String getName() {
      return name;
  }    
  public String getId() {
      return id;
  }
  public double getBalance() {
      return balance;
  }
  public double getInterest() {
      return interest;    
  }  
   
 //setters
   public void setName (String newName)  {
      name = newName;
   }
   
   public void setId (String newId)  {
      id = newId;
   }
   
   public void setBalance (double newBalance)  {
	      if (newBalance > 0.0) { //ensures the balance is positive to begin with
	          balance = newBalance;
	          }
      
   }   
   
   public void setInterest (double newInterest)  {
      interest = newInterest;
   }   
   
  
  //toString method displays account information.
   public String toString()  {
      String s = ("Name: " + name);
      s += ("\n" + "Account: " + id);
      s += ("\n" + "Balance: " + "$" + balance);
      s += ("\n" + "Interest: " + interest + "%" + "\n");
      
      return s;
      }   
}   


