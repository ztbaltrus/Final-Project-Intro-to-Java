/**Final Project: Account Test
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		
		//Population of the constructors for the following classes
		AccountOwner owner = new AccountOwner("Elivs", "Presley", "999 Tender Lane \nMemphis, TN 98765");
		Savings ownerSavings = new Savings("Savings", 2250.00, 0.5);
		Checking ownerChecking = new Checking("Checking", 874.41, 0.75);
		Mortgage ownerMortgage = new Mortgage("Mortgage", 48670.95, 4.75, 50000.00, 12);
		AccountInfo ownerInfo = new AccountInfo("9876543", owner, accounts);
		
		//Adding accounts to List in the AccountInfo class
		ownerInfo.addAccount(ownerSavings);
		ownerInfo.addAccount(ownerChecking);
		ownerInfo.addAccount(ownerMortgage);

		//Creating a string builders and populating them from lines 29 - 41
		StringBuilder nameInfo = new StringBuilder(owner.getLastName() + ", " + owner.getFirstName());
		nameInfo.append("\n" + owner.getAddress());
		
		StringBuilder bankingInfo = new StringBuilder("\nBANKING \t Balance    APY\n\n");
		bankingInfo.append(ownerChecking.getAccountType() + "\t $" + ownerChecking.getBalance() + "    " + ownerChecking.getAnnualPercentageYield() +"%\n");
		bankingInfo.append(ownerSavings.getAccountType() + "\t\t $" + ownerSavings.getBalance() + "    " + ownerSavings.getAnnualPercentageYield() + "%\n");
		bankingInfo.append("Banking Balance: $" + (ownerChecking.getBalance() + ownerSavings.getBalance()) + "\n");
		
		StringBuilder loanInfo = new StringBuilder("LOAN \t\t Balance     Loan Amount    Rate    Term(mos.)\n");
		loanInfo.append(ownerMortgage.getAccountType() + "\t $" + ownerMortgage.getBalance() + "   " + ownerMortgage.getInitialAmount() + "\t    " + 
		ownerMortgage.getInterestRate() + "     " + ownerMortgage.getTermInMonths());
		
		System.out.println(nameInfo + "\n" + bankingInfo + "\n" + loanInfo);
		
		Scanner accountInput = new Scanner(System.in);
		System.out.println("What account would you like to add money too?");
		String accountInputChoice = accountInput.nextLine().toUpperCase();
		
		//Switch statements used for input choices in the banking accounts.
		switch(accountInputChoice){
		case "CHECKING":
			System.out.println("How much would you like to add to your checking account?");
			Scanner amountToAddToCheck = new Scanner(System.in);
			double amountInCheck = amountToAddToCheck.nextDouble(); 
			ownerChecking.depositAmount(amountInCheck);
			double newCheckAmount = ownerChecking.getBalance();
			System.out.println("Checking Account: $" + newCheckAmount);
			break;
		case "SAVINGS":
			System.out.println("How much would you like to add to your savings account?");
			Scanner amountToAddToSave = new Scanner(System.in);
			double amountInSave = amountToAddToSave.nextDouble(); 
			ownerSavings.depositAmount(amountInSave);
			double newSaveAmount = ownerSavings.getBalance();
			System.out.println("Savings Account: $" + newSaveAmount);
			break;
		
		}
		//Lines 68 - 78 deal with payment of the mortgage
		Scanner mortgagePayment = new Scanner(System.in);
		System.out.println("Would you like to pay off any of your mortgage?");
		String mortgagePaymentInput = mortgagePayment.nextLine();
		
		if (mortgagePaymentInput.equalsIgnoreCase("Yes")){
			Scanner loanPaymentInput = new Scanner(System.in);
			System.out.println("How much of your loan would you like to pay off?");
			double loanPayment = loanPaymentInput.nextDouble();
			ownerMortgage.applyPayment(loanPayment);
		}
		System.out.println("Your remaining loan balance is: $" + ownerMortgage.getBalance());
		
		//Lines 81- 109 deal with withdrawing money.
		System.out.println("Would you like to take any money out?");
		Scanner withdrawInput = new Scanner(System.in);
		String withdrawChoice = withdrawInput.nextLine();
		
		if (withdrawChoice.equalsIgnoreCase("Yes")){
			System.out.println("What banking account would you like to take money out of?\n");
			Scanner withdrawAccountTypeInput = new Scanner(System.in);
			String withdrawAccountType = withdrawAccountTypeInput.nextLine().toUpperCase();
			
			switch(withdrawAccountType){
			case "CHECKING":
				System.out.println("How much would you like to take from your checking account?\n");
				Scanner checkWithdrawInput = new Scanner(System.in);
				double checkWithdraw = checkWithdrawInput.nextDouble();
				ownerChecking.withdrawAmount(checkWithdraw);
				double newWithdrawCheck = ownerChecking.getBalance();
				System.out.println("Your new balance in your checking account is: $" + newWithdrawCheck+"\n");
				break;
			case "SAVINGS":
				System.out.println("How much would you like to take from your savings account?\n");
				Scanner saveWithdrawInput = new Scanner(System.in);
				double saveWithdraw = saveWithdrawInput.nextDouble();
				ownerSavings.withdrawAmount(saveWithdraw);
				double newWithdrawSave = ownerSavings.getBalance();
				System.out.println("Your new balance in your savings account is: $" + newWithdrawSave + "\n");
				break;
			}
			System.out.println("Banking Balance: $" + (ownerChecking.getBalance() + ownerSavings.getBalance()) + "\n");
			withdrawAccountTypeInput.close();
		}
		accountInput.close();
		mortgagePayment.close();
		withdrawInput.close();
		
	}

}
