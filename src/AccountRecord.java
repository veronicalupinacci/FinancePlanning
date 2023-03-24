/**
 * This class keeps a record of the user data.
 * 
 *@author Veronica Lupinacci
 *@version Mar 24, 2023
 */
public class AccountRecord {
	//variables needed for the account
	protected int choice;
	private String username,lastName, firstName;
	private double income;

	
	public AccountRecord(String user, String fName, String lName, double incomeIn, int choiceIn) {
		username = user;
		firstName = fName;
		lastName = lName;
		income = incomeIn;
		choice = choiceIn;
	}
}
