package Q3.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SELLER")
public class Seller {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seller_id;
	private String seller_name;
	private int year_of_experience;
	private String	email;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Store> stores=new ArrayList<Store>();
	
	


	public int getSeller_id() {
		return seller_id;
	}


	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}


	public String getSeller_name() {
		return seller_name;
	}


	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}


	public int getYear_of_experience() {
		return year_of_experience;
	}


	public void setYear_of_experience(int year_of_experience) {
		this.year_of_experience = year_of_experience;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Store> getStores() {
		return stores;
	}


	public void setStores(List<Store> stores) {
		this.stores = stores;
	}


	@Override
	public String toString() {
		return "Seller [seller_id=" + seller_id + ", seller_name=" + seller_name + ", year_of_experience="
				+ year_of_experience + ", email=" + email + ", stores=" + stores + "]";
	}
	 
	
}
