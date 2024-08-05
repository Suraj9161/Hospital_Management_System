package com.Service;

import java.util.List;

import com.DAO.PatientDao;
import com.module.Patient;

public class PatientService {

	private PatientDao patientDao=new PatientDao();
	
	public void addPatient(Patient patient) {
		patientDao.save(patient);
	}
	
	public List<Patient> getAllPatients(){
		return patientDao.findAll();
	}
	
	public Patient getPatientById(Long id) {
		return patientDao.findByID(id);
	}
	public void updatePatient(Patient patient) {
		patientDao.update(patient);
		
	}
	public void deletePatient(Long id) {
		patientDao .delete(id);
	}
}
