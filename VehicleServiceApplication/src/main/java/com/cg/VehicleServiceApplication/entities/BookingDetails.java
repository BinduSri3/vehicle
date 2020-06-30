package com.cg.VehicleServiceApplication.entities;


import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class BookingDetails {

	@Id
	@Column(name = "bookingdetails_id")
	@SequenceGenerator(name = "seq", sequenceName = "seq", initialValue = 100000, allocationSize = 100010)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int bookingdetailsId;

	@Column(name = "service_name")
	private String serviceName;
	
	@Column(name = "service_price")
	private String servicePrice;
	
	@Column(name = "description")
	private String description;

	@Column(name = "Date")
	private Date date;
	
	@Column(name = "Time")
	private Time time;
	
	@Column(name = "EmailId")
	private String emailId;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Phonenumber")
	private String phonenumber;

	public int getBookingdetailsId() {
		return bookingdetailsId;
	}

	public void setBookingdetailsId(int bookingdetailsId) {
		this.bookingdetailsId = bookingdetailsId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingdetailsId=" + bookingdetailsId + ", serviceName=" + serviceName
				+ ", servicePrice=" + servicePrice + ", description=" + description + ", date=" + date + ", time="
				+ time + ", emailId=" + emailId + ", address=" + address + ", phonenumber=" + phonenumber + "]";
	}
	
	
	
}