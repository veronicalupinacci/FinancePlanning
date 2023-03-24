/**
 * This class keeps a database of the FinancePlanner app.
 * 
 *@author Veronica Lupinacci
 *@version Mar 24, 2023
 */

import java.util.Scanner;

public class FinancePlannerDB {
	//instance variables
	Scanner input = new Scanner(System.in);
	double income;
	int choice;
	String username, firstName, lastName;
	AccountRecord acct;

	public void processRecords() {
		boolean again = true;
		System.out.println("Welcome to the financial planning system"); //welcome message

		//loop for the main choices available
		while (again) {
			System.out.println("\nPlease enter: \"n\" if for a new customer \"a\" to access existing customer or \"q\" to quit.");
			String command = input.next();
			//if statement to add a new customer
			if (command.equalsIgnoreCase("n")) {
				addUser();
			//if statement to access the customer data
			} else if (command.equalsIgnoreCase("a")) {
				accessUser();
			//if statement to end the program
			} else if (command.equalsIgnoreCase("q")) {
				System.out.println("Thank you for using the financial planning system.");
				again = false;
			}
		}
	}

	//method to access the user data
	private void accessUser() {
		// TODO Auto-generated method stub
		
	}
	
	//method to add a new user
	private void addUser() {
		getUserData();
	}

	//gather user data
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
		//get the plan chosen
		System.out.println("1) 75/15/10 \n2)50/30/20 \nPlease input your choice: (Write 1 or 2) ");
		choice = input.nextInt();
		
		//create object for the specific choice
		PlanChoice test = new PlanChoice(income, choice);
		test.choiceCheck();	
		
		//create new account
		acct = new AccountRecord(username, lastName, firstName, income, choice);
		
		//print out the result of the plan choice
		System.out.println("Based on your entries: ");
		System.out.printf(test.toString());
	}
	
}