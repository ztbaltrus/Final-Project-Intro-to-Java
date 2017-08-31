/**Final Project: Account Owner
 * CIS 2571
 * @author Zachary Baltrus
 * @version 27Jul2017
 */
public class AccountOwner{
	private String firstName;
	private String lastName;
	private String address;
	
	//Constructor
	public AccountOwner(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
