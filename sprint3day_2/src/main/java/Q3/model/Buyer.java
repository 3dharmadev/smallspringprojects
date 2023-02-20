package Q3.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Buyer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int buyer_id;
	private String	name ;
	private String email ;
	private String mobile;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Store> stores = new ArrayList<>();

	
 
	
	public int getBuyer_id() {
		return buyer_id;
	}




	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getMobile() {
		return mobile;
	}




	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	public List<Store> getStores() {
		return stores;
	}




	public void setStores(List<Store> stores) {
		this.stores = stores;
	}




	@Override
	public String toString() {
		return "Buyer [buyer_id=" + buyer_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", stores=" + stores + "]";
	}
}
