package Q3.dao;

import java.util.List;

import Q3.exception.SellerException;
import Q3.exception.StoreException;
import Q3.model.Buyer;
import Q3.model.Seller;
import Q3.model.Store;

public interface ShoppingDao {
	
	public void addStore(Store store);
	
	public void registerBuyer(Buyer buyer, int store_id)throws StoreException;
	
	public void registerSeller(Seller seller);
	
	public void assignSellerWithStore(int seller_id, int store_id) throws SellerException, StoreException;
	
	List<Buyer> getAlltheBuyerByStoreName(String store_name)throws StoreException;
	
	
	

}
