package com.crudoperation.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperation.model.Employee;



@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Long> {
  
	
   
}
