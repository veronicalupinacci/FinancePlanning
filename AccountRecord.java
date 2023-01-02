
public class AccountRecord {
	// The 9 digit account number used to reference the credit card.
	protected int accountNumber, choice;
	// The last name of the credit card owner.
	private String username,lastName, firstName;
	// The credit limit of the credit card.
	private double income;

	
	public AccountRecord(String user, String fName, String lName, double incomeIn, int choiceIn) {
		username = user;
		firstName = fName;
		lastName = lName;
		income = incomeIn;
		choice = choiceIn;
	}
}
