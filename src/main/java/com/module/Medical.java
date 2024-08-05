package com.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Medical {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String dignosis;
	private String treatment;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	public Medical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medical(String dignosis, String treatment, Patient patient) {
		super();
		this.dignosis = dignosis;
		this.treatment = treatment;
		this.patient = patient;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDignosis() {
		return dignosis;
	}

	public void setDignosis(String dignosis) {
		this.dignosis = dignosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Medical [id=" + id + ", dignosis=" + dignosis + ", treatment=" + treatment + ", patient=" + patient
				+ "]";
	}
	
	
	

}
