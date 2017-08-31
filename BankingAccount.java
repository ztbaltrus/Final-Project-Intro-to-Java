/**Final Project: BankingAccount
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
public abstract class BankingAccount implements Account{
	private String type;
	private double balance;
	private double annualPercentageYield;

	//Constructors
	public BankingAccount(String type, double balance, double annualPercentageYield) {
		super();
		this.type = type;
		this.balance = balance;
		this.annualPercentageYield = annualPercentageYield;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualPercentageYield() {
		return annualPercentageYield;
	}
	public void setAnnualPercentageYield(double annualPercentageYield) {
		this.annualPercentageYield = annualPercentageYield;
	}
	
	//Abstract methods used in the savings and checking class
	public abstract void depositAmount(double amount);
	public abstract void withdrawAmount(double withdraw);

	
}
