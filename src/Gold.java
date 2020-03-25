

//class that creates object of type Gold which is a subtype of supertype Account

public class Gold extends Account {
	
	Gold(Account account) {
		super(account);
	}
	
	Gold(Customer customer) {
		super(customer);
	}

}
