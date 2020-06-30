package com.cg.VehicleServiceApplication.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.VehicleServiceApplication.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	@Query("SELECT e from Customer e where e.emailId=:emailId and e.password=:password")
	List<Customer> findDetails(@Param(value = "emailId") String emailId, 
			@Param(value ="password") String password);
}
