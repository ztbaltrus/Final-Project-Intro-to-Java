/**Final Project: Savings
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
public class Savings extends BankingAccount{
	
	//Constructor
	public Savings(String type, double balance, double annualPercentageYield) {
		super(type, balance, annualPercentageYield);
	}

	//Override methods found the superclass as abstract methods
	
	@Override
	public String getAccountType() {
		return AccountType.SAVINGS;
	}

	@Override
	public double getAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
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
