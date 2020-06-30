package com.cg.VehicleServiceApplication.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.VehicleServiceApplication.entities.Admin;
import com.cg.VehicleServiceApplication.entities.VehicleServices;


@Service
public interface IAdminService {
	
	public List<Admin> loggingAdmin(String adminEmail, String adminPassword);
	
	public Admin registerAdmin(Admin admin);
	
	public VehicleServices addServices(VehicleServices vehicleservices);
	
	void  blockServices(int vehicleserviceId);

	public VehicleServices updateServices(VehicleServices vehicleservices, int vehicleserviceId);

	public List<VehicleServices> getServices();
	
	public Admin updateAdminProfile(Admin adminProfile, int adminId);
	
	public Admin getAdminProfile(int adminId) ;
	
//	public List<CustomerOrders> viewCustomerOrders();

}
