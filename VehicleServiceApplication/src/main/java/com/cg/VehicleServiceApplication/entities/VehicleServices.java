package com.cg.VehicleServiceApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class VehicleServices {

	@Id
	@Column(name = "vehicleservice_id")
	@SequenceGenerator(name = "seq", sequenceName = "seq", initialValue = 100000, allocationSize = 100010)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int vehicleserviceId;

	@Column(name = "service_name")
	private String serviceName;
	
	@Column(name = "service_price")
	private String servicePrice;
	
	@Column(name = "description")
	private String description;

	public int getVehicleserviceId() {
		return vehicleserviceId;
	}

	public void setVehicleserviceId(int vehicleserviceId) {
		this.vehicleserviceId = vehicleserviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "VehicleServices [vehicleserviceId=" + vehicleserviceId + ", serviceName=" + serviceName
				+ ", servicePrice=" + servicePrice + ", description=" + description + "]";
	}

//	@JsonIgnore	
//	@OneToMany(mappedBy="vehicleservices")
//	private List<BookingServices> bookingservices;
//
//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JoinColumn(name = "admin_Id", insertable = false, updatable = false)
//	private Admin admin;
//	
//	@JsonIgnore
//	@OneToOne(mappedBy= "vehicleservices")
//	private Customer customer;
}