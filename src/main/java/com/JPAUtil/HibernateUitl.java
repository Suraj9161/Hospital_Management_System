package com.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUitl {

	private static final EntityManagerFactory emf;
	
	static {
		try {
			emf=Persistence.createEntityManagerFactory("hospital-management-system");
			
		}catch (Throwable e) {
		throw	new ExceptionInInitializerError(e); 
		}
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	public static  void close() {
		if(emf !=null) {
			emf.close();
		}
	}
}
