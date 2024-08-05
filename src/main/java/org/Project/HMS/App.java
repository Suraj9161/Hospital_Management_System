package org.Project.HMS;

import com.Controller.DoctorController;
import com.Controller.PatientController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hospital Management System " );
        
        PatientController patientController=new PatientController();
        patientController.createPatient("suraj", 22, "Pune");
        patientController.getAllPatients();
       System.out.println( patientController.getPatientById(1));
       
       patientController.updatePatient(1, "Isha", 20, "varanasi");
       System.out.println(patientController.getAllPatients());
       
       
       
       DoctorController doctorController=new DoctorController();
       doctorController.createDoctor("Suraj", "Love","Pune");
       doctorController.createDoctor("Rohit", "abc", "Pune");
       doctorController.createDoctor("Suresh", "Neurology", "Mumbai");
       doctorController.createDoctor("Anita", "Pediatrics", "Delhi");
       doctorController.createDoctor("Mohan", "Orthopedics", "Chennai");
       doctorController.createDoctor("Priya", "Dermatology", "Kolkata");
       doctorController.createDoctor("Raj", "General Surgery", "Bangalore");
       doctorController.createDoctor("Neha", "Gynecology", "Hyderabad");
       
       
    }
}
