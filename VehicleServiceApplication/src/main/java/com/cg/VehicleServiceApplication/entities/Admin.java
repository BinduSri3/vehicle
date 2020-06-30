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
@Table(name="admin")

public class Admin {

	@Id
	@Column(name = "admin_id")
	@SequenceGenerator(name = "seq", sequenceName = "seq", initialValue = 100000, allocationSize = 100010)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int adminId;
	
	@Column(name = "admin_name")
	private String adminName;

	@Column(name = "admin_email",unique = true)
	private String adminEmail;
	
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "admin_password")
	private String adminPassword;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + "]";
	}
	
//	@Column(name = "admin_forgotpassword")
//	private String adminForgotpassword;
//	
//	@Column(name = "admin_confirmpassword")
//	private String adminConfirmpassword;
	

//	@JsonIgnore
//	@OneToMany(mappedBy = "admin")
//	private List<VehicleServices> listOfVehicleServices;

	}

	
