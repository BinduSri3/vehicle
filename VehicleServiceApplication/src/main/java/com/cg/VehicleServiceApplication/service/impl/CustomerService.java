package com.cg.VehicleServiceApplication.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.VehicleServiceApplication.entities.BookingDetails;
import com.cg.VehicleServiceApplication.entities.Customer;
import com.cg.VehicleServiceApplication.repository.BookingDetailsRepository;
import com.cg.VehicleServiceApplication.repository.CustomerRepository;
import com.cg.VehicleServiceApplication.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingDetailsRepository bookingdetailsRepository;

	/* 
	  * Customer Login with EmailId and password 
	 */
	public List<Customer> loggingCustomer(String emailId, String password){
		return customerRepository.findDetails(emailId, password);
	}
	
	/* 
	  * Customer Registration with his/her Credentials 
	 */
	@Override
	public Customer registerCustomer(Customer customer) {
		return customerRepository.save(customer);	
	}
	
	/* 
	  * Customer can book services 
	 */
	@Override
	public BookingDetails bookServices(BookingDetails bookingdetails) {
		return bookingdetailsRepository.save(bookingdetails);
	}
	
	/* 
	  * Customer can delete booked service
	 */
	public void deleteServices(int vehicleserviceId) {
		bookingdetailsRepository.deleteById(vehicleserviceId);
	}
	
	/* 
	  * Customer can update his service like date,time,address and phonenumber
	 */
	@Override
	public BookingDetails updateServices(BookingDetails bookingdetails, int bookingdetailsId) {
		BookingDetails existingService = bookingdetailsRepository.getOne(bookingdetailsId);
		existingService.setDate(bookingdetails.getDate());
		existingService.setAddress(bookingdetails.getAddress());
		existingService.setPhonenumber(bookingdetails.getPhonenumber());
		existingService.setTime(bookingdetails.getTime());
		return bookingdetailsRepository.save(existingService);
	}

	public List<BookingDetails> getServices() {
		return bookingdetailsRepository.findAll();
	}

	/* 
	  * Customer can update his profile
	 */
	@Override
	public Customer updateCustomerProfile(Customer customerProfile, int customerId) {
		Customer existingCustomer = customerRepository.getOne(customerId);
		existingCustomer.setName(customerProfile.getName());
		existingCustomer.setEmailId(customerProfile.getEmailId());
		existingCustomer.setPhonenumber(customerProfile.getPhonenumber());
		existingCustomer.setPassword(customerProfile.getPassword());
		return customerRepository.save(existingCustomer);
	}

	/* 
	  * Customer can view his profile
	 */
	@Override
	public Customer getCustomerProfile(int customerId) {
		boolean existingCustomer = customerRepository.existsById(customerId);
		if (existingCustomer) {
			Customer customer = customerRepository.findById(customerId).get();
			System.out.println(customer);
			return customer;

		} else
			return null;
	}


	

}
