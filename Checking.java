/**Final Project: Checking
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
public class Checking extends BankingAccount{
	
	//Constructor
	public Checking(String type, double balance, double annualPercentageYield) {
		super(type, balance, annualPercentageYield);
	}

	//Override methods found the superclass as abstract methods
	
	@Override
	public String getAccountType() {
		return AccountType.CHECKINGS;
	}

	@Override
	public double getAccountBalance() {
		return super.getBalance();
	}

	@Override
	public void depositAmount(double amount) {
		double newBalance = super.getBalance() + amount;
		super.setBalance(newBalance);
	}

	@Override
	public void withdrawAmount(double withdraw) {
		double newBalance = super.getBalance() - withdraw;
		super.setBalance(newBalance);
	}
}
