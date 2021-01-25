package q4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;



import q4.account.Account;
import q4.account.Enterprise;
import q4.adress.Address;
import q4.authentication.AuthenticationStatus;
import q4.insurance.Insurance;
import q4.insurance.ResidenceInsurance;
import q4.manager.AccountManager;
import q4.manager.AddressManager;
import q4.insurance.CarInsurance;

import q4.user.User;

public class Application {

	public static void main(String[] args) {
		User currentUser = new User();  
		currentUser.setIsim("kurumsal kullanıcı");
          currentUser.setSoyisim("kurumsal kullanıcı soyad");
          //currentUser.setUserAddress(createAddress(kurumsal));
          currentUser.setYas(41);
          currentUser.setEmail("kurumsal@gmail.com");
          
          currentUser.setPassword("kurumsal");
		Date sonGirisTarihi= new Date();
		
		

			
		TreeSet<Account> accounts = new TreeSet<>();


        Account enterpriseAccount = new Enterprise();
      enterpriseAccount.setStatus(AuthenticationStatus.FAIL);
      enterpriseAccount.setUser(currentUser);
      accounts.add(enterpriseAccount);
      /*  enterpriseAccount.setInsuranceList(createInsurances("kurumsal"));
        enterpriseAccount.setUser(createUser("kurumsal"));
        
*/
       

		
		
		AccountManager accountManager = new AccountManager(accounts);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("email	  : ");
		String maili = scan.next();
		System.out.print("Password : ");
		String passwordi = scan.next();
		accountManager.login(maili,passwordi);
		scan.close();

	
	}

}
