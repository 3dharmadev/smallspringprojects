package Q3.dao;

import java.util.ArrayList;
import java.util.List;

import Q3.exception.SellerException;
import Q3.exception.StoreException;
import Q3.model.Buyer;
import Q3.model.Seller;
import Q3.model.Store;
import Q3.util.EMUtility;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class ShoppingDaoImpl implements ShoppingDao{

	@Override
	public void addStore(Store store) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtility.getManager();
		
		
		em.getTransaction().begin();
		em.persist(store);
		em.getTransaction().commit();
		System.out.println("success");
		em.close();
		
	}

	@Override
	public void registerBuyer(Buyer buyer, int store_id) throws StoreException {
		// TODO Auto-generated method stub
         EntityManager em=EMUtility.getManager();
		
         Store store=em.find(Store.class, store_id);
           
         System.out.println(store);
        if(store!=null) {
        	buyer.getStores().add(store);
        	store.getBuyers().add(buyer);
        	
    		em.getTransaction().begin();
    
        	 em.merge(buyer);
    		 
    		em.getTransaction().commit();
    		em.close();
    		System.out.println("SUCESS");
        }
        else throw new StoreException("wrong store id...");
         
		
		em.close();
		
	}

	@Override
	public void registerSeller(Seller seller) {
		// TODO Auto-generated method stub
		
EntityManager em=EMUtility.getManager();
		
		
		em.getTransaction().begin();
		em.persist(seller);
		em.getTransaction().commit();
		System.out.println("success");
		em.close();
		
		
		
	}

	@Override
	public void assignSellerWithStore(int seller_id, int store_id) throws SellerException, StoreException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtility.getManager();
		
		Seller seller=em.find(Seller.class,seller_id);
		
		
		Store store=em.find(Store.class,store_id);
		
		if(seller!=null && store!=null) {
			 
			seller.getStores().add(store);
			store.setSeller(seller);;
			em.getTransaction().begin();
			
			em.merge(store); em.merge(seller);
			
			
			em.getTransaction().commit();
		}
		else if(seller==null) throw new SellerException("wrong seller id");
		else throw new StoreException("wrong store id");
		
		em.close();
		 	
		
	}

	@Override
	public List<Buyer> getAlltheBuyerByStoreName(String store_name) throws StoreException {
		EntityManager em=EMUtility.getManager();
		
		
		
		Query q=em.createQuery("select store_id from Store where store_name=:store_name");
		        q.setParameter("store_name", store_name);
		        
		        int id=  (int) q.getSingleResult();
		        
		     //   em.createNamedQuery("select * from ", null)
		        
		        

		return null;
	}

}
