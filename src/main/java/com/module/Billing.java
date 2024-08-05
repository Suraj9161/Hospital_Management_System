package com.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Billing {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		private double amount;
		
		@ManyToOne
		@JoinColumn(name = "patien_id")
		private Patient patient;

		public Billing() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Billing(double amount, Patient patient) {
			super();
			this.amount = amount;
			this.patient = patient;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}

		@Override
		public String toString() {
			return "Billing [id=" + id + ", amount=" + amount + ", patient=" + patient + "]";
		}
		
		
}
