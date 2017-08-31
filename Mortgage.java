/**Final Project: Mortgage
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
public class Mortgage extends LoanAccount{
	private double initialAmount;
	private int termInMonths;
	
	//Constructor
	public Mortgage(String type, double balance, double interestRate, double initialAmount, int termInMonths) {
		super(type, balance, interestRate);
		this.initialAmount = initialAmount;
		this.termInMonths = termInMonths;
	}
	public double getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}
	public int getTermInMonths() {
		return termInMonths;
	}
	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}

	//Override methods found the superclass as abstract methods
	
	@Override
	public String getAccountType() {
		return AccountType.MORTGAGE;
	}

	@Override
	public double getAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void applyPayment(double amount) {
		double newBalance = super.getBalance() - amount;
		super.setBalance(newBalance);
		
	}

}
