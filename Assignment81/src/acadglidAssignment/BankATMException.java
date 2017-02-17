/**
 * 
 */
package acadglidAssignment;

/**
 * @author nikhil13686
 *
 */
public class BankATMException extends RuntimeException
{ 
	/**
	 * default SerialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String message; // Message to be displayed in case of Exception
	
	public BankATMException(String message) // constructor to initilaize exception message
	{ 
		this.message = message; 
	} 
	
	public BankATMException(Throwable cause, String message)  
	{ 
		super(cause); 
		this.message = message; 
	} 
	
	public String getMessage()  // overriding getMEssage for Exception
	{ 
		return message; 
	} 
}


