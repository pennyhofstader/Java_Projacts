package banking.portal;

import java.util.*;

class CustomerDetails {
	private String getAccNo;
	private String getAccPassword;
	
	String getAccNum() {
		return getAccNo;
	}
	
	String getAccPass() {
		return getAccPassword;
	}

	public CustomerDetails(String accNo , String accPass) {
		
		this.getAccNo = accNo;
		this.getAccPassword = accPass;
		
		
	}

}
