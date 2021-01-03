package q4.account;

import java.util.ArrayList;

import q4.adress.Address;
import q4.authentication.AuthenticationStatus;
import q4.insurance.Insurance;
import q4.user.User;

public class Individual extends Account {

	public Individual(User user, AuthenticationStatus authStatus, ArrayList<Address> adress) {
		super(user, authStatus, adress);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addInsurance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
