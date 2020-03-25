
// class that creates object of type Checking which is a subtype of supertype Account

public class Checking extends Account {
	
	Checking(Account account) {
		super(account);
	}
	
	Checking(Customer customer) {
		super(customer);
	}

}