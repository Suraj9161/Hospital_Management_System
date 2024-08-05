package com.Controller;

import java.util.List;

import com.Service.DoctorSevices;
import com.module.Doctor;

public class DoctorController {
	
	private DoctorSevices doctorService=new DoctorSevices();
	
	public void createDoctor(String name, String specialization ,String address) {
        Doctor doctor = new Doctor();
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAddress(address);
        doctorService.adddoctorS(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctorsS();
    }

    public Doctor getDoctorById(Long id) {
        return doctorService.getDoctorByIdS(id);
    }

    public void updateDoctor(Long id, String name, String specialization ,String address) {
        Doctor doctor = doctorService.getDoctorByIdS(id);
        if (doctor != null) {
            doctor.setName(name);
            doctor.setSpecialization(specialization);
            doctor.setAddress(address);
            doctorService.updateDoctorS(doctor);
        }
    }

    public void deleteDoctor(Long id) {
        doctorService.deleteDoctorS(id);
    }
}
