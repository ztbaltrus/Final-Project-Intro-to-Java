/**Final Project: LoanAccount
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
public abstract class LoanAccount implements Account{
	private String type;
	private double balance;
	private double interestRate;
	
	//Constructor
	public LoanAccount(String type, double balance, double interestRate) {
		super();
		this.type = type;
		this.balance = balance;
		this.interestRate = interestRate;
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
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//Abstract Method
	public abstract void applyPayment(double amount);
}
