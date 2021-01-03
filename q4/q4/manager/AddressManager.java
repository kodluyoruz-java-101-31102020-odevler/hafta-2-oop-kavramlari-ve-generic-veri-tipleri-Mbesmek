package q4.manager;

import java.util.ArrayList;
import java.util.List;

import q4.adress.Address;
import q4.user.User;

public class AddressManager {
	
	public static void addAdress(Address address, User user) {
		ArrayList<Address> newAddress = new ArrayList<Address>();
		newAddress.add(address);
        user.setAdress(newAddress);
        System.out.println(address+"Add Succesfuly");
	}

	public static void deleteAdress(Address address, User user) {
		
		user.getAdress().remove(address);

		System.out.println(address+"Remove Succesfuly");
	}
}
