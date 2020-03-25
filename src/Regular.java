

//class that creates object of type Regular which is a subtype of supertype Account

public class Regular extends Account {
	
	Regular(Account account) {
		super(account);
	}

	Regular(Customer customer) {
		super(customer);
	}
	
}