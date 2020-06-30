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

import com.cg.VehicleServiceApplication.entities.BookingDetails;
import com.cg.VehicleServiceApplication.entities.Customer;
import com.cg.VehicleServiceApplication.service.impl.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	/** Customer registration **/

	@RequestMapping(value = "/registercustomer", method = RequestMethod.POST)
	public Customer registerCustomer(@RequestBody Customer customer)  {		
		return customerService.registerCustomer(customer);
	}
	
	/** Customer Login **/
	@RequestMapping(value = "/logincustomer", method = RequestMethod.GET)
	public  List<Customer> loggingCustomer(@RequestParam(required = false) String emailId,
			@RequestParam(required = false) String password) {
		return customerService.loggingCustomer(emailId, password);
	}
	
	
	/**book Services **/
	@RequestMapping(value = "/bookServices", method = RequestMethod.POST)
	public BookingDetails bookServices(@RequestBody BookingDetails bookingdetails)
		{
			return customerService.bookServices(bookingdetails);
	    }

	
	/** Delete Services **/
	@RequestMapping(value = "/deletebooking/{bookingdetailsId}", method = RequestMethod.DELETE)
	public void deleteServices(@PathVariable int bookingdetailsId) {
		customerService.deleteServices(bookingdetailsId);
	}

	
	/** Update Services **/
	@RequestMapping(value = "/updatebooking/{bookingdetailsId}", method = RequestMethod.PUT)
	public BookingDetails updateServices(@RequestBody BookingDetails bookingdetails, @PathVariable int bookingdetailsId)
			 {
		return customerService.updateServices(bookingdetails, bookingdetailsId);
	}	
	

	/** GET Services **/

	@RequestMapping(value = "/getbookingdetails", method = RequestMethod.GET)
	public List<BookingDetails> getServices() {
		return customerService.getServices();
	}
	
	/**  View Customer Profile **/
	@RequestMapping(value = "/getCustomerProfile/{customerId}", method = RequestMethod.GET)
	public Customer getCustomerProfile(@PathVariable int customerId) {
		return customerService.getCustomerProfile(customerId);
	}

	
	/**  Update Customer Profile **/
	@RequestMapping(value="/updateCustomerProfile/{customerId}", method = RequestMethod.PUT)
    public Customer updateCustomerProfile(@RequestBody Customer customerProfile,@PathVariable int customerId)
    {
       return customerService.updateCustomerProfile(customerProfile, customerId);
                 
    }
	
	/**  View Customer Orders **/
	
	/**  Logout **/

}
