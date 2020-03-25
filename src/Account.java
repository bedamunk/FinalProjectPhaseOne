

import java.util.Random;

public class Account {
	
	// instance variables
	
	protected int accountNumber;
	protected double balance;
	Customer customer;
	
	Account(Account account) {
		
	}
	
	// default constructor
	
	Account(Customer customer) {
		setAccountNumber();
		setCustomer(customer);
	}
	
	// Getters and setters for instance variables


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber() {
		Random rand = new Random();
		int accountNumber = rand.nextInt(1000);
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void withdraw(int amount) {
		this.setBalance(this.getBalance()-amount);
	}
	
	public void deposit(int amount) {
		this.setBalance(this.getBalance()+amount);
	}

	
	

}
