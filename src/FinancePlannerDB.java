import java.util.Scanner;

public class FinancePlannerDB {
	Scanner input = new Scanner(System.in);
	double income;
	int choice;
	String username, firstName, lastName;
	AccountRecord acct;

	public void processRecords() {
		boolean again = true;
		System.out.println("Welcome to the financial planning system");

		while (again) {
			System.out.println("\nPlease enter: \"n\" if for a new customer \"a\" to access existing customer or \"q\" to quit.");
			String command = input.next();
			if (command.equalsIgnoreCase("n")) {
				addCostumer();
			} else if (command.equalsIgnoreCase("a")) {
				accessCostumer();
			} else if (command.equalsIgnoreCase("q")) {
				System.out.println("Thank you for using the financial planning system.");
				again = false;
			}
		}
	}

	private void accessCostumer() {
		// TODO Auto-generated method stub
		
	}

	private void addCostumer() {
		getUserData();

	}

	private void getUserData() {
		System.out.println("Enter your data here. ");

		System.out.println("Please input your first name: ");
		firstName = input.next();
		System.out.println("Please input your last name: ");
		lastName = input.next();
		System.out.println("Please pick a username: ");
		username = input.next();
		System.out.println("Please input your income: ");
		income = input.nextDouble();
		System.out.println("1) 75/15/10 \n2)50/30/20 \nPlease input your choice: (Write 1 or 2) ");
		choice = input.nextInt();
		
		PlanChoice test = new PlanChoice(income, choice);
		test.choiceCheck();	
		acct = new AccountRecord(username, lastName, firstName, income, choice);
		System.out.println("Based on your entries: ");
		System.out.printf(test.toString());
	}
	
}