package com.app.utiltiy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

	
private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("college");
	}
	
	public static EntityManager provideEntityManager(){
		 
		
		return emf.createEntityManager();
	}
}

