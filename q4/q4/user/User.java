package q4.user;

import java.util.ArrayList;
import java.util.Date;

import q4.adress.Address;


public class User {

	String isim ="Melih";
	String soyisim="Esmek";
	String password="123";
	String email="mbesmek@gmail.com";
	int yas=22;
	Date sonGirisTarihi= new Date();
	ArrayList<Address> adress = new ArrayList<Address>();
	
	public User(String isim,String soyisim,String password,String email,int yas,Date sonGirisTarihi,ArrayList<Address> adress) {
		this.isim=isim;
		this.soyisim=soyisim;
		this.password=password;
		this.email=email;
		this.yas=yas;
		this.sonGirisTarihi=sonGirisTarihi;
		this.adress=adress;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public Date getSonGirisTarihi() {
		return sonGirisTarihi;
	}

	public void setSonGirisTarihi(Date sonGirisTarihi) {
		this.sonGirisTarihi = sonGirisTarihi;
	}

	public ArrayList<Address> getAdress() {
		return adress;
	}

	public void setAdress(ArrayList<Address> adress) {
		this.adress = adress;
	}
	
}
