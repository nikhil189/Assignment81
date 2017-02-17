/**
 * 
 */
package acadglidAssignment;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Nikhil
 *
 */
public class Bank {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- To execute Bank Methods
	 * Return Type - void
	 */
	public static void main(String[] args)
	{
		try
		{
			BankAtm objBankAtm1 = new BankAtm(0, "ICICI", "Mahape", 20000);
			BankAtm objBankAtm2 = new BankAtm(1, "HDFC", "Vashi", 5000);
			BankAtm objBankAtm3 = new BankAtm(2, "CITI", "Thane", 25000);
			Map<String,Account> objMap = new HashMap<String,Account>(); // create an HashMap with bank name and associated Accounts
			objMap.put("ICICI", new Account("Ajay Singh","ICICI",5678,234567891,50000)); // Adding values in List fro associated Account Details with ICICI Bank
			objMap.put("HDFC", new Account("Nitish Rana", "HDFC",1234,345678921,100000)); // Adding values in List fro associated Account Details with CITI Bank
			objMap.put("CITI", new Account("Ajay Singh", "CITI",7890,456789321,5000)); // Adding values in List fro associated Account Details with CITI Bank
			System.out.println("Welcome to Common Bank Aplication.. Please select your bank 0 for ICICI, 1 for HDFC, 2 for CITI");
			Scanner objScanner = new Scanner(System.in);
			int iUserBankChoice  = objScanner.nextInt();
			switch(iUserBankChoice)
			{
				case 0 :
				{
					userOperation(objBankAtm1, objMap.get("ICICI")); // perform user operation on ICICI account
				}
				break;
				case 1: 
				{
					userOperation(objBankAtm2, objMap.get("HDFC")); // perform user operation on HDFC account
				}
				break;
				case 2:
				{
					userOperation(objBankAtm3, objMap.get("CITI")); // perfrom user operation on CITI account
				}
				break;
				default :
				{
					System.out.println("Sorry We do not provide service other than the listed banks");
				}
				
			}
			objScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	// Process User operation
	static void userOperation(BankAtm objBankAtm, Account objAccount)
	{
		try
		{
			System.out.println(" Hello  "+objAccount.getAccountHolderName()+"\n Welcome to " + objBankAtm.getBankName() + " Bank ATM");
			System.out.println("Please enter your ATM Pin");
			Scanner obj  = new Scanner(System.in);
			if(obj.nextInt()== objAccount.getATM_Pin())
			{
				System.out.println("Would you like to withdraw or Deposit? Please enter 1 for Withdraw and 2 for Deposit");
				switch(obj.nextInt())
				{
					case 1: 
					{
						objBankAtm.withdraw(10000); // checks if amount available in ATM is greater than 10000
						System.out.println("Please enter amount you want to withdraw");
						double amountToWithdraw = obj.nextDouble();
						objBankAtm.withdraw(amountToWithdraw); // withdraws amount soecified by user and withdraws that amount from user account
						objAccount.setBalance(objAccount.getBalance()-amountToWithdraw);
						System.out.println("Amount" + amountToWithdraw +"is withdrawn from  " +objBankAtm.getBankName() +"Account  number" +objAccount.getAccountNumber()+" from ATM located at"+objBankAtm.getLocation()+"and your updated account balance is" + objAccount.getBalance());
					}
					break;
					case 2 :
					{
						System.out.println("Please enter amount you want to deposit");
						int amountToDeposit = obj.nextInt();
						objBankAtm.deposit(amountToDeposit); // check if user input is correct
						objAccount.setBalance(objAccount.getBalance()+amountToDeposit); // updates account balance
						System.out.println("Amount" + amountToDeposit +"is deposited in your account  " +objBankAtm.getBankName() +"Account  number" +objAccount.getAccountNumber()+" from ATM located at"+objBankAtm.getLocation()+"and your updated account balance is" + objAccount.getBalance());
					}
					break;
					default :
					{
						System.out.println("Please enter a valid input");
					}
				}
			}
			else
			{
				System.out.println("Invalid PIN");
			}
			obj.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
