package q4.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import q4.insurance.Insurance;

import q4.adress.Address;
import q4.authentication.AuthenticationStatus;
import q4.user.User;

public abstract class Account implements Comparable<Account> {

	protected User user;
	protected AuthenticationStatus status; 
    protected ArrayList<Address> adress = new ArrayList<Address>();
    protected List<Insurance> insuranceList;
 
	
	public Account() {
	    }
public Account(User user, AuthenticationStatus authStatus, ArrayList<Address> adress) {
		super();
		this.user = user;
		this.status = authStatus;
		this.adress = adress;
	}

public void loginControl(String email,String password) throws InvalidAuthenticationException {
	
	if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
		System.out.println("Login Succesful");
		this.status = AuthenticationStatus.SUCCESS;
	}else {
		this.status = AuthenticationStatus.FAIL;
		throw new InvalidAuthenticationException("User info is not True");
		 
	}
}

public void addAdress(Address address, User user) {
	ArrayList<Address> newAddress = new ArrayList<Address>();
	newAddress.add(address);
    user.setAdress(newAddress);
    System.out.println(address+"Add Succesfuly");
}

public void deleteAdress(Address address, User user) {
	
	user.getAdress().remove(address);

	System.out.println(address+"Remove Succesfuly");
}

public boolean loginStatus() {
	return AuthenticationStatus.SUCCESS.equals(this.status);
	
}
public abstract void addInsurance();



public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public AuthenticationStatus getStatus() {
	return status;
}

public void setStatus(AuthenticationStatus status) {
	this.status = status;
}

public ArrayList<Address> getAdress() {
	return adress;
}

public void setAdress(ArrayList<Address> adress) {
	this.adress = adress;
}

public List<Insurance> getInsuranceList() {
	return insuranceList;
}
public void setInsuranceList(List<Insurance> insuranceList) {
	this.insuranceList = insuranceList;
}

public final void showUserInfo() {
	
	StringBuilder builder=new StringBuilder();
	builder.append("İsim: "+ this.user.getIsim());
	builder.append("Soyisim: "+ this.user.getSoyisim());
	builder.append("Yas:"+this.user.getYas());
	builder.append("Son giriş Tarihi: "+ this.user.getSonGirisTarihi());
	System.out.println(builder.toString());
}	

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
}

