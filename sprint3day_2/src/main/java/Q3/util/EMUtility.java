package Q3.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtility {
	
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mapping");

	
	public static EntityManager getManager() {
		
		return emf.createEntityManager();
	}
	
}
