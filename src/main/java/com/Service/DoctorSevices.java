package com.Service;

import java.util.List;

import com.DAO.DoctorDao;
import com.module.Doctor;


public class DoctorSevices {
	
	 private  DoctorDao doctorDao=new DoctorDao();
	 
	 public void adddoctorS(Doctor doctor) {
		 doctorDao.save(doctor);
	 }
	 
	 public List<Doctor> getAllDoctorsS(){
		 return doctorDao.findAlldoctors();
	 }
	public Doctor getDoctorByIdS(long id) {
		return doctorDao.findById(id);
	}
	public void updateDoctorS(Doctor doctor) {
		doctorDao.updateDoctor(doctor);
	}
	
	public void deleteDoctorS(long id) {
		doctorDao.deleteDoctor(id);
	}
	

}
