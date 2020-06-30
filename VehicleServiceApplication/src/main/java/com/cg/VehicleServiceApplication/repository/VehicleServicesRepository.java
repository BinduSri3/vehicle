package com.cg.VehicleServiceApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.VehicleServiceApplication.entities.VehicleServices;

@Repository
public interface VehicleServicesRepository extends JpaRepository<VehicleServices, Integer>{
	
//	@Query("select DISTINCT serviceName from VehicleServices")
//    public List<String> showServicenames();


	

}
