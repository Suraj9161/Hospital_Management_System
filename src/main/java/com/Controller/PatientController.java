package com.Controller;

import java.util.List;

import com.Service.PatientService;
import com.module.Patient;

public class PatientController {

	private PatientService patientService=new PatientService();
	
	public void createPatient(String name,int age,String address) {
		 Patient patient=new Patient();
		 
		 patient.setName(name);
		 patient.setAge(age);
		 patient.setAddress(address);
		 patientService.addPatient(patient);
	}
	
	public List<Patient> getAllPatients(){
		
		return patientService.getAllPatients();
	}
    public Patient getPatientById(long id) {
        return patientService.getPatientById(id);
    }
	
	
	public void updatePatient( long id, String name, int age, String address) {
		Patient patient=patientService.getPatientById(id);
		if(patient !=null) {
			patient.setName(name);
            patient.setAge(age);
            patient.setAddress(address);
            patientService.updatePatient(patient);
		}
	
	}
	public void deletePatient(long id) {
		patientService.deletePatient(id);
	}
}
