/**Final Project: AccountInfo
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
import java.util.List;

public class AccountInfo {
	private String accountId;
	private AccountOwner accountOwner;
	private List<Account> accounts;
	
	//Constructor
	public AccountInfo(String accountId, AccountOwner accountOwner, List<Account> accounts) {
		super();
		this.accountId = accountId;
		this.accountOwner = accountOwner;
		this.accounts = accounts;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public AccountOwner getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(AccountOwner accountOwner) {
		this.accountOwner = accountOwner;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public void addAccount(Account accnt){
		accounts.add(accnt);
	}
	
}
