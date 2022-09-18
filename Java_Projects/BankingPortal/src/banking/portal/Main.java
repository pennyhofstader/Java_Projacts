package banking.portal;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		//creating objects of bank and customer classes
		CustomerDetails cust = new CustomerDetails("Khush110022", "Kh@123");
		BankFunctions bank = new BankFunctions();
		
		
		
		System.out.println("Welcome To ANN Bank");
		System.out.println("Enter Your Account Number To Proceed");
		Scanner sc = new Scanner(System.in);
		String accNum = sc.nextLine(); // taking user name input
		System.out.println("Enter Your Account Password To Proceed");
		String accPass = sc.nextLine(); // taking user password input
		int funcInput = 0;
		
		//verifying the user credentials with the database
		if(cust.getAccNum().equals(accNum) && cust.getAccPass().equals(accPass)) 
			System.out.println("Welcome To Your Account , What Operation Would You Like To Perform \n 1. Withdrawl \n 2. Deposit \n 3. Transfer");
		else
			System.out.println("Wrong Credentials");
		
		// taking the function input
		funcInput = sc.nextInt();
		
		//logic to perform the bank operations
		
		if(funcInput == 1) {
			System.out.println("Withdrawl");
			bank.withdrwal();
			
		}
		else if(funcInput == 2) {
			System.out.println("Deposit");
			bank.deposit();
			
		}
		else if(funcInput == 3) {
			System.out.println("Transfer");
			bank.transfer();
			
		}else {
			System.out.println("Invalid Input");
		}
	
	}

}
