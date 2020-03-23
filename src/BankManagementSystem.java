import java.util.*;
/*
 * @author Red Team
 * Sam Allen
 * Zachary Clevenger
 * Amber Ferrebee
 * Angela Johnson
 * Bethanie Munkres
 */
public class BankManagementSystem {

	// will probably change this later to be more like useCars we turned in but for now
	// this is easier to get done
	static ArrayList<Account> accountArray = new ArrayList<Account>();
	/*
	 * Come back later- create accountOwners class?
	 */
	
	public static void main(String[] args) {
		// will create menu/case/switch later
		//System.out.println("Main Menu");
		//System.out.println("*********");
		//System.out.println("1.) Create Checking Account");
		//System.out.println("2.) Create Gold Account");
		//System.out.println("3.) Create Regular Account");
		//System.out.println("4.) Delete Account");
		//System.out.println("5.) Deposit Funds");
		//System.out.println("6.) Withdraw Funds");
		//System.out.println("7.) Perform End of Month Functions");
		//System.out.println("8.) Display Bank Statistics");
		
		// call method to create checking account
		System.out.println("Test");
		accountArray.add(createCheckingAccount());	
		System.out.println("Test");
		// call method to create Gold account
		
		// call method to create Regular account
		
		// delete account
		
	}
	// Create Checking account
	public static Checking createCheckingAccount() {
		@SuppressWarnings("resource")
		Scanner in  = new Scanner(System.in);
		Checking newChecking = new Checking();
		/**
		 * 
		 * come back here later **********************************************
		// should account number be randomly generated or manually assigned //
		*/
		// get account number
		System.out.println("Please enter an account number: ");
		while (!in.hasNextInt()) {
			System.out.println("That input was not correct.  Please enter an integer" + 
		" for the account number: ");
			in.next();
		}
		int accountNumber = in.nextInt();
		newChecking.setAcctNum(accountNumber);
		
		/** 
		 * Same question as above for customer number as account number
		 * kind of - here we could split off with question of whether existing
		 * customer or not... ask for number if already exists
		 * generate random number within limits if new customer
		 */
		// get customer number
		System.out.println("Please enter customer number: ");
		while (!in.hasNextInt()) {
			System.out.println("That input was not correct.  Please enter an integer" + 
		" for the customer number: ");
		in.next();
		}
		int customerNumber = in.nextInt();
		newChecking.setCustNum(customerNumber);
		
		// get starting balance
		System.out.println("Please enter the starting balance: ");
		while (!in.hasNextDouble()) {
		System.out.println("That input was not correct.  Pleaseenter a dollar amount " + 
		" using the format \"0.00\" for the starting balance: ");
		in.next();
		}
		double startingBal = in.nextDouble();
		newChecking.setBal(startingBal);
		
		// get customer name
		System.out.println("Please enter the customer's name: ");
		String customerName = in.nextLine();
		newChecking.setCustName(customerName);
		in.nextLine();
		
		// get customer address
		System.out.println("Please enter the customer's address: ");
		String customerAddress = in.nextLine();
		newChecking.setCustAddy(customerAddress);
		
		// get customer phone
		System.out.println("Please enter the customer's phone number: ");
		String customerPhone = in.nextLine();
		newChecking.setCustPhone(customerPhone);
		
		return newChecking;
		
	}
		
	// Create Gold account
	public static void createGoldAccount() {
		
	}
	// Create Regular account
	public static void createRegularAccount() {
		
	}
	// Delete account
	public static void deleteAccount() {
		
	}
	// Deposit funds
	public static void depositFunds() {
		
	}
	// Withdraw funds
	public static void withdrawFunds() {
		
	}
	// Perform end of month functions
	// should be used once every end of month
	// apply interest to the regular and gold accounts
	// deduct transaction fees from Checking accounts whenever applicable
	public static void performEOM() {
		
	}
	// Display bank stats including:
	// total sum of all accounts
	// number of zero-balance accounts
	// average balance of accounts
	// account with the largest balance
	// additional features to impress our professor :)
	public static void displayBankStats() {
		
	}
	    
}