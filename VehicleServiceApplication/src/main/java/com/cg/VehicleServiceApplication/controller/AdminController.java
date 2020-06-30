package com.cg.VehicleServiceApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.VehicleServiceApplication.entities.Admin;
import com.cg.VehicleServiceApplication.entities.VehicleServices;
import com.cg.VehicleServiceApplication.service.impl.AdminService;


@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	/** Admin registeration **/

	@RequestMapping(value = "/registeradmin", method = RequestMethod.POST)
	public Admin registerAdmin(@RequestBody Admin admin)  {
		
		return adminService.registerAdmin(admin);
	}
	/** Admin Login **/
	@RequestMapping(value = "/loginadmin", method = RequestMethod.GET)
	public List <Admin> loggingAdmin(@RequestParam(required = false) String adminUsername,
			@RequestParam(required = false) String adminPassword) {
		return adminService.loggingAdmin(adminUsername, adminPassword);
	}
	
	
	/** Add Services **/
	@RequestMapping(value = "/addServices", method = RequestMethod.POST)
	public VehicleServices addServices(@RequestBody VehicleServices vehicleservices)
			 {
	
		return adminService.addServices(vehicleservices);
}

	
	/** Delete Services **/
	@RequestMapping(value = "/blockServices/{vehicleserviceId}", method = RequestMethod.DELETE)
	public void blockServices(@PathVariable int vehicleserviceId) {
		adminService.blockServices(vehicleserviceId);
	}

	
	/** Update Services **/
	@RequestMapping(value = "/updateServices/{vehicleserviceId}", method = RequestMethod.PUT)
	public VehicleServices updateServices(@RequestBody VehicleServices vehicleservices, @PathVariable int vehicleserviceId)
			 {
		return adminService.updateServices(vehicleservices, vehicleserviceId);
	}	
	

	/** GET Services **/

	@RequestMapping(value = "/getServices", method = RequestMethod.GET)
	public List<VehicleServices> getServices() {
		return adminService.getServices();
	}
	
	/**  View Admin Profile **/
	@RequestMapping(value = "/getAdminProfile/{adminId}", method = RequestMethod.GET)
	public Admin getAdminProfile(@PathVariable int adminId) {
		return adminService.getAdminProfile(adminId);
	}

	
	/**  Update Admin Profile **/
	@RequestMapping(value="/updateAdminProfile/{adminId}", method = RequestMethod.PUT)
    public Admin updateAdminProfile(@RequestBody Admin adminProfile,@PathVariable int adminId)
    {
       return adminService.updateAdminProfile(adminProfile, adminId);
                 
    }
	
	/**  View Customer Orders **/
	
	/**  Logout **/
	
	

	
	
}
