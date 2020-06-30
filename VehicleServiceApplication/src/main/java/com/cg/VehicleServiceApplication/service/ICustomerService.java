package com.cg.VehicleServiceApplication.service;




import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.VehicleServiceApplication.entities.BookingDetails;
import com.cg.VehicleServiceApplication.entities.Customer;


@Service
public interface ICustomerService {
	
	public List<Customer> loggingCustomer(String emailId, String password);
	
	public Customer registerCustomer(Customer customer);
	
	public BookingDetails bookServices(BookingDetails bookingdetails);
	
	void  deleteServices(int vehicleserviceId);

	public BookingDetails updateServices(BookingDetails bookingdetails, int bookingdetailsId);

	public List<BookingDetails> getServices();
	
	public Customer updateCustomerProfile(Customer customerProfile, int customerId);
	
	public Customer getCustomerProfile(int customerId) ;
	

}
