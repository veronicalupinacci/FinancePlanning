
import java.text.DecimalFormat;
import java.util.Scanner;

public class FinancialPlanChoice {
	 Scanner input = new Scanner(System.in);
	 double income, spending, savings, investing;
	 int choice;

	 public FinancialPlanChoice(double inputIncome, int firstChoice) {
		 this.income = inputIncome;
		 this.choice = firstChoice;
	 }
	 
	 public void choiceCheck() {
			//if statement o check for valid choice input
			if (choice == 1) {
				choiceOne();
			}
			else if (choice == 2) {
				choiceTwo();
			}
			else {
				invalidChoice();
			}
		}
	 
	 //method for invalid choice
	public int invalidChoice() {
			System.out.println("Invalid entry, pick again \n1) 75/15/10 \n2)50/30/20 \n(Write 1 or 2) ");
			choice = input.nextInt();
			choiceCheck();
			return choice;

	}
	
	//method for choice = 1
	public void choiceOne() {
		spending = (75 * income)/100;
		investing =  (15 * income)/100;
		savings = (10 * income)/100;
}
	
	//method for choice = 2
	public void choiceTwo() {
		spending = (50 * income)/100;
		investing =  (30 * income)/100;
		savings = (20 * income)/100;
}
	
	//override toString method
	public String toString() {
		String spendingString, investingString, savingString, out;
		DecimalFormat df = new DecimalFormat("####0.00");

		spendingString = ("You should spend max $" + df.format(spending));
		investingString = ("You should invest min $" + df.format(investing));
		savingString = ("You should save min $" + df.format(savings));
		out = spendingString + "\n" + investingString + "\n" + savingString;
		return out;
	}
}
