/**
 * 
 */
package acadglidAssignment;

/**
 * @author nikhil
 *
 */
public class Account 
{
	private String AccountHolderName; // creating a bank Account with Attributes
	private String BankName; // bank name of associated account
	private int ATM_Pin; // ATM _PIN of associated account
	private int AccountNumber; // account Number of Associated Account
	private double balance;
	 Account(String AccountHolderName,String BankName, int ATM_Pin,int AccountNumber,double Balance)
	 {
		 this.setAccountHolderName(AccountHolderName);
		 this.setATM_Pin(ATM_Pin);
		 this.setBankName(BankName);
		 this.setAccountNumber(AccountNumber);
		 this.setBalance(Balance);
	 }
	/**
	 * @return the accountHolderName
	 */
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	/**
	 * @param accountHolderName the accountHolderName to set
	 */
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return BankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	/**
	 * @return the aTM_Pin
	 */
	public int getATM_Pin() {
		return ATM_Pin;
	}
	/**
	 * @param aTM_Pin the aTM_Pin to set
	 */
	public void setATM_Pin(int aTM_Pin) {
		ATM_Pin = aTM_Pin;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return AccountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
