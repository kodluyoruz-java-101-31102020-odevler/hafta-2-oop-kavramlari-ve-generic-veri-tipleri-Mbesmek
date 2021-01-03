package q4.manager;

import java.util.TreeSet;



import q4.account.Account;
import q4.account.InvalidAuthenticationException;



public class AccountManager {

	public AccountManager(TreeSet<Account> account) {
		//super();
		this.account = account;
	}

	public TreeSet<Account> account;
	
	 public void login(String email, String password) {
	        for (Account account : account) {
	            try {
	                    account.loginControl(email, password);
	                } catch (InvalidAuthenticationException e) {
	                    System.out.println("Login is Failed");
	                }

	            
	        }
	        
	    }
}
