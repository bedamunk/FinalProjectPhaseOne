

import java.util.Scanner;

public class BankManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		Scanner in = new Scanner(System.in);
		
		boolean exit = false;
		do {
			int selection;
			System.out.print("     Bank Menu\n");
			System.out.print("=====================\n");
			System.out.print("1. 	Create Checking Account\n");
			System.out.print("2. 	Create Gold Account\n");
			System.out.print("3. 	Create Regular Account\n");
			System.out.print("4. 	Deposit\n");
			System.out.print("5. 	Withdraw\n");
			System.out.print("7. 	Remove an Account\n");
			System.out.print("8. 	Apply end of month (Interest/Fees)\n");
			System.out.print("9. 	Display Bank Statistics\n");
			System.out.print("10. 	Exit\n");
			System.out.print("Please input your choice (1-10): ");
			// While loop to catch user input error
			while (!in.hasNextInt()) {
				System.out.println("=====================\n");
				System.out.println("*Hint: Please use an integer between 1-10 to choose a menu option: ");
				System.out.print("     Bank Menu\n");
				System.out.print("=====================\n");
				System.out.print("1. 	Create Checking Account\n");
				System.out.print("2. 	Create Gold Account\n");
				System.out.print("3. 	Create Regular Account\n");
				System.out.print("4. 	Deposit\n");
				System.out.print("5. 	Withdraw\n");
				System.out.print("7. 	Remove an Account\n");
				System.out.print("8. 	Apply end of month (Interest/Fees)\n");
				System.out.print("9. 	Display Bank Statistics\n");
				System.out.print("10. 	Exit\n");
				System.out.print("Please input your choice (1-10): ");
				in.next();
			}
			selection = in.nextInt();
			switch (selection) {
				case 1: bank.createAccount(selection);
						break;
				case 2: bank.createAccount(selection);
						break;
				case 3: bank.createAccount(selection);
						break;
				case 4: System.out.println("Please enter the account number you would like to withdraw from: ");
						while (!in.hasNextInt()) {
							System.out.println("That was not Please enter an account number: ");
							in.next();
						}
						int account =  in.nextInt();
						break;
				case 5: 
				case 6:
				case 7:
				case 8:
				case 9:
				case 10: exit = true;
			}
			
		} while (!exit);
		
		

	}

	

}
