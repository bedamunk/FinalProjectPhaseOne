

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	
	// instance variables
	
	ArrayList<Account> accountsList = new ArrayList<Account>();
	
	// default constructor
	
	Bank() {
		
	}
	
	public void createChecking() {
		Account newAccount = new Checking(createCustomer());
		this.accountsList.add(newAccount);
	}

	public void createGold() {
		Account newAccount = new Checking(createCustomer());
		this.accountsList.add(newAccount);
	}

	public void createRegular() {
		Account newAccount = new Checking(createCustomer());
		this.accountsList.add(newAccount);
	}

	public Account createAccount(int accountType) {
		Account newAccount = new Account(createCustomer());
		Scanner in = new Scanner(System.in);
		int inputInt;
		double inputDouble;
		System.out.print("Enter starting balance: ");
		inputDouble = in.nextDouble();
		newAccount.setBalance(inputDouble);
		System.out.printf("The randomly generated Account Number is: %d\n", newAccount.getAccountNumber());
		switch(accountType) {
			case 1:
				return new Checking(newAccount);
			case 2:
				return new Gold(newAccount);
			case 3:
				return new Regular(newAccount);
		}
		return null;
	}
	
	public Customer createCustomer() {
		Customer newCustomer = new Customer();
		Scanner in = new Scanner(System.in);
		String inputString;
		int inputInt;
		System.out.print("First name: ");
		inputString = in.nextLine();
		newCustomer.setFirstName(inputString);
		System.out.print("Last name: ");
		inputString = in.nextLine();
		newCustomer.setLastName(inputString);
		System.out.print("Street address: ");
		inputString = in.nextLine();
		newCustomer.setStreetAddress(inputString);
		System.out.print("City: ");
		inputString = in.nextLine();
		newCustomer.setCity(inputString);
		System.out.print("State: ");
		inputString = in.nextLine();
		newCustomer.setState(inputString);
		System.out.print("Zip: ");
		inputInt = in.nextInt();
		newCustomer.setZipCode(inputInt);
		System.out.print("Phone: ");
		inputInt = in.nextInt();
		newCustomer.setPhone(inputInt);
		System.out.printf("The randomly generated Customer Number is: %d\n", newCustomer.getCustomerID());
		return newCustomer;
	}

}
