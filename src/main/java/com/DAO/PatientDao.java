package com.DAO;

import java.util.List;

import com.JPAUtil.HibernateUitl;
import com.module.Patient;

import jakarta.persistence.EntityManager;



public class PatientDao {
	 
	public void save(Patient patient) {
		EntityManager entityManager=HibernateUitl.getEntityManager();
		try {
			 entityManager.getTransaction().begin();
			 entityManager.persist(patient);
			 entityManager.getTransaction().commit();
		} finally {
		entityManager.close();	
		}
	}
	
	public List<Patient> findAll(){
		EntityManager em=HibernateUitl.getEntityManager();
		try {
		List<Patient> patients=em.createQuery("SELECT p FROM Patient p",Patient.class).getResultList();
		
		return patients;
		}finally {
			em.close();
		}
	}
	public Patient findByID(Long id) {
			EntityManager em=HibernateUitl.getEntityManager();
			try {
				Patient patient=em.find(Patient.class, id);
				em.close();
				return patient;
			}
		finally {
			em.close();
		}
		
	}
	
	public void update(Patient patient) {
		EntityManager em=HibernateUitl.getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(patient);
			em.getTransaction().commit();
		}finally {
			em.close();
		}
	}
	
	public void delete(Long id) {
		EntityManager em=HibernateUitl.getEntityManager();
		em.getTransaction().begin();
		Patient patient=em.find(Patient.class, id);
		if(patient !=null) {
			em.remove(patient);
		}
		em.getTransaction().commit();
		em.close();
		}
}
