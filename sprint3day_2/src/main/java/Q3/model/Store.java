package Q3.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Store {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int	store_id; 
		private String	store_name;
		private String	location;
		
		
		@ManyToMany(cascade = CascadeType.ALL)	
		List<Buyer> buyers=new ArrayList<Buyer>();
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Seller seller;

		
		public int getStore_id() {
			return store_id;
		}

		public void setStore_id(int store_id) {
			this.store_id = store_id;
		}

		public String getStore_name() {
			return store_name;
		}

		public void setStore_name(String store_name) {
			this.store_name = store_name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public List<Buyer> getBuyers() {
			return buyers;
		}

		public void setBuyers(List<Buyer> buyers) {
			this.buyers = buyers;
		}

		public Seller getSeller() {
			return seller;
		}

		public void setSeller(Seller seller) {
			this.seller = seller;
		}

		@Override
		public String toString() {
			return "Store [store_id=" + store_id + ", store_name=" + store_name + ", location=" + location + ", buyers="
					+ buyers + ", seller=" + seller + "]";
		}

		  

		
		
}
