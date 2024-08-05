package com.module;


import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	@Nonnull
	private String name;
	@Nonnull
	private int age;
	@Nonnull
	private String address;
	

	
	@OneToMany(mappedBy = "patient" , cascade = CascadeType.ALL)
	private List<Medical>medicals;
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
	private List<Appoinment>appoinments;
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<Billing>billings;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, int age, String address, List<Medical> medicals, List<Appoinment> appoinments,
			List<Billing> billings) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.medicals = medicals;
		this.appoinments = appoinments;
		this.billings = billings;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Medical> getMedicals() {
		return medicals;
	}

	public void setMedicals(List<Medical> medicals) {
		this.medicals = medicals;
	}

	public List<Appoinment> getAppoinments() {
		return appoinments;
	}

	public void setAppoinments(List<Appoinment> appoinments) {
		this.appoinments = appoinments;
	}

	public List<Billing> getBillings() {
		return billings;
	}

	public void setBillings(List<Billing> billings) {
		this.billings = billings;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", medicals="
//				+ medicals + ", appoinments=" + appoinments + ", billings=" + billings + "]";
//	}
	
	
	
	
	
}
