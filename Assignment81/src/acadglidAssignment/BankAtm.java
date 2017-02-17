/**
 * 
 */
package acadglidAssignment;

/**
 * @author nikhil
 *
 */
class BankAtm
{
	private int atmId; // variable to assign unique ID to each ATM
	private String BankName; // variable to store bank name with which atm is associated
	private String location; // varable to store location
	private double balance; // balance in atm
	BankAtm(int atmId,String BankName,String location,double balance) // constructor to initilailze attributes associated with ATM
	{
		this.setAtmId(atmId);
		this.setBankName(BankName);
		this.setLocation(location);
		this.balance = balance;
	}
	// Withdraw method to throw BankATMException if Balance is less Tahn 10000 or amount to be withdrawn is greater than the balance 
	public void withdraw(double amount) throws BankATMException 
	{ 
		if (amount > balance || balance < 10000) {
			if(balance <10000)
			{
				throw new BankATMException(String.format("Atm does not have sufficient funds"));
			}
			else
			{
				throw new BankATMException(String.format("Current balance in your account is less than requested amount"));
			}
		}
		else
		{
			this.balance = this.balance - amount;
			
		}
		
	}
// implementing deposit method for bank
	public void deposit(int amount) 
	{
		if (amount <= 0) // check if user enters negative value
		{
			throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount));
		}
		
	}
	/**
	 * @return the atmId
	 */
	public int getAtmId() {
		return atmId;
	}
	/**
	 * @param atmId the atmId to set
	 */
	public void setAtmId(int atmId) {
		this.atmId = atmId;
	}
	/**
	 * @return the atmId
	 */
	public String getBankName() {
		return BankName;
	}
	/**
	 * @param atmId the atmId to set
	 */
	public void setBankName(String BankName) {
		this.BankName = BankName;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
}
