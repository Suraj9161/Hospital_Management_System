package com.DAO;

import java.util.List;

import com.JPAUtil.HibernateUitl;
import com.module.Doctor;


import jakarta.persistence.EntityManager;

public class DoctorDao {
	
	public void save(Doctor doctor) {
		EntityManager em=HibernateUitl.getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(doctor);
			em.getTransaction().commit();
			
		}
		finally {
			em.close();
		}
		
	}
	public List<Doctor>  findAlldoctors(){
		EntityManager em=HibernateUitl.getEntityManager();
		try {
		List<Doctor> doctors=em.createQuery("SELECT d FROM Doctor d",Doctor.class).getResultList();
		
		return doctors;
		}
		finally {
			em.close();
		}
	}
	public Doctor findById(long id) {
		EntityManager em=HibernateUitl.getEntityManager();
		try {
			Doctor doctor=em.find(Doctor.class, id);
			
		return doctor;	
		}
		finally {
			em.close();
		}
		
	}
	public void updateDoctor(Doctor doctor) {
		EntityManager em=HibernateUitl.getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(doctor);
			em.getTransaction().commit();
		}
		finally {
			em.close();
		}
	}
	public void deleteDoctor(long id) {
		EntityManager em=HibernateUitl.getEntityManager();
		try {
			em.getTransaction().begin();
			Doctor doctor=em.find(Doctor.class, id);
			if(doctor !=null) {
				em.remove(doctor);
			}
			em.getTransaction().commit();
		}
		finally {
			em.close();
		}
		
	}

}
