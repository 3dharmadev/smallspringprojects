package Q3.usecases;

import Q3.dao.ShoppingDao;
import Q3.dao.ShoppingDaoImpl;
import Q3.exception.SellerException;
import Q3.exception.StoreException;
import Q3.model.Buyer;
import Q3.model.Seller;
import Q3.model.Store;
import Q3.util.EMUtility;
import jakarta.persistence.EntityManager;

public class Demo {

	
	public static void main(String[] args) throws StoreException, SellerException {
	EntityManager em	=EMUtility.getManager();
	        ShoppingDao dao=new ShoppingDaoImpl();
	        /*  Store store=new Store();
	          store.setLocation("Bhubaneswar"); store.setStore_name("Book Store");
	       dao.addStore(store); */
	        
	       /* Buyer buyer=new Buyer();
	        buyer.setEmail("dbsatapathy@gmail.com");
	        buyer.setMobile("12010010");
	        buyer.setName("debabrata");
	        
	       
	        dao.registerBuyer(buyer, 1); */
	        
	     /*   Seller seller=new Seller();
	        
	        seller.setEmail("marwadi@gmail.com"); seller.setSeller_name("agra me"); seller.setYear_of_experience(12);
	        
	        dao.registerSeller(seller); */
	        
	       // dao.assignSellerWithStore(1, 1);
	        
	        
	}
	
}
