package banking.portal;
import java.util.*;

public class BankFunctions {
	
	int initBalance = 20000;
	
	int userAmount;
	
	int currentBalance;
	Scanner sc = new Scanner(System.in);
	
	
	public void withdrwal() {
		
		
		System.out.println("Enter The Amount You Want TO Withdraw");
		userAmount = sc.nextInt();
		
		if(userAmount > 0) {
			currentBalance = initBalance - userAmount;
			System.out.println("Your current balance is " + currentBalance);
		}
	}
		
		
		public void deposit() {
			
			
			System.out.println("Enter The Amount You Want TO Deposit");
			userAmount = sc.nextInt();
			
			if(userAmount > 0) {
				currentBalance = initBalance + userAmount;
				System.out.println("Your current balance is " + currentBalance);
			}
		}
			
			public void transfer() {
				
				
				System.out.println("Enter The Amount You Want TO Transfer");
				userAmount = sc.nextInt();
				
				if(userAmount > 0) {
					currentBalance = initBalance - userAmount;
					System.out.println("Your current balance is " + currentBalance);
				}
				
		
		
	}

}
