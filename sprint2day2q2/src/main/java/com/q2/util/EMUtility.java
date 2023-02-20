package com.q2.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtility {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("emp");
	}
	
	public  static EntityManager getManager() {
		return entityManagerFactory.createEntityManager();
	}
	

}
