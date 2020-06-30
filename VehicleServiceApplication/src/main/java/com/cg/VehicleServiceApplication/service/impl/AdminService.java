package com.cg.VehicleServiceApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.VehicleServiceApplication.entities.Admin;
import com.cg.VehicleServiceApplication.entities.VehicleServices;
import com.cg.VehicleServiceApplication.repository.AdminRepository;
import com.cg.VehicleServiceApplication.repository.VehicleServicesRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Autowired
	VehicleServicesRepository vehicleservicesRepository;
	/* 
	  * Admin Login with EmailId and password 
	 */
	
	public List<Admin> loggingAdmin(String adminEmail, String adminPassword){
		return adminRepository.findDetails(adminEmail, adminPassword);
	}

	/* 
	  * Admin Registration with EmailId and password 
	 */

	public Admin registerAdmin(Admin admin) {
		return adminRepository.save(admin);	
}
	/* 
	  * Admin adds vehicle services 
	 */

	public VehicleServices addServices(VehicleServices vehicleservices) {
		return vehicleservicesRepository.save(vehicleservices);
		
	}
	/* 
	  * Admin deletes/blocks vehicle services 
	 */
	
	public void blockServices(int vehicleserviceId) {
		vehicleservicesRepository.deleteById(vehicleserviceId);
	}

	/* 
	  * Admin updates vehicle services 
	 */
	public VehicleServices updateServices(VehicleServices vehicleservices, int vehicleserviceId) {

		VehicleServices existingService = vehicleservicesRepository.getOne(vehicleserviceId);
		existingService.setServiceName(vehicleservices.getServiceName());

		existingService.setServicePrice(vehicleservices.getServicePrice());
		return vehicleservicesRepository.save(existingService);
	}

	/* 
	  * Admin views all vehicle services 
	 */
	public List<VehicleServices> getServices() {
		return vehicleservicesRepository.findAll();
	}
	/* 
	  * Admin --> view profile 
	 */
	public Admin getAdminProfile(int adminId) {
		boolean existingAdmin = adminRepository.existsById(adminId);
		if (existingAdmin) {
			Admin admin = adminRepository.findById(adminId).get();
			System.out.println(admin);
			return admin;

		} else
			return null;

	}
	/* 
	  * Admin edits profile
	 */

	public Admin updateAdminProfile(Admin adminProfile, int adminId) {
		Admin existingAdmin = adminRepository.getOne(adminId);
		existingAdmin.setAdminName(adminProfile.getAdminName());
		existingAdmin.setAdminEmail(adminProfile.getAdminEmail());
		existingAdmin.setAdminPassword(adminProfile.getAdminPassword());
		return adminRepository.save(existingAdmin);
	}

}
