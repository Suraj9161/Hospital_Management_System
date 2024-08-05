package com.module;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long id;
    @Nonnull
	private String name;
    @Nonnull
	private String specialization;
	
    @Column(nullable = true)
    private String address;
    
    @OneToMany(mappedBy = "doctor" , cascade = CascadeType.ALL)
    private List<Appoinment> appoinments;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor( String name, String specialization, String address, List<Appoinment> appoinments) {
		super();
	
		this.name = name;
		this.specialization = specialization;
		this.address = address;
		this.appoinments = appoinments;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", address=" + address
				+ "]";
	}

	public List<Appoinment> getAppoinments() {
		return appoinments;
	}

	public void setAppoinments(List<Appoinment> appoinments) {
		this.appoinments = appoinments;
	}

//	@Override
//	public String toString() {
//		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", address=" + address
//				+ ", appoinments=" + appoinments + "]";
//	}
	
    
}
