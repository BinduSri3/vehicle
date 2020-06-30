package com.cg.VehicleServiceApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="customer")

public class Customer {

	@Id
	@Column(name = "customer_id")
	@SequenceGenerator(name = "seq", sequenceName = "seq", initialValue = 100000, allocationSize = 100010)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int customerId;
	
	@Column(name = "customer_name")
	private String name;

	@Column(name = "customer_email",unique = true)
	private String emailId;
	
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "customer_password")
	private String password;
	
	@Column(name = "customer_phonenumber")
	private String phonenumber;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", emailId=" + emailId + ", password="
				+ password + ", phonenumber=" + phonenumber + "]";
	}
	
	}

	
